package headFirstJava0;


class Clock{
	String time;
	
	void setTime (String t) {
		time = t;
	}
	
	String getTime() {
		return time;
	}
}

public class ClockTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Clock c = new Clock();
         
         c.setTime("1235");
         String tod = c.getTime();
         System.out.println("time : " + tod);
	}

}
