import java.util.Arrays;
class Merge{
    private int []A;
    private int []B;
    Merge(int[]A,int[]B){
     this.A=A;
      this.B=B;
    }
    public int[] mergeArrays(){
       int []C=new int[A.length+B.length];
       int i=0,j=0,k=0;
       while(i<A.length&& j<B.length){
        if(A[i]<B[j]){
            C[k++]=A[i++];
        }
        else{
            C[k++]= B[j++];
        }
       }
       while(i<A.length){
        C[k++]=A[i++];
       }
       while(j<B.length){
        C[k++]=B[j++];
       }
       return C ;
    }
}
public class question1{
    public static void main(String[]args){
        int[]A={1,3,5,7,9};
        int[]B={2,4,6,8};
        Merge m =new Merge(A,B);
       int []C= m. mergeArrays();
       System.out.println(Arrays.toString(C));
    }
}