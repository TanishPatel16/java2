import java.util.*;
public class Calculator implements Calculatable{
    private ArrayList<String>arr;
    public Calculator(){
        arr = new ArrayList<>();
    }
    public Integer add(Integer number1, Integer number2){
        arr.add(Integer.toString(number1) + " + " + Integer.toString(number2) + " = " + Integer.toString(number1+number2));
        return number1 + number2;
    }
    public Integer subtract(Integer number1, Integer number2){
        arr.add(Integer.toString(number1) + " - " + Integer.toString(number2) + " = " + Integer.toString(number1-number2));
        return number1 - number2;
    }
    public Integer multiply(Integer number1, Integer number2){
        arr.add(Integer.toString(number1) + " * " + Integer.toString(number2) + " = " + Integer.toString(number1*number2));
        return number1 * number2;
    }
    public Integer divide(Integer number1, Integer number2){
        arr.add(Integer.toString(number1) + " / " + Integer.toString(number2) + " = " + Integer.toString(number1/number2));
        return number1 / number2;
    }

    public String getHistory(){
        String listString = String.join(", ", this.arr);
        return "[" + listString + "]";
    }
}
