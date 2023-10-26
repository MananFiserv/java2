
import java.util.ArrayList;

public class AwesomeNumber {
    int number;
    public AwesomeNumber(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static int add(AwesomeNumber a, AwesomeNumber b){
        return a.getNumber()+b.getNumber();
    }
    public static int subtract(AwesomeNumber a, AwesomeNumber b){
        return a.getNumber()-b.getNumber();
    }

}
