package Basics;
import java.util.*;
public class BinaryToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        int s = 0;
        while(n!=0){
            int rem = n%10;
            s= s+(rem*p);
            p=p*2;
            n/=10;
        }
        System.out.print(s);
    }
}
