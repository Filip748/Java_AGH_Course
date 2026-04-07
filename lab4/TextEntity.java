import java.util.Objects;

public class TextEntity implements Cloneable {
    private String text;
    private String language;
    private int id;

    public TextEntity(String t, String l, int id) {
        this.text = t;
        this.language = l;
        this.id = id;
    }

    public String getContent() { return text; }
    public String getLanguage() {return language; }
    public int getId() { return id; }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof TextEntity t && text.equals(t.text) && language.equals(t.language);
    }

    @Override
    public String toString() {
        return "TextEntity{id=" + getId() + ", langue='" + getLanguage() + "', content='" + getContent() + "'}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, language);
    }

    @Override
    protected TextEntity clone() {
        try {
            return (TextEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Klonowanie nieudane", e);
        }
    }
}
