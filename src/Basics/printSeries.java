package Basics;
import java.util.*;
public class printSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i =1;
        while(n1>0){
            if((3*i+2)%n2!=0){
                System.out.println(3*i+2);
                n1--;
            }
            i++;
        }
    }
}
