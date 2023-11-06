package songStreaming;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StreamingService streamingService = new StreamingService(true);
        Song s1 = new Song("A", 1000);
        streamingService.addSong(s1);
        Song s2 = new Song("A", 1001);
        streamingService.addSong(s2);
        Song s3 = new Song("A", 1002);
        streamingService.addSong(s3);
        Song s4 = new Song("A", 1003);
        streamingService.addSong(s4);
        Song s5 = new Song("A", 1004);
        streamingService.addSong(s5);
        Song s6 = new Song("A", 1005);
        streamingService.addSong(s6);
        Song s7 = new Song("A", 1006);
        streamingService.addSong(s7);
        Song s8 = new Song("A", 1007);
        streamingService.addSong(s8);
        Song s9 = new Song("A", 1008);
        streamingService.addSong(s9);
        Song s10 = new Song("A", 1009);
        streamingService.addSong(s10);
        Song s11 = new Song("B",1000);
        streamingService.addSong(s11);
        Song s12 = new Song("A", 1000);
        streamingService.addSong(s12);
        System.out.println(streamingService.getSongSet().size());
        streamingService.removeSong(s11);
        System.out.println(streamingService.getSongSet().size());
        streamingService.play();
    }


}
