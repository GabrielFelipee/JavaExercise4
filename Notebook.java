import java.util.ArrayList;

public class Notebook
{
    private ArrayList<String> notes;
	
    public Notebook()
    {
        notes = new ArrayList<String>();
    }
	
    public void storeNote(String note)
    {
        notes.add(note);
    }

    public int numberOfNotes()
    {
        return notes.size();
    }

    
    public void showNote(int noteNumber)
    {
     	if(noteNumber < 0 || noteNumber >= numberOfNotes() )
           System.out.println("Error.Try again.\n");
       else
           System.out.println(notes.get(noteNumber));
    }

    public void searchNote(String noteSearched)
    {
	int currentNote;
	    
	for(i=0; i< this.notes.size(); i++)
	{
	   currentNote = notes.get(i);
		
	   if( currentNote.equals(noteSearched) )
	   {
              System.out.println("The note is in the collection" + noteSearched);

	      return;
	   }
	}
	
        System.out.println("Search term not found.");
    }
}
