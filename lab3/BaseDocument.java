public abstract class BaseDocument implements Document {
    private String title;

    public BaseDocument(String title) {
        this.title = title;
    }

    public String getTitle() { return title; }

    @Override
    public abstract String getContent();

    @Override
    public void display() {
        System.out.println("Dokument: " + getTitle());
        System.out.println("Treść: " + getContent());
        System.out.println("---");
    }
}
