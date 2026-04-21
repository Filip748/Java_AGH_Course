
class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

class EmptyLineException extends InvalidDataException {
    public EmptyLineException(String message) {
        super(message);
    }
}

class NonNumericDataException extends InvalidDataException {
    public NonNumericDataException(String message) {
        super(message);
    }
}

class UnexpectedCharacterException extends InvalidDataException {
    public UnexpectedCharacterException(String message) {
        super(message);
    }
}

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}
