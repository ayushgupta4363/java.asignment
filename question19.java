import java.util.Scanner;
class MyException extends Exception{
    public String toString(){
        return "i am tostring()";
    }
    public String getMessage(){
        return "i am getmessage()";
    }
}
public class question19{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a");
        int a=sc.nextInt();
        if(a<9){
            try{
                //throw new MyException();
                throw new ArithmeticException("this is an Exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("finished");
            }
            finally{
                System.out.println("finally word executed");
            }
            System.out.println(" yes finished");
        }

    }
}