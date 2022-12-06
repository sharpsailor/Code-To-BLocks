package Basics;
import java.util.*;
public class OddEvenInDelhi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(oyes(n));
        }
    }
    public static String oyes(int n ){
            int o = 0,e =0;
            while(n!=0){
                if((n%10)%2!=0){
                o=o+n%10;
                }else{
                e=e+n%10;
                }
                n/=10;
            }
        return ((o%3==0) || (e%4==0))?"Yes" : "No";                
    }
}
