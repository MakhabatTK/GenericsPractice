public class LibraryGeneric <T> {
    T library;

    public T getLibrary() {
        return library;
    }

    public void setLibrary(T library) {
        this.library = library;
    }

    public LibraryGeneric(T library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "LibraryGeneric{" +
                "library=" + library.toString() +
                '}';
    }
}
