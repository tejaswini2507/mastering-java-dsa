package Programs.basic;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        SumOfTwoNumber p = new SumOfTwoNumber();
        int result  = p.sum(1,2);
        System.out.println(result);
    }
    public int sum(int a ,int b){

        return a + b ;
    }
}
