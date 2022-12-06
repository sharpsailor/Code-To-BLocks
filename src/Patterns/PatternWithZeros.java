package Patterns;
import java.util.*;
public class PatternWithZeros {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=i;j++){
                if(j == i ||j == 1){
                    System.out.print(i+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
