package javaprog;


public class DemoRaise {

	public static void main(String[] args) {
		double mySalary = 200.00; 
		double moneyAmount = 800.00 ;
		System.out.println("Demonstrating some raises");
		PredictRaise(400.00);
		PredictRaise(mySalary);
		PredictRaise(moneyAmount);
		

	}

	private static void PredictRaise(double moneyAmount) {
		
		double newAmount ; 
		final double RAISE = 1.10 ; 
		newAmount = moneyAmount*RAISE ; 
		System.out.println("The raised salary is : " + newAmount);
	}
	
	

}
