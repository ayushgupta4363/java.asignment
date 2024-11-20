

	        ASSIGNMENT -1


1. Write a Java program to change temperature from Celsius to Fahrenheit and vice versa.(07 Nov)

import java.util.Scanner;
class Convert{
    void method(int a){
        double k = (a*9f/5f)+32;
        System.out.println(k+" fahrenheit");
    }
}
public class Assignment1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperature in celsius");
        int a=sc.nextInt();
      Convert c=new Convert();
      c.method(a);
    }
}
    output:
    enter temperature in celsius
    36
    96.80 farenheit
    

2.Write a Java Program to check if a number is Positive or Negative.(07 Nov)

import java.util.Scanner;
class Check{
 void method(int a){
    if(a>0){
        System.out.println("positive number");
      }
      if(a<0){
        System.out.println("negative number");
      }
 }
}
public class Assignment1{
public static void main(String[]args){
  Scanner sc =new Scanner(System.in);
  System.out.println("taking input from user");
  int a=sc.nextInt();
  Check m=new Check();
  m.method(a);
 }
}
 output:
 taking input from user
 2
 positive number

3.Write a Java program to find maximum of three numbers.(09 Sept)

import java.util.Scanner;
class Maximum{
  int arr[]={23,12,67,34,35};
  int max=arr[0];
  int method(){
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
      }}
    return max;}}
public class Assignment1{
  public static void main(String[]args){
         Maximum m=new Maximum();
         System.out.println(m.method());}}

 4.Write a Java program to swap two numbers(09 Sept)
    
   import java.util.Scanner;
    class Swap{
      int arr[]={23,34,45,67,78};
      void method(){
          int temp=arr[3];
          arr[3]=arr[5];
          arr[5]=temp;
      }
    }  
    public class Assignment1{
      public static void main(String[]args){
        Swap s = new Swap();
        s.method();
        System.out.println(arr[4]); 
      }
    } 
      output:
      67

5.Write a Java program to convert miles to kilometers (07 Nov)

import java.util.Scanner;
class Convert{
    void method(int a){
        double k = a*1.60934;
        System.out.println(k+"kms");
    }
}
public class Assignment1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of miles");
        int a=sc.nextInt();
      Convert c=new Convert();
      c.method(a);
    }
}
    output:
    enter number of miles
    45
    72.405 kms

6.Write a Java program to check whether a year is leap year or not.(07 Nov)
 
import java.util.Scanner;
class Check{
 void method(int a){
    if(a>0 && a%4==0){
        System.out.println("leap year");
      }
      else{
        System.out.println("not a leap number");
      }}}
public class Assignment1{
public static void main(String[]args){
  Scanner sc =new Scanner(System.in);
  System.out.println("taking input from user");
  int a=sc.nextInt();
  Check m=new Check();
  m.method(a);
 }
}
 output:
 taking input from user
 2024
 leap year

7.Write a Java program for following grading system. Note:
 Percentage>=90% : Grade A Percentage>=80% : Grade B Percentage>=70% : Grade C Percentage>=60% : Grade D Percentage>=40% : Grade E Percentage (07 Nov)

import java.util.Scanner;
class Grades{
 void method(float p){
    if(p>=90){ System.out.println("Grade A"); }
     else if(p>=80){  System.out.println("Grade B");}
      else if(p>=70){System.out.println("Grade C"); }
      else if(p>=60){ System.out.println("Grade D");}
      else if(p>=40){ System.out.println("Grade E");}
      else if (p<40){ System.out.println("Grade F"); } }}
public class Assignment1{
public static void main(String[]args){
  Scanner sc =new Scanner(System.in);
  System.out.println("taking percentage from user");
  float p=sc.nextInt();
  Grades g=new Grades();
  g.method(p);
 }
}
 output:
 taking percentage from user
 95
 Grade A

8.Write a Java program to check whether a number is divisible
  by a number given by user.(09 Sept)

import java.util.Scanner;
class Check{
    int n=40;
    void method(int a){
       if(n%a==0){  System.out.println("Divisible");  }
         else{     System.out.println("not Divisible");      }  }}
   public class Assignment1{
   public static void main(String[]args){
     Scanner sc =new Scanner(System.in);
     System.out.println("taking input from user");
     int a=sc.nextInt();
     Check m=new Check();
     m.method(a);
    }
   }
    output:
    taking input from user
    5
    Divisible

9.Write a Java program to calculate factorial of 12.(09 Sept)
  
  import java.util.Scanner;
  class Factorial{
    int fact(int n){
        if(n<=1){ return 1; }
        else {   return n*fact(n-1); } } }
  public class Assignment1{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int a =sc.nextInt();
        Factorial c =new Factorial();
        System.out.println(c.fact(a));
    }
  }
  output:
  enter number 
  5
  60
    
10.Write a Java program for Fibonacci series (07 Nov)
 
import java.util.Scanner;
  class Fibonacci{
        int fib(int n){
            if(n<1){return 0;}
            if(n<=2){return 1;}
            else{return fib(n-1)+fib(n-2);}  } }
  public class Assignment1{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter number");
        int a=sc.nextInt();
        Fibonacci f = new Fibonacci();
        for(int i=0;i<a;i++){
          System.out.print(f.fib(i)+" ");
        }
    
        }}
        output:
        4
        0 1 1 2
        
  11.Write a Java program to reverse a number. (09 Sept)
        
     import java.util.Scanner;
        class Reverse{
          void method(int n){
              int r=0;
              while(n!=0) {
                int l= n%10;
                r*=10;
                r+=l;
                n=n/10;
              } System.out.println(r); }}
          public class Assignment1{
          public static void main(String[]args){
               Scanner sc=new Scanner(System.in);
               System.out.println("enter number");
               int n=sc.nextInt();
               Reverse a=new Reverse();
               a.method(n);  }}
               output:
               enter number 
               1234
               4321

12.Admission to a professional course is subject to the following conditions:
(a) marks in Mathematics >= 60 (b) marks in Physics >=50 (c) marks in Chemistry>=40 (d) Total in all 3 subjects >=200 (Or) Total in Maths & Physics>=150.Given the marks in the 3 subjects of n (user input)(07 Nov)
      
  import java.util.Scanner;
        class Course{
          int p;
          int c;
          int m;
            void method(){
                if(m>=60 && p>=50 && c>=40 && p+c+m>=200 ){
                     System.out.println("pass");
                }
                else {
                    System.out.println("fail"); 
                }
                }
        }
      public class Assignment1{
      public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number in physics");
            int p =sc.nextInt();
            System.out.println("enter number in chemistry");
            int c =sc.nextInt();
            System.out.println("enter number in maths");
            int m =sc.nextInt();
            Course a = new Course();
            a.method();
        }
      }
        output:
        enter number in physics
        60
        enter number in chemistry
        50
        enter number in maths
        90
        pass

13.Write a Java program to calculate the sum of natural numbers 
up to a certain range.(09 Sept)
      
     import java.util.Scanner;
       class Sum{
        int sum=0;
        int  method(int n){
                for(int i=1;i<=n;i++){
                  sum+=i;
                }
                return sum; }  }
       public class Assignment1{
        public static void main(String[]args){
             Scanner sc =new Scanner(System.in);
             System.out.println("enter number ");
             int n =sc.nextInt();
             Sum s = new Sum();
             System.out.println(s.method(n));
        }
       }
        output:
        enter number 
        5
        15

  14. Write a Java program to print all multiple of 10
      between a given interval.(09 Sept)
     
       import java.util.Scanner;
       public class Assignment1 {
	     public static void main(String []args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the Starting Integer");
	     int a=sc.nextInt();
	     System.out.println("Enter the end");
	   int b=sc.nextInt();
	   for(int i=a;i<=b;i++)
	   {
		if(i%10==0)
		{
			System.out.println(i);
		}
	  }
    }
    }
  output:
  enter the starting number
  32
  enter the end
  52
  40
  50
  
15.Write a Java program to generate multiplication table.(09 Sept)
    
  import java.util.Scanner;
       class Table{
           void method(int n){
                for(int i=1;i<=10;i++){
                  System.out.println(i*n);
                } }  }
       public class Assignment1{
        public static void main(String[]args){
             Scanner sc =new Scanner(System.in);
             System.out.println("enter number ");
             int n =sc.nextInt();
           Table t = new Table();
           t.method(n); }}
    
16. Write a Java program to find HCF of two Numbers.(07 Nov) 

import java.util.Scanner;
class Hcf{
  int method(int n1,int n2){
    while(n2!=0){
      int temp=n2;
      n2 = n1 % n2;
      n1= temp;
    } 
    return n1;
  }
}
public class Assignment1{
public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter number1");
    int n1=sc.nextInt();
    System.out.println("enter number2");
    int n2=sc.nextInt();
    Hcf h=new Hcf();
    int q=h.method(n1,n2);
    System.out.println("hcf is"+ q);
  }
}
  enter num1
  25
  enter num2
  35
  hcf is 5
  

17. write a java program to find the lcm of two numbers(7 nov).

 import java.util.Scanner;
class Hcf{
  int method(int n1,int n2){
    while(n2!=0){
      int temp=n2;
      n2 = n1 % n2;
      n1= temp;
    } 
    return n1;
  }
}
public class Assignment1{
public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter number1");
    int n1=sc.nextInt();
    System.out.println("enter number2");
    int n2=sc.nextInt();
    Hcf h=new Hcf();
    int q=h.method(n1,n2);
    System.out.println("hcf is"+ q);
    int l= (n1*n2)/q;
    System.out.println("lcm is"+ l);
  }
}
  enter number 1
  25
  enter number 2
  35
  hcf is 5
  lcm is 175
  
18. write a program to count the number of digits of an integer(09 sep). 

import java.util.Scanner;
class Counting{
  void method(int n){
    int count=0;
    if(n==0){System.out.println('1');}
    while(n!=0){
        n=n/10;
        count=count+1;
     System.out.println("count");
}}}
public class Assignment1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    Counting c=new Counting();
      c.method(n);
  }
}
  output:
  enter number 
  1213
  4
  
19. write a java program to check whether a number is palidorme or not(09 sep).

import java.util.Scanner;
public class Assignment1{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter your number");
    int a =sc.nextInt();
    int sum=0;
    int n;
  int temp=n;
  int r;
  while(n>0){
    r=n%10;
    sum=sum*10+r;
    n=n/10;
  }
  if(temp==sum){
    Sytem.out.println("palidrome");
  }
  else{
    System.out.println("not palidorme");
  }
  }
}
  output:
  121
  palidorme

20. write a java program to check whether a number is prime or not.(09 sep)

 import java.util.Scanner;
class Prime{
      void method(int n){
        int count=0;
        for(int i=1;i<=n;i++){
         if(n%i==0){count++;}
        }
        if(count ==2){
          System.out.println("prime");
        }
        else{
          System.out.println("not prime");
        }
      }
}
public class Assignment1{
  public static void main(String[]args){
     Scanner sc =new Scanner(System.in);
     System.out.println("enter your number");
     int a =sc.nextInt();
     Prime p =new Prime();
     p.method(a);
  }
}
  output:
  enter your number
  2
  prime
  
21. Write a Java program to convert a Binary Number to
    Decimal and Decimal to Binary.(07 nov)
    
import java.util.Scanner;
class Converter{

 public void binarytodecimal(int n){
  int base=1;
  int dec=0;
  int num=n;
  int temp=num;
  while(temp>0){
    int ld= temp%10;
    temp=temp/10;
    dec=dec+ld*base;
    base=base*2;
  }
  System.out.println(dec);
}
void decimaltobinary(int n){
  int arr[] =new int[100];
int i=0;
while(n>0){
  arr[i]=n%2;
  n=n/2;
  i++;
} for(int j=i-1;j>=0;j--){
  System.out.print(arr[j]);
}
  }
}
  public class Assignment1{
    public static void main(String[]args){
     Converter c=new Converter();
     System.out.println("the decimal of 1000 is");
     c.binarytodecimal(1000);
     System.out.println("the binary number of 8 is");
      c.decimaltobinary(8);
    
    }
  }
    output:
    the decimal of 1000 is 
    8
    the binary of 8 is
    1000
    
22. Write a Java program to find median of a set of numbers.(09 sep)
  
import java.util.Scanner;
    public class Assignment1{
    public static void main(String[]agrs){
      int arr[]={5,23,42,18,20,33};
      int n=arr.length;
       if(n%2==0){
        int mid=n/2;
        System.out.println((arr[mid]+arr[mid-1])/2);
       }
       else{
      System.out.println((arr[n/2])/2);
      }
    }
  }
    output:
    30

23. Write Java programs for the patterns given bellow:(09 sep)
(a) 1
    2 3 4
    5 6 7 8 9
  
import java.util.Scanner;
public class Assignment1{
  public static void main(String[]args){
    int a=1;
    for(int i=1;i<=3;i++){
      for(int j=0;j<2*i-1;j++){
        System.out.print(a++ +" ");
      }
      System.out.println();
    }
  }
}
  (b)   1
      1 1 1
    1 1 1 1 1
  1 1 1 1 1 1 1

import java.util.Scanner;
public class Assignment1{
  public static void main(String[]args){
    int a=1;
    int n=4;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
     for(int j=1;j<=2*i-1;j++){
     System.out.print(a);}
     for(int j=1;j<=n-i;j++){
     System.out.print(" ");}

    
    System.out.println();
  }
}
} 

24. Write a Java program to calculate Sum & Average 
of an integer array.(09 sep)

import java.util.Scanner;
public class Assignment1{
  public static void main(String[]args){
     int arr[]={1,2,3,4,5};
     int sum=0;
     int n=arr.length;
     for(int i=0;i<n;i++){
          sum=sum+arr[i];
     }
     System.out.println(sum);
     System.out.println(sum/n);
  }
} 
  output:
  15
  3

25. Write a Java program to implement stack using array.(07 november)

import java.util.Scanner;
class Stack{
  int arr[];
  int size;
  int top;
  Stack(int size){
    this.size=size;
    arr=new int[size];
    top=-1;
  }
  void push(int element){
    if(size-top>1){
      top++;
      arr[top]=element;}
      else{
        System.out.println("stack overflow");
      }
    }
  
  void pop(){
    if(top>=0){
      top--;
    }
    else{
      System.out.println("stack underflow");
    }
  }
  int peek(){
    if(top>=0){
      return arr[top];
    }
    else{
      System.out.println("empty");
      return -1;
    }
  }
}
public class Assignment1{
  public static void main(String[]args){
    Stack s=new Stack(5);
    s.push(2);
    s.push(3);
    s.pop();
    System.out.println(s.peek());
  }
}
  output:
  2

26. Write a Java program to implement Queue using array.(07         november)
 
  import java.util.Scanner;
 class Queue{
  int arr[];
  int size;
int qfront;
int rear;
Queue(int size){
  this.size=size;
   arr=new int[size];
  qfront=0;
  rear=0;
}
void enqueue(int data){
  if(rear==size){
    System.out.println("queuq is full");
  }
  else{
    arr[rear]=data;
    rear++;
  }
}
  int dequeue(){
    if(qfront ==rear){
      return -1;
    }
    else{
      int ans=arr[qfront];
      arr[qfront]=-1;
      qfront++;
      if(qfront==rear){
        qfront=0;
        rear=0;
      }return ans;
    }
  }
  int front(){
    if(qfront==rear){
      return -1;
    }
    else{
      return arr[qfront];
    }
  }

};
public class Assignment1{
  public static void main(String[]args){
    Queue q=new Queue(5);
    q.enqueue(2);
    System.out.println(q.front());
  }
}
output:
2

27. Write a Java program to enter n elements in an array 
and find smallest number (09 sep).

import java.util.Scanner;
public class Assignment1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter number in array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
     int min=arr[0];
     for(int i=0;i<n-1;i++){
      if(arr[i+1]<arr[i]);
      min=arr[i+1];
     }
     System.out.println(min);
  }
}
  output:
  enter size of array
  4
  enter number in array
  23 25 12 11
  11

28. Write Java program to find the sum of all odd numbers 
in a array. (09 sep)

import java.util.Scanner;
public class Assignment1{
  public static void main(String[]args){
    int arr[]={23,12,13,15,16};
    int n=arr.length;
    int sum=0;
    for(int i=0;i<n;i++){
      if(arr[i]%2!=0){
        sum=sum+arr[i];
      }
    }
    System.out.println(sum);
  }
}
  output:
  51
  

29. Write a Java program to find duplicate elements in a 1D array and find their frequency of
occurrence.(09 sep)

import java.util.Scanner;
public class Assignment1{
  public static void main(String[]args){
int arr[]={1,2,3,4,2,3};
int n=arr.length;
int frequency;   
int i;
int j;
for( i=0;i<n;i++){
  frequency =1;
  for( j=i+1;j<n;j++){
    if(arr[i]==arr[j]){
      frequency++;
    } else{
        break;}
  } i=j-1;

  if(frequency>1){
  System.out.println( arr[i]  +"with" + frequency);
  }
}}
}
output:
2 with 2
3 with 2

30. Write a Java program to print every alternate number of a 
given array.(09 sep)

import java.util.Scanner;
public class Assignment1{
  public static void main(String[]args){
    int arr={11,12,13,14,15};
    int n=arr.length;
    for(int i=0;i<n;i+=2){
      System.out.println(arr[i]);
    }
  }
}
  output:
  11 
  13
  15
  

31. Write a Java program to show 0-arguments constructor.(09 sep)
  
import java.util.Scanner;
class Constructor{
   private int i;
   public  Constructor(){
            i=10;
            System.out.println(i);
    }
  }
  public class Assignment1{
    public static void main(String[]args){
      Constructor c=new Constructor();
    }
  }
    output:
    10

32. Write a Java program to show parameterized constructor.(09 sep).

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
public class Assignment1{
  public static void main(String[]args){
    Pconstructor p=new Pconstructor(18);
    p.display();

  }
    output:
    18
}
 
33. Write a class, Commission, which has an instance variable, sales; an appropriate
constructor; and a method, commission() that returns the commission.Now write a demo class 
to test the Commission class by reading a sale from the user, using it to create a Commission 
object after validating that the value is not negative. Finally, call the commission() method to 
get and print the commission. If the sales are negative, your demo should print the message
“Invalid Input”(09 sep)

import java.util.Scanner;
class demo{
  int sales;
     demo(int x){
      sales=x;
  }
  int com(){
    int t=(int)(0.1*sales);
    return t;
  }
}
public class  Assignment1{
  public static void main(String[]args){
   Scanner sc=new Scannner(System.in);
   System.out.println("enter the sales");
   int s=sc.nextInt();
   if(s<0){
    System.out.println("invalid input");
   }
   demo c1=new demo();
   System.out.println(c1.com());
  }
}
output:
enter the sales:
2300
230






