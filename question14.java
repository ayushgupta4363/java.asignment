import java.util.Scanner;
class Employee{
    int salary;
    String name;
    int id;
    public void setdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name ");
       String name=sc.nextLine();
       this.name=name;
       System.out.println("enter id");
       int id =sc.nextInt();
       this.id=id;
       System.out.println("enter salary");
       int salary=sc.nextInt();
       this.salary=salary;
    }
    String getname(){
        return name;
    }
    int getid(){
        return id;
    }
    int getsalary(){
        return salary;
    }
}
public class question14{
    public static void main(String[]args){
        Employee harry = new Employee();
          harry.setdetails();
        System.out.println(harry.getid());
          System.out.println(harry.getname());
          System.out.println(harry.getsalary());
}
}