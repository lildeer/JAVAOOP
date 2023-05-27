package Task3;

public class Book {
    private String title;
    private String author;
    private Boolean available;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void displayInfo() {
        System.out.printf("%s; %s; available: %s.", title, author, available);
    }
}
