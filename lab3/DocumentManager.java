import java.util.ArrayList;
import java.util.List;

public class DocumentManager {
    private static DocumentManager instance;
    private List<Document> documents;

    private DocumentManager() {
        this.documents = new ArrayList<>();
    }

    public static DocumentManager getInstance() {
        if(instance == null) {
            instance = new DocumentManager();
        }
        return instance;
    }

    public void addDocument(Document doc) {
        documents.add(doc);
    }

    public void displayAllDocuments() {
        System.out.println("Lista dokumentów:");
        for(Document d : documents) {
            d.display();
        }
    }
}
