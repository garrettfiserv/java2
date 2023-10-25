public class AwesomeNumber {
    private int num;
    public AwesomeNumber(int num){
        this.num = num;
    }

    public static int add(AwesomeNumber a, AwesomeNumber b){
        return(a.getNum()+b.getNum());
    }

    public static int subtract(AwesomeNumber a, AwesomeNumber b) {
        return(a.getNum()-b.getNum());
    }

    public int getNum(){
        return this.num;
    }
}
