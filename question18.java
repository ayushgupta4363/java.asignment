import java.util.Scanner;
interface Interface1{
    void meth1();
    void meth2();
}
interface Interface2{
    void meth3();
    void meth4();
}
interface Interface3{
    void meth5();
    //void meth6();
}
interface Interfaceparent extends Interface1,Interface2,Interface3{
    void meth7();
}
class Argument implements Interfaceparent{
    public void meth1(){
        System.out.println("meth1");
    }
    public  void meth2(){
        System.out.println("meth2");
    } 
    public void meth3(){
        System.out.println("meth3");
    } 
    public void meth4(){
        System.out.println("meth7");
    }
    public void meth5(){
        System.out.println("meth5");
    }
     public void meth6(){
        System.out.println("meth6");
    }
    public void meth7(){
        System.out.println("meth7");
    }
}
public class question18
{
    public static void main(String[]args){
        Argument a=new Argument();
        a.meth1();
        a.meth2();
        a.meth3();
        a.meth4();
        a.meth5();
        a.meth6();
        a.meth7(); 
    }
}