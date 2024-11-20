class A{
    public void meth2(){
     System.out.println("method of class A");
     }
    }
    class B extends A{
        public void meth2(){
            System.out.println("method of class B");
        }
    }
    public class  question7{
        public static void main(String[]args){
        A a= new A();
        a.meth2();
        B b= new B();
        b.meth2();
        }
    }