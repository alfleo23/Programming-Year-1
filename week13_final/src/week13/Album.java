package week13;

public class Album {

String band;
String album;
String release;
int tracks;

Album(String artistName, String albumName, String releaseDate, int noTracks) //first constructor
{
	this.band = artistName;
	this.album = albumName;
	this.release = releaseDate;
	this.tracks = noTracks;	
}

Album() // overloading
{
	band= "unknown";
	album= "unknown";  // standard parameters if no information is given
	release= "unknown";
	tracks= 00;
}

void displayAlbum (Album album)
{
	System.out.println("Band: "+ album.band+ "   Album: "+album.album+ "   Release Date: "+album.release+ "   Tracks: "+ album.tracks);
	System.out.println("----------------------------------------------------------------------------");
}

void addTrack(Album album)
{
	this.tracks = this.tracks + 1;
}

void removeTrack(Album album)
{
	this.tracks = this.tracks - 1;
}

} // end of class
