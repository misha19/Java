/** This program calculated the <b> <ul> BMI </b> </ul> using the inputs
 * <ul>
 * <li> weight </li>
 * <li> height </li>
 * </ul>
 * see <a href="http://en.wikipedia.org/wiki/Body_mass_index">Wikipedia </a> for more 
 * information. 
 * @author Mehran Barzegar
 *  
 */
package beginningJava;

public class BMICalculator {
	
	//declare variables
	double weight;
	double height;
	double BMI;
	
	public BMICalculator( double h , double w) {
		height = h;
		weight = w; 
	}
	public double calculateBMI(){
		return weight /( height *height) ;
	}
	
	

	public static void main(String[] args) {
		BMICalculator calculator = new BMICalculator(65,1.78) ;
		double bmi = calculator.calculateBMI();
		
		//print BMI to the screen
		System.out.print("You BMI is " + bmi);

	}

}
