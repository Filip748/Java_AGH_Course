public class TextDocument extends BaseDocument {
    private String content;

    public TextDocument(String title, String content) {
        super(title);
        this.content = content;
    }

    @Override 
    public String getContent() {
        return content;
    }
}
