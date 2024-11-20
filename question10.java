class Vehicle{
    protected String colour;
    protected int speed;
    public Vehicle(String colour){
        this.colour=colour;
     }
    void showdata1(){
        System.out.println("this is a vehicle class");
    }
}
class Bus extends Vehicle{
    protected int  routeNumber;
    Bus(int routeNumber,int speed,String colour){
        super(colour);
        this.routeNumber=routeNumber;
        this.speed =speed;
    }
    void showdata(){
        System.out.println("bus details");
        System.out.println("speed"+ speed);
        System.out.println("colour"+colour);
        System.out.println(" routeNumber"+routeNumber);
        }
        void showdata1(){
            System.out.println("this is a bus class");
        }

}
public class question10{
    public static void main(String[]args){
        Bus b=new Bus(100,200,"blue");
        b.showdata();
        b.showdata1();
    }
}