package headFirstJava0;


class Books {
	String title;
	String author;
}
public class BooksTestDrive {

	public static void main(String[] args) {
	
	Books[] myBooks = new Books[3];
	int x= 0 ; 
	
	myBooks[0].title = "The Grapes of Java"; 
	myBooks[1].title= "The Java guide to the galaxy";
	myBooks[2].title = "The Java and the lord of the rings";
	myBooks[0].author = "bob";
	myBooks[1].author = "Jack";
	myBooks[2].author = "Ian";
	
	while ( x<3 )  {
		System.out.println(myBooks[x].title);
		System.out.print(" by " );
		System.out.println(myBooks[x].author);
		x = x+1;
	}
	}

}
