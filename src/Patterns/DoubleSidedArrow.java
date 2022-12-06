package Patterns;
import java.util.*;
public class DoubleSidedArrow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;
        int space1= -1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j =1;
            int val1 = star ;
            while(j<=star){
                System.out.print(val1+" ");
                j++;
                val1--;
            }
            int k =1;
            while(k<=space1){
                System.out.print("  ");
                k++;
            }
            if(row>1 && row<n){

                int l = 1;
               int val2= 1;
                while(l<=star){
                System.out.print(val2+" ");
                l++;
                val2++;
                }
            }
            System.out.println();
            if(row<=n/2){
                star++;
                space-=2;
                space1+=2;
            }else{
                star--;
                space+=2;
                space1-=2;
            }
            row++;
        }
    }
}
