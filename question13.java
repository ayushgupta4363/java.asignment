interface A{
    void ring();
}
interface B{
  void swim();
}
class Cat implements A,B{
    public void ring(){
        System.out.println("ringing");
    }
    public void swim(){
        System.out.println("swimming");
    }
}
public class question13{
    public static void main(String[]args){
      Cat c=new Cat();
      c.ring();
      c.swim();
    }
}
