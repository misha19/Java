/**
 * Created by me on 2017-12-21.
 */
public class printer {
    public boolean isOn;
    public String modelNumber;

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
        System.out.println(isOn);
        System.out.println(modelNumber);
    }

    public void print(String text){
        System.out.println(text);
    }
    public String getModelNumber() {
        return modelNumber;
    }
}