package objectorientation.musicplayer;

public class MusicPlayerMain {
    public static void main(String[] args) {
        Song song1 = new Song("Tum Hi Ho", "Arijit Singh", 210);
        Song song2 = new Song("Bekhayali", "Sachet Tandon", 230);
        Song song3 = new Song("Kal Ho Naa Ho", "Sonu Nigam", 250);

        Album album = new Album("Bollywood Hits", song1, song2);

        playItem(song3);    
        playItem(album);    
    }

    public static void playItem(Playable item) {
        item.play();
        System.out.println("------------------------------");
    }
}
