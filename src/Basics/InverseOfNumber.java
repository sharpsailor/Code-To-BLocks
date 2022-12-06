package Basics;
import java.util.*;
public class InverseOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int pos =1;
		while(n!=0) {
			int rem = n%10;
			sum= (int)(sum+ pos* Math.pow(10, rem-1));
			pos++;
			n/=10;
		}
		System.out.print(sum);
    }
}
