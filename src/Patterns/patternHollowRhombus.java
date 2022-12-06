package Patterns;
import java.util.*;
public class patternHollowRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n-1;
        for(int i =1;i<=n;i++) {
        for(int k=1;k<=s;k++){
            System.out.print("  ");
        }
			for(int j =1;j<=n;j++) {
				if(j ==1 || j==n || i==1 || i==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
            s--;
		}
    }
}
