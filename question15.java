import java.util.Scanner;
class Pconstructor{
      int age;
      Pconstructor(int age){
        //this.name=name;
        this.age=age;
      }
      void display(){
        System.out.println(age);
      }

}
public class question15{
  public static void main(String[]args){
    Pconstructor p=new Pconstructor(18);
    p.display();
  }
  }
   