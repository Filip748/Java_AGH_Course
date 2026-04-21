import java.io.*;
import java.util.Scanner;

public class FileProcessor {

    private String inputFile;
    private String outputFile;

    public FileProcessor(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public String getInputFile() {
        return inputFile;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public void processFiles() {
        try {
            String summary = processFile();
            writeSummaryToFile(summary);
        } catch (EmptyFileException e) {
            System.err.println("Error");
        }
    }

    private String processFile() throws EmptyFileException {
        StringBuilder summary = new StringBuilder();
        summary.append("Reading data from file: ").append(inputFile).append("\n");

        File file = new File(inputFile);
        if (!file.exists() || file.length() == 0) {
            throw new EmptyFileException("File is empty or does not exist");
        }

        int sum = 0;
        int lineNum = 1;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                try {
                    int value = processLine(line, lineNum);
                    summary.append("Line ").append(lineNum).append(": ").append(value).append(" (Valid)\n");
                    sum += value;
                } catch (EmptyLineException e) {
                    summary.append("Line ").append(lineNum).append(": Error - Empty line: ").append(e.getMessage()).append("\n");
                } catch (NonNumericDataException | UnexpectedCharacterException e) {
                    summary.append("Line ").append(lineNum).append(": Error - Non-numeric data: ").append(e.getMessage()).append("\n");
                } catch (InvalidDataException e) {
                    summary.append("Line ").append(lineNum).append(": Error - Invalid data: ").append(e.getMessage()).append("\n");
                }
                lineNum++;
            }
        } catch (FileNotFoundException e) {
            summary.append("File not found: ").append(e.getMessage()).append("\n");
        }

        summary.append("Total sum of valid numbers: ").append(sum);
        return summary.toString();
    }


    private int processLine(String line, int lineNum) throws EmptyLineException, NonNumericDataException, UnexpectedCharacterException {
        if (line == null || line.trim().isEmpty()) {
            throw new EmptyLineException(("Line ") + lineNum + " is empty or contains whitespace only.");
        }

        try {
            return Integer.parseInt(line.trim());
        } catch (NumberFormatException e) {
            if (line.matches(".*\\D.*")) {
                throw new NonNumericDataException("Line " + lineNum + " contains non-numeric data: '" + line + "'");
            } else {
                throw new UnexpectedCharacterException("Line " + lineNum + " contains unexpected characters: '" + line + "'");
            }
        }
    }

    private void writeSummaryToFile(String summary) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(summary);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

}

