package Basics;
import java.util.*;
public class Quadratic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    
        int d = ((b*b)-(4*a*c));
        int sqrt =(int)(Math.sqrt(d));
        if(d>0){
            int r1 = ((-b + sqrt)/(2*a));
            int r2 = ((-b - sqrt)/(2*a));
            System.out.println("Real and Distinct");
            System.out.println(r2+" "+r1);
        }else if(d==0){
            int r = -b/(2*a);
            System.out.println("Real and Equal");
            System.out.println(r+" "+r);
        }else if(d<0){
            System.out.println("Imaginary");
        }
        }
}
