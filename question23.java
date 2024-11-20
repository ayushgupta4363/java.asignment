import java.util.Scanner;

class TooHotException extends Exception{
    public TooHotException(String message){
        super(message);
    }
}
class TooColdException extends Exception{
    public TooColdException(String message){
        super(message);
    }
}
public  class question23{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter tempertaure in celsius");
        int a=sc.nextInt();
            if(a>35){
                    throw new TooHotException("too hot");
            }
            else if(a<5){
                throw new TooColdException("too cold");
            }
            else{
                double fahrenheit= (a*9)/5 +32;
                System.out.println("temp in fahrenheit is"+ fahrenheit);
            }
         }

        
    }
