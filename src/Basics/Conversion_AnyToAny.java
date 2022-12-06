package Basics;
import java.util.*;
public class Conversion_AnyToAny {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int n = sc.nextInt();
        int dec = anyBaseToDecimal(b1,n);
        int val = decimalToAnyBase(b2,dec);
        System.out.print(val);
    }
    public static int anyBaseToDecimal(int b1,int n ){
        int p = 1;
        int s = 0;
        while(n!=0){
            int rem = n%10;
            s= s+(rem*p);
            p=p*b1;
            n/=10;
        }
        return s;
    }
    public static int decimalToAnyBase(int b2, int n){
            int b = 0;
            int p =1;
            while(n!=0){
                int rem = n%b2;
                b +=rem*p;
                n/=b2;
                p*=10;
            }
            return b;
    }
}
