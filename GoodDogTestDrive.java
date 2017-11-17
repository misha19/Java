package headFirstJava0;

class GoodDog {
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public void setSize ( int s){
		size = s; 
	}
	
	void bark(){
		if(size > 60){
			System.out.println("Woof Woof");
		}else if (size >14) {
			System.out.println("Ruff ruff");
			
		}else {
			System.out.println("yip yip") ; 
	       } 
		}  
}

public class GoodDogTestDrive {

	public static void main(String[] args) {
		
		GoodDog one = new GoodDog();
		one.setSize(56);
		GoodDog two = new GoodDog();
		two.setSize(89);
		System.out.println("Dog one : " + one.getSize());
		System.out.println("Dog two : " + two.getSize());
		
		one.bark();
		two.bark();

	}

}
