/**
 * Created by me on 2017-12-21.
 */

public class greeting {
    public static void main (String[] args){

        printer myPrinter = new printer();
        myPrinter.isOn = false;
        myPrinter.modelNumber = "ABDG";

//        myPrinter.print("Printing... by overloading the method");
        String theModelNumber = myPrinter.getModelNumber();
        System.out.print(theModelNumber);
    }

}
