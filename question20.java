
import java.util.Scanner;
public class question20{
    public static void main(String[]args){
        int arr[]=new int[3];
        arr[0]=7;
        arr[1]=56;
        arr[2]=6;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array index");
        int index=sc.nextInt();
        System.out.println("enter the number u want to divide");
        int num=sc.nextInt();
        try{
            System.out.println("the value of array is" + arr[index]);
            System.out.println("the value of arr/index is"+arr[index]/num);
        }
        catch( ArithmeticException e){
            System.out.println(" ArithmeticException occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some error occured");
            System.out.println(e);
        } }
}