package folders.examples;

public class Song {

    private String title;
    private String artist;
    private int length;
    private static int songsCount = 0;

    public static void sayHello() { System.out.println("Hello"); }
    public static int feetInMiles = 5280;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
        songsCount++;
        System.out.println("song count: " + songsCount);
    }

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }

    public void setArtist(String artist) { this.artist = artist; }
    public String getArtist() { return artist; }

    public void setLength(int length) { this.length = length; }
    public int getLength() { return length; }

    public int getSongsCount() { return songsCount; }

}
