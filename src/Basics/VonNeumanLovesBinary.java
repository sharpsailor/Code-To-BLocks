package Basics;
import java.util.*;
public class VonNeumanLovesBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int b = 0;
            int p =0;
            while(n!=0){
                int rem = n%10;
                b =(int)(b+rem*Math.pow(2,p));
                n/=10;
                p++;
            }
            System.out.println(b);
        }
    }
}
