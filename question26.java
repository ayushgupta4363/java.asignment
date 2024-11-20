import java.util.Scanner;
class NegativeException extends Exception{
    public NegativeException(String message){
        super(message);
    }
}
public class question26{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ener name");
        String name=sc.nextLine();
        System.out.println("enter age");
        int a=sc.nextInt();
        if(a<0){
            try{
                  throw  new NegativeException("Exception:");
            }
            catch(Exception e){
            System.out.println(e.getMessage());
            }

        }
        

    }
}