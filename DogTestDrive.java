package headFirstJava0;


class Dog{
	int size;
	String name;
	
  /*	void bark(){
		if(size > 60){
			System.out.println("Woof Woof");
		}else if (size >14) {
			System.out.println("Ruff ruff");
			
		}else {
			System.out.println("yip yip") ; 
	       } 
		}  */
	void bark(int numOfBarks) {
		while (numOfBarks > 0){
			System.out.println("roof"); 
			numOfBarks = numOfBarks - 1;
					
		}
	}
}



public class DogTestDrive {

	public static void main(String[] args) {
		
		Dog one = new Dog();
		one.size =12; 
		Dog two = new Dog(); 
		two.size = 90 ; 
		Dog three = new Dog();
		three.size = 59;
		
		one.name = ("Ronny");
		
		
		one.bark(4); 
		two.bark(3);
		three.bark(1);
       
		System.out.println("Call the dog one by its name : " + one.name); 
	}

}
