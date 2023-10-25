public class AwesomeNumber {
    private int num;

    public AwesomeNumber(int num){
        this.num = num;
    }

    public void setAwesomeNumber(int num){
        this.num = num;
    }

    public int getAwesomeNumber(){
        return this.num;
    }
    public static int add(AwesomeNumber num1, AwesomeNumber num2){
        return num1.getAwesomeNumber() + num2.getAwesomeNumber();
    }

    public static int subtract(AwesomeNumber num1, AwesomeNumber num2){
        return num1.getAwesomeNumber() - num2.getAwesomeNumber();
    }

}
