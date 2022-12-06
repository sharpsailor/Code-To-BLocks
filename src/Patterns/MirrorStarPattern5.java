package Patterns;
import java.util.*;
public class MirrorStarPattern5 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row= 1;
        int star = 1;
        int space = n/2;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            if(row<n/2+1){
                space-=1;
                star+=2;
            }else{
                space+=1;
                star-=2;
            }
            System.out.println();
            row++;
        }
    }
}
