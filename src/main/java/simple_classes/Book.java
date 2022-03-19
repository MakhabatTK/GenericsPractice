package simple_classes;

public class Book  extends LibraryMediaType {

    int pages;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(String name, String authorOrPublisher, int pages) {
        super(name, authorOrPublisher);
        this.pages = pages;
    }


    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", name='" + name + '\'' +
                ", author='" + authorOrPublisher + '\'' +
                '}';
    }
}
