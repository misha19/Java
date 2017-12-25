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
    public void print(){
     //   System.out.println(isOn);
      //  System.out.println(modelNumber);
      //  print("I can call a private method from within another method");

        if(isOn){
            System.out.print(modelNumber+ " is on!");
        }
    }

    private void print(String text){
        System.out.println(text);
    }
    public String getModelNumber() {
        return modelNumber;
    }
}