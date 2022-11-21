import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int[] result= new int[21];
        result[0]=0;
        result[1]=1;
        for( int i=2; i<result.length; i++)
        {
         result[i]=result[i-1]+result[i-2];
        }
        for(int i=0; i<result.length;i++)
        {
            System.out.println((i+1)+" - "+result[i]);
        }

    }
}
