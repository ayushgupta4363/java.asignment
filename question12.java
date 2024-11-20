class Distance {
    double miles;
    Distance(double miles) {
        this.miles = miles;
    }
    void travelTime() {
    double time = miles / 60.0;
    System.out.println("Time to travel " + miles + " miles at 60 mph is : " + time + " hours");
    }
   }
   class DistanceMKS extends Distance {
      DistanceMKS(double kilometers) {
     super(kilometers / 1.609); 
    }
    void travelTime() {
        double time = miles * 1.609 / 100.0;
        System.out.println("Time to travel " + miles * 1.609 + " kilometers at 100 km/s: " + time + " seconds");
        }
        }
       public class question12{
       public static void main(String[] args) {
        DistanceMKS dist = new DistanceMKS(120);
        dist.travelTime();
        Distance dist1 = new Distance(120);
        dist1.travelTime();
       }
    }