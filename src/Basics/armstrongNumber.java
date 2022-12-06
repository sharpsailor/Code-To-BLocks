package Basics;
import java.util.*;
public class armstrongNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n;
        int count=0;
        while(n1!=0){
            count++;
            n1/=10;
        }
        int sum=0;
        int n2 = n;
        while(n2!=0){
            int p =1;
            int rem = n2%10;
            for(int i =1;i<=count;i++){
                p=p*rem;
            }
            sum=sum+p;
            n2/=10;
        }
        if(n==sum){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
