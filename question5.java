
import java.util.Scanner;
class Parent{
    int x;
      public int getX(){
        return x;
      }
    public void setX(int x){
    System.out.println("hey baby");
    this.x=x;
    }
}
class Child extends Parent{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
public class question5{
    public static void main(String[]args){
    Child c=new Child();
   c.setX(4);
   System.out.println(c.getX());
    }
}