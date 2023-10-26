import java.util.ArrayList;

public class Calculator implements Calculatable {
    static ArrayList<String> history = new ArrayList<>();

    public Integer add(Integer a, Integer b){
        int result = a+b;
        System.out.println("Result: " + result);
        history.add(a + " + " + b + " = " + result);
        return result;
    }
    public Integer subtract(Integer a, Integer b){
        int result = a-b;
        history.add(a + " - " + b + " = " + result);
        return result;
    }
    public Integer multiply(Integer a, Integer b){
        int result = a*b;
        history.add(a + " * " + b + " = " + result);
        return result;
    }
    public Integer divide(Integer a, Integer b){
        int result = a/b;
        history.add(a + " / " + b + " = " + result);
        return result;
    }
    public String getHistory(){
        return history.toString();
    }
}
