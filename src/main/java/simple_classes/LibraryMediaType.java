package simple_classes;

public class LibraryMediaType {

    String name;
    String authorOrPublisher;

    public LibraryMediaType(String name, String authorOrPublisher) {
        this.name = name;
        this.authorOrPublisher = authorOrPublisher;
    }

    @Override
    public String toString() {
        return "LibraryMediaType{" +
                "name='" + name + '\'' +
                ", authorOrPublisher='" + authorOrPublisher + '\'' +
                '}';
    }
}
