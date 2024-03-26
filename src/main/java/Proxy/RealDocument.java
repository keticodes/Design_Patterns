package Proxy;

import java.util.Date;

public class RealDocument implements Document {
    private String identifier;
    private Date creationDate;
    private String content;

    public RealDocument(String identifier, Date creationDate, String content) {
        this.identifier = identifier;
        this.creationDate = creationDate;
        this.content = content;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        return content;
    }
}