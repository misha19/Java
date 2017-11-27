package javaprog;

class Employee {
	
	//private data fields
	private int empNum;

	//public gey and set methods 
	public int getEmpNum() {
		return empNum;
	}
	
	public void setEmpNum (int emp) {
		empNum = emp ;
	}
	
} 



public class DeclareTwoEmplyee {

	public static void main(String[] args) {
	   
		Employee clerk = new Employee() ; 
		Employee driver = new Employee() ;
		clerk.setEmpNum(4323);
		driver.setEmpNum(453);
		System.out.println("Clerk number is :" + clerk.getEmpNum()+
				"drvier number is : "+ driver.getEmpNum());

	}

}
