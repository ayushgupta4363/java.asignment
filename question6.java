import java.util.Scanner;
class Calculator{
    int product(int a,int b){
        return a*b;
    }
    int product(int a,int b,int c){
        return a*b*c;
    }
}
public class question6{
    public static void main(String[]args){
        Calculator c1=new Calculator();
        System.out.println(c1.product(2,4));
        System.out.println(c1.product(2,4,2));
    }
}