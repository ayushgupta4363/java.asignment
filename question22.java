import java.util.Scanner;
class CustomException extends Exception{
     CustomException(String message){
        super(message);
     }
}
public class question22{
    public static void main(String[]args){
     int a=10;
     int b=0;
     try{
        int c=a/b;
     }
     catch(Exception e){
        System.out.println(e.getMessage());
     }
    }
}