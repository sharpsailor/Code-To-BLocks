package Patterns;
import java.util.*;
public class Rhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int val = 1;
        int space = n-1;
        while(row<=2*n-1){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int p = val;
            while(j<=star){
                System.out.print(p+" ");
                if(j<=star/2){
                    p++;
                }else{
                    p--;
                }
                j++;
            }
            if(row<n){
                space--;
                val++;
                star+=2;
            }else{
                space++;
                val--;
                star-=2;
            }
            row++;
            System.out.println();
        }
    }
}
