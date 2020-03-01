package advancedJavaSix.Book;

import java.sql.Date;

public class Book {
    private final Integer id;
    private final String title;
    private final String description;
    private final String authorName;
    private final String publisherName;
    private final Date publishingDate;

    public Book(Integer id, String title, String description, String authorName, String publisherName, Date publishingDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.publishingDate = publishingDate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public Date getPublishingDate() {
        return publishingDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title);
        sb.append(", ");
        sb.append(authorName);   
        sb.append(System.lineSeparator());
        sb.append(publisherName);
        sb.append(", ");
        sb.append(publishingDate);
        sb.append(System.lineSeparator());
        return sb.toString();
    }                    
}
