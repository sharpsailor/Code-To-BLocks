package Basics;
import java.util.*;
public class LCM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int n3 = n1;
                int n4 = n2;
                while(n1%n2!=0){
                    int rem = n1%n2;
                    n1 = n2;
                    n2 = rem ;
                }
                int lcm = (n3*n4)/n2;
                System.out.print(lcm);
            }
}
