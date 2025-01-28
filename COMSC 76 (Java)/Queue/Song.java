import java.util.Objects;

// TODO: Add javadoc for this class including @author.
// Implement the toString and equals method.
// Make sure you add javadoc for all methods.
/**
 * The Song class captures attributes such as title, genre, artist. 
 * These can be String attributes. 
 * It also implements a toString method that returns a String representation of the class.
 * 
 * @author Niklas Feil-Ho
 **/
public class Song {
    final private String title;
    final private String artist;
    final private String genre;
    final private int duration; // Duration in seconds.

    /**
     * Constructor.
     * @param title The title to use.
     * @param artist The artist of this song.
     * @param genre The genre of this song.
     * @param duration The duration of this song in seconds.
     */
    public Song(String title, String artist, String genre, int duration) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
    }
        
    /**
     * Gets the title of this song
     *  	
     * @return the title of this song.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the artist of this song
     * 
     * @return The artist for this song.
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Gets the genre of this song
     * 
     * @return The genre of the song.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Gets the duration of this song
     * 
     * @return The duration of this song in seconds.
     */
    public int getDuration() {
        return duration;
    }
    
    /**
     * Returns a string representation of the song
     * Includes: Title, Artist, Genre, Duration
     * 
     * @return a string representation of the song
     **/
    @Override
    public String toString() {
        // TODO: Implement this.
    	return "Title: " + title + ", Artist: " + artist 
    			+ ", Genre: " + genre + ", Duration: " + duration;
        //throw new UnsupportedOperationException("not implemented");
    }
    
    /**
     * Compares the song to specified object
     * True if it is not null
     * Has to have same Title, Artist, Genre, Duration as current song
     * 
     * @param that object comparing to song
     * @return true if object represents equivalent song
     */
    @Override
    public boolean equals(Object that) {
        // TODO: Implement this. Remember to handle null values correctly.
    	if (this == that) {
    		return true;
    	}
    	
    	if (that == null || !(that instanceof Song)) {
    		return false;
    	}
    	
    	Song newSong = (Song) that;
    	
    	return Objects.equals(this.title, newSong.title) && 
    			Objects.equals(this.artist, newSong.artist) &&
    			Objects.equals(this.genre, newSong.genre) &&
    			this.duration == newSong.duration;
    	
        //throw new UnsupportedOperationException("not implemented");
    }
}