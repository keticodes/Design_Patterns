package Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Document> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(String identifier, Date creationDate, String content, boolean isProtected, String username) {
        RealDocument realDocument = new RealDocument(identifier, creationDate, content);
        Document document;

        if (isProtected) {
            document = new DocumentProxy(realDocument);
            AccessControlService.getInstance().grantAccess(identifier, username);
        } else {
            document = realDocument;
        }

        documents.put(identifier, document);

    }

    public Document getDocument(String identifier) {
        return documents.get(identifier);
    }
}