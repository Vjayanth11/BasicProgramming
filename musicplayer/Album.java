package objectorientation.musicplayer;

public class Album implements Playable {
    private String albumName;
    private Song song1;
    private Song song2;

    public Album(String albumName, Song song1, Song song2) {
        this.albumName = albumName;
        this.song1 = song1;
        this.song2 = song2;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void play() {
        System.out.println("Playing Album: " + albumName);
        song1.play();
        song2.play();
    }
}