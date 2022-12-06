package Basics;
import java.util.*;
public class printPrimes {
    public static void main(String args[]) {
        // Your Code Hereint 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =2;i<=n;i++){
            boolean flag = true;
            for(int j = 2;j<i;j++)
            {
                if(i%j==0){
                    flag = false;
                }
            }
                if(flag)
                    System.out.println(i);
        }
    }
}
