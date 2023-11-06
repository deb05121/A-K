package songStreaming;

import java.util.Objects;

public class Song {
    private String title;
    private long length;

    public Song() {

    }

    public Song(String title, long length) {
        this.title = title;
        this.length = length;
    }

    public long getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return length == song.length && Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, length);
    }
}
