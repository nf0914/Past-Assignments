// TODO: Create a playlist using the Queue class. Add javadoc for the class and
// all methods.	
/**
 * The Playlist has a constructor argument that specifies what is the maximum number of songs it can hold. 
 * If the list is already full and you try to add a new song to the list, 
 * the next song to be played (not the currently playing song) will be removed.
 * The Playlist keeps track of the current song being played and
 * also has methods to return the next song that will be played.
 * 
 * The class uses a Queue to manage the songs
 * Limits the number of songs based on specified capacity
 *
 * @author Niklas Feil-Ho
 *
 */
public class Playlist {
	private Queue<Song> songsQueue;
	private int maxSongs;
	private Song currentSong;
	private boolean currentlyPlaying;
	
/**
 * Constructs playlist that specifies the maximum number of songs
 * Intitializes empty queue to store songs 
 * 
 * @param maxSongs maximum numbers songs that can be added to playlist
 */
    public Playlist(int maxSongs) {
        // TODO: Implement this.
    	this.songsQueue = new Queue<>();
    	this.maxSongs = maxSongs;
    	this.currentSong = null;
    	this.currentlyPlaying = false;
    	
        //throw new UnsupportedOperationException("not implemented");
    }
/**
 * Adds a song to the playlist. If the playlist is already full, then
 * it removes the next song that would be played.
 * 
 * @param song The song to be added to the playlist
 */
    public void addSong(Song song) {
        // TODO: Implement this.
    	if (songsQueue.size() >= maxSongs) {
    		songsQueue.dequeue();
    	}
    	songsQueue.enqueue(song);
        //throw new UnsupportedOperationException("not implemented");
    }
/**
 * Skips to next song. If the song is paused, then it skips to the
 *next song and starts playing it.
 *
 *If no more songs, set to null
**/
    public void next() {
        // TODO: Implement this.
    	if(!songsQueue.isEmpty()) {
    		currentSong = songsQueue.dequeue();
    	} else {
    		currentSong = null;
    	}
        //throw new UnsupportedOperationException("not implemented");        
    }
/**
 * Starts playing the playlist
 * If songs is paused, it starts playing
 * 
 * Plays next song in queue if no song is playing, only if there are still songs
 */
    // Starts playing the playlist. If a current song is paused then it starts playing it.
    public void play() {
        // TODO: Implement this.
    	if(!(currentlyPlaying)) {
    		currentlyPlaying = true;
    		
    		if (currentSong== null && !songsQueue.isEmpty()) {
    			currentSong = songsQueue.dequeue();
    		}
    	}
        //throw new UnsupportedOperationException("not implemented");        
    }
/**
 * Pauses the playlist
 * Next time play() is called, it will start playing
 * the currently playing song
 */
    public void pause() {
        // TODO: Implement this.
    	if (currentlyPlaying) {
    		currentlyPlaying = false; 
    	}
        //throw new UnsupportedOperationException("not implemented");        
    }
/**
 * Returns the currently playing song if the playlist is playing
 * returns null if no song is playing or if pauses
 * @return currently playing song. Or null otherwise.
 */
    public Song getCurrentlyPlayingSong() {
        // TODO: Implement this.
    	if(currentlyPlaying) {
    		return currentSong;
    	}
    	return null;
        //throw new UnsupportedOperationException("not implemented");        
    }
}