import java .util.Scanner;
import java .lang.*;
public class palindromNumber {
     public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         System.out.print(":->enter the number");
         int n=sc.nextInt();
         int r,sum=0;
         int temp=n;
         while(n>0){
           r= n%10;
           sum=(sum*10)+r;
           n=n/10;
         }
         if(temp==sum)
      System.out.println("this is palinsron number" );
      else 
      System.out.println("this is not  palinsron number" );
      
    }
}