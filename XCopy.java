package headFirstJava0;

public class XCopy {

	public static void main(String[] args) {

		
		int oring = 42; 
		XCopy x = new XCopy();
		
		int y = x.go(oring);
		
		System.out.println(oring + " " + y );

	}
	
	int go (int arg) {
		arg = arg*2; 
		return arg;
		
	}

}
