package simple_classes;

public class Video extends LibraryMediaType {

    int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Video(String name, String authorOrPublisher, int duration) {
        super(name, authorOrPublisher);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Video{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + authorOrPublisher + '\'' +
                '}';
    }
}
