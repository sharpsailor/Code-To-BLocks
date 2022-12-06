package Basics;
import java.util.*;
public class DecimalToOctal {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int p =1 ;
		int sum = 0;
		while(n!=0) {
			int rem = n%8;
			sum+=rem*p;
			p= p*10;
			n = n/8;
		}
		System.out.print(sum);
    }
}
