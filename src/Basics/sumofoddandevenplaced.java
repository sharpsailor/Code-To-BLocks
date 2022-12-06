package Basics;
import java.util.*;
public class sumofoddandevenplaced {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=1,o=0,e=0;
        while(n!=0){
            int rem = n%10;
            if(p%2==0){
                o = o+ rem;
            }else{
                e =e+rem;
            }
            n=n/10;
            p++;
        }
        System.out.println(e);
        System.out.println(o);
    }
}
