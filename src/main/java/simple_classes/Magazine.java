package simple_classes;

public class Magazine extends LibraryMediaType {

    private int edition;

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public Magazine(String name, String authorOrPublisher, int edition) {
        super(name, authorOrPublisher);
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "edition=" + edition +
                ", name='" + name + '\'' +
                ", Publisher='" + authorOrPublisher + '\'' +
                '}';
    }
}
