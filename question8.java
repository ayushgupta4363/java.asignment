
class Parent{
	 void display() {
		System.out.println("Method of parent class");
	}
}
class Child extends Parent{
	void display(){
		System.out.println("Display method of child class");
	}
}
public class question8 {
	public static void main(String []args){
		Parent P1 = new Parent();
		Parent obj= new Child();
		Child C1 =new Child();
		P1.display();
		obj.display();
		C1.display();
		
	}

}
