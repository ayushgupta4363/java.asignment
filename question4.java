
class Rectangle{
    private int length;
    private int breadth;
     public Rectangle(){
        length =3;
        breadth=2;
    }

    public Rectangle(int l,int b){
    length =l;
    breadth=b;
  }
  public int getlength(){
    return length;
  }
  public int getbreadth(){
    return breadth;
  }
}
public class question4{
    public static void main(String[]args){
        Rectangle c=new Rectangle(4,5);
        System.out.println(c.getbreadth());
        System.out.println(c.getlength());
    }
}