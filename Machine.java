/**
 * Created by me on 12/25/17.
 */
public class Machine {

   protected boolean isOn;

    public Machine(boolean isOn)
    {
        this.isOn = isOn;
    }
    public void TurnOn()
    {
        isOn = true;
        System.out.println("Machine is on!");
    }
    public void TurnOff()
    {
        isOn = false;
    }
}
