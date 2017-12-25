/**
 * Created by me on 2017-12-21.
 */
import java.lang.String;

public class greeting {
    public static void main (String[] args){

//        printer myPrinter = new printer();
//        myPrinter.isOn = false;
//        myPrinter.modelNumber = "ABDG";
//
////        myPrinter.print("Printing... by overloading the method");
//        String theModelNumber = myPrinter.getModelNumber();
//        System.out.print(theModelNumber);

        printer myPrinter = new printer(true, "ABMD");


        myPrinter.loadPaper(3);
        myPrinter.print(4);
        myPrinter.printColors();
    }

}
