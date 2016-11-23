package week13;				// Alfonso Leone

public class MusicTest {

	public static void main(String[] args) {
		
		Album album1 = new Album ("Nirvana", "Nevermind", "1991", 12);
		Album album2 = new Album ("The Beatles", "Revolver", "1966", 14);
		Album album3 = new Album ();

		album1.displayAlbum(album1);
		album2.displayAlbum(album2);
		album3.displayAlbum(album3);
		
		album1.addTrack(album1);     //add and remove tracks methods
		album2.removeTrack(album2);
		
		System.out.println("");
		System.out.println("-------------tracks have been modified ------------------");
		System.out.println("");
		
		album1.displayAlbum(album1);
		album2.displayAlbum(album2);   //see the new value of track number
		
		
	}  // end of main

} // end of class
