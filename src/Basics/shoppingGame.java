package Basics;
import java.util.*;
public class shoppingGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            long count1=0;
            long count2=0;
            for(int i = 1;count1+i<=a;i+=2){
                    count1+=i;
                
            }
            for(int i = 2;count2+i<=b;i+=2){
            
                    count2+=i;
            
            }
            if(count1>count2){
                System.out.println("Aayush");
            }else if(count2>count1){
                System.out.println("Harshit");
            }
        }
    }
}
