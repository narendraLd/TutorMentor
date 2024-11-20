public class Calculator {
    public static int sum(int a ,int b){
        return a+b;
    }public static int sub(int a ,int b){
        return a-b;
    }public static int mul(int a ,int b){
        return a*b;
    }public static double div(int a ,int b){
        return a/b;
    }public static double mod(int a ,int b){
        return a%b;
    }
    public static void main(String[] args){
        int a = 15;
        int b = 5;
        int add = sum(15,5);
        int sub = sub(15,5);
        int mul = mul(15,5);
        double div = div(15,5);
        double mod  = mod(15,5);
        System.out.println("Sum: "+add+" "+"Sub: "+sub+" Mul "+mul+" div "+div+" mod "+mod);

    }
}
