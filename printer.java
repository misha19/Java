/**
 * Created by Mehran Barzegar on 2017-12-21.
 * pluralsight tutorial
 */
public class printer {
   //access modifier

    private boolean isOn;
    private String modelNumber;

//
//    public void print() {
//        System.out.println(modelNumber);
//    }

    //constructor
    public printer(boolean isOn, String modelNumber){
        this.isOn = isOn;
        this.modelNumber = modelNumber;
    }
    public void print(int copies){
     //   System.out.println(isOn);
      //  System.out.println(modelNumber);
      //  print("I can call a private method from within another method");

        String onStatus = "";
        if(isOn)
            onStatus = "is On!";
                    else
                        onStatus = "is Off!";
        String textToPrint = modelNumber + onStatus;

        //for ( int i=0;i < copies ; i++ ){
            while (copies>0) {
                System.out.println(textToPrint);
               copies--;
            }
//            if(isOn){
//                System.out.println(modelNumber+ " is on!");
//            }
//            else {
//                System.out.println(modelNumber+ " is off!");
//            }


        }
//        switch (copies)
//        {
//            case 0 :
//                break;
//            case 1:
//                if(isOn){
//                    System.out.print(modelNumber+ " is on!");
//                }
//                else {
//                    System.out.print(modelNumber+ " is off!");
//                }
//                break;
//            case 2:
//                if(isOn){
//                    System.out.print(modelNumber+ " is on!");
//                    System.out.print(modelNumber+ " is on!");
//                }
//                else {
//                    System.out.print(modelNumber+ " is off!");
//                    System.out.print(modelNumber+ " is off!");
//
//                }
//                break;
//            default:
//                System.out.print("Number of copies are more that the " +
//                        "number that can be printed!");
//        }


          //  }

    public void printColors() {
        String[] colors = new String[] {"Red","Blue","Green","yellow","Cyan"};
        for (String currentColor : colors){

            if("Green".equals(currentColor))
                break;
         
            System.out.println(currentColor);
        }
    }

    private void print(String text){
        System.out.println(text);
    }
    public String getModelNumber() {
        return modelNumber;
    }
}