package songStreaming;

import java.util.HashSet;
import java.util.Set;

public class StreamingService implements MusicPlayer, Playlist {
    private final Set<Song> songSet;
    private int actualSongId;
    private boolean isRepeatedAllowed;

    public StreamingService(boolean isRepeatedAllowed) {
        songSet = new HashSet<>();
        actualSongId = 0;
        this.isRepeatedAllowed = isRepeatedAllowed;
    }

    public Set<Song> getSongSet() {
        return songSet;
    }

    @Override
    public void play() throws InterruptedException {
        for (Song s : songSet) {
            System.out.println("It starts " + s.getTitle());
            actualSongId++;
            Thread.sleep(s.getLength());
            System.out.println("The " + actualSongId + " song is finished.");
        }
        actualSongId = 0;
        if (isRepeatedAllowed) {
            isRepeatedAllowed = false;
            play();
        }
        System.out.println("Good Bye!");
        stop();
    }

    @Override
    public void stop() {
        System.out.println("Songs' player stops.");
    }

    @Override
    public void addSong(Song song) {
        songSet.add(song);
    }

    @Override
    public void removeSong(Song song) {
        if (songSet.size() > 0) {
            songSet.remove(song);
        } else {
            System.out.println("Song list is empty.");
        }
    }
}
