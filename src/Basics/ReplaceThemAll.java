package Basics;
import java.util.*;
public class ReplaceThemAll {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(replaceTo5(n));
    }
    public static long replaceTo5(long n){
        long sum = 0;
        long p =1;
        if(n==0){
            return 5;
        }
        while(n!=0){
            long rem = n%10;
            if(rem==0){
                rem=5;
            }
            sum+=rem*p;
            p*=10;
            n/=10;
        }
        return sum;
    }
}
