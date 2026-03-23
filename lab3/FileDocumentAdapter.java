import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileDocumentAdapter implements Document{
    private TextDocument document;

    private TextDocument readDocumentFromFile(String fileName) throws IOException {
        try(Scanner scanner = new Scanner(new FileReader(fileName))) {
            if (!scanner.hasNextLine()) {
                return new TextDocument("empty file", "");
            }

            String title = scanner.nextLine();
            StringBuilder content = new StringBuilder();
            
            while(scanner.hasNextLine()) {
                content.append(scanner.nextLine());
                if(scanner.hasNextLine()) {
                    content.append("\n");
                }
            }
            return new TextDocument(title, content.toString());
        }
    }

    public FileDocumentAdapter(String fileName) throws IOException {
        this.document = readDocumentFromFile(fileName);
    }

    @Override
    public String getContent() { 
        return document.getContent(); 
    }

    @Override
    public void display() {
        document.display();
    }

}
