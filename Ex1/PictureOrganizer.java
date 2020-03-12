import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class PictureOrganizer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PictureOrganizer
{
     // An ArrayList for storing music tracks.
    private ArrayList<Picture> pictures;
    // A player for the music tracks.
    private PicturePlayer player;
    // A reader that can read music files and load them as tracks.
    private PictureReader reader;
    
    private int indexPictureDisplayed = -1;

    /**
     * Constructor for objects of class PictureOrganizer
     */
    public PictureOrganizer()
    {
        pictures = new ArrayList<>();
        player = new PicturePlayer();
        reader = new PictureReader();
        readLibrary("pictures");
        System.out.println("Picture library loaded. " + getNumberOfPictures() + " pictures.");
        System.out.println();
        
    }
    
    private void readLibrary(String folderName)
    {
        ArrayList<Picture> tempPictures = reader.readPictures(folderName, ".jpg");
        for(Picture picture : tempPictures) {
            addPicture(picture);
        }
    }

    public void addPicture(Picture picture)
    {
        pictures.add(picture);
    }
    
    /**
     * Return the number of tracks in the collection.
     * @return The number of tracks in the collection.
     */
    public int getNumberOfPictures()
    {
        return pictures.size();
    }
    
    public void showFirstPicture(){
        if(pictures.size() > 0) {
            player.playPicture(pictures.get(0).getPicturePath());
            indexPictureDisplayed = 0;
        }
    }
    
    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean indexValid(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        boolean valid;
        
        if(index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index >= pictures.size()) {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }
    
    public void showPicture(int index)
    {
        if(indexValid(index)) {
            Picture picture = pictures.get(index);
            player.playPicture(picture.getPicturePath());
            indexPictureDisplayed = index;
        }
    }
    
    public void lectureAleatoire(){
        //A développer
    }
    
    public void next(){
        //A développer
    }
    
    public void previous(){
        //A développer
    }
}
