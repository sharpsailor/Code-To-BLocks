package Basics;
import java.util.*;
public class checkPrime {
    public static void main(String args[]) {
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();
        int i =2;
        int count =0;
        while(i<n){
            if(n%i==0){
                count++;
                break;
            }
            i++;
        }
        if(count>0){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}
