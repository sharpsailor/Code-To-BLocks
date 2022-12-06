package Basics;
import java.util.*;
public class BostonNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prime = primeFactors(n);
        int digits =sumOfDigits(n);
        if(prime==digits){
            System.out.println("1");
        }else{
            System.out.println("0");        
        }
    }
    public static int primeFactors(int n){
        int sum=0;
     for (int i = 2; n != 1; i++)
       {
            while (n % i == 0)
            {
             sum+=sumOfDigits(i);
             n /= i;
            }
        }
        return sum;
    }
     public static int sumOfDigits(int n){
         int sum1=0;
         while(n!=0){
             int rem = n%10;
             sum1+=rem;
             n/=10;
         }
         return sum1;
     }
}
