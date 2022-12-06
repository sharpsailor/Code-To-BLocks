package Basics;
import java.util.*;
public class SimpleInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        while(true){
            int n = sc.nextInt();
            if (sum+n<0){
                break;
            }
            System.out.println(n);
            sum+=n;
        }
    }
}
