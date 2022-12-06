package Basics;
import java.util.*;
public class tabble1 {
    public static void main(String args[]) {
        Scanner sc =new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i =1;i<=y;i++){
            if(x*i<=y){
            System.out.println(x*i);
            }
        }
    }
}
