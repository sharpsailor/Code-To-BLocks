package Basics;
import java.util.*;
public class fToC_conversion {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int minF = sc.nextInt();
        int maxF = sc.nextInt();
        int step = sc.nextInt();
        for(int i = minF;i<=maxF;i=i+step)
        {
            
            int c =(int)((float)(5.0/9)*(int)(i-32));

            System.out.println(i+"  "+c);
        }
    }
}
