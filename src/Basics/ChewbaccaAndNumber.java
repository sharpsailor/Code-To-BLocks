package Basics;
import java.util.*;
public class ChewbaccaAndNumber {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = 1;
        long sum =0;
        while(n!=0){
            long rem = n%10;
            if(rem> 4){
                if(rem != 9){
                    rem = 9-rem;
                }else if(rem == 9 && n/10 != 0){
                    rem = 0;
                }
            }
            sum+=rem*p;
             p*=10;
            n/=10;
        }
        System.out.print(sum);
    }
}
