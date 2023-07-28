package in.kkw.library;
import in.bkcmet.library.*;

public class FacultyExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Library l=new Library();
		//public
		l.libraryName="Met-Library";
		l.displayPublic();
		
		/* userId and displayPrivate method is private so 
		 * we can't access into another package or class only we can
		 * access inside same class 
		 */
		//l.userId=1234;
		//l.displayPrivate();
		
		
		
		/* bookName and displayDefault method is default we can
		 * access into another package only we can access with in the same 
		 * package*/
		
		//l.bookName="Java";
		//l.displayDefault();
		
		
		
		
		
	}

}
