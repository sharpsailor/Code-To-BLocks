package Basics;
import java.util.*;
public class print_reverse {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n!=0){
            rev = rev*10+ n%10;
            n = n/10;
        }
    System.out.println(rev);
    }
}
