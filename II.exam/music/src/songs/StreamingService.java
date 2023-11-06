package songs;

import java.util.HashSet;
import java.util.Set;

public class StreamingService implements MusicPlayer, Playlist {
    private Set<Song> songSet = new HashSet<>();
    private int actualSongId = 0;
    private boolean isRepeatedAllowed;

    @Override
    public void play() throws InterruptedException {
        System.out.println("It starts knocking on heaven's door");
        if (actualSongId < 10) {
            actualSongId++;
        } else {
            actualSongId = 0;
        }
        Thread.sleep(10000);
        System.out.println("The song is finished.");
        if(isRepeatedAllowed){
            play();
        } else {
            System.out.println("Good Bye!");
            stop();
        }
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
        songSet.remove(song);
    }
}
