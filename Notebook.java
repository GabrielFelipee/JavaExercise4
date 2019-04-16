import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Show a note.
     * @param noteNumber The number of the note to be shown.
     */
    public void showNote(int noteNumber)
    {
     	if(noteNumber < 0 || noteNumber >= numberOfNotes() )
           System.out.println("Error.Try again.\n");
       else
           System.out.println(notes.get(noteNumber));
    }

    public void searchNote(String noteSearched)
    {
	for(String note: notes)
	{
	   if( note.equals(noteSearched) )
	   {
              System.out.println("The note is in the collection" + noteSearched);

	      return;
	   }
	}
	
        System.out.println("Search term not found.");
    }
}
