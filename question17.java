import java.util.Scanner;
public class question17{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
   String input=sc.nextLine();
   int sum=0;
   for(int i=0;i<input.length()-1;i++){
    String twodigitnumber=input.substring(i,i+2);
    sum+=Integer.parseInt(twodigitnumber);
   }
  System.out.println(sum);
}
}