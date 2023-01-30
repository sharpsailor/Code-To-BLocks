import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i =0;i<n;i++) {
			for(int j =0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
        int x = sc.nextInt();
        System.out.println(Search(arr,x));
    }
    public static int Search(int[][] arr,int x){
        int i =0;
        int j =arr[0].length-1;
        while(i<arr.length && j>=0){
            if(x == arr[i][j]){
                return 1;
            }else if(x<arr[i][j]){
                j--;
            }else{
                i++;
            }
        }
        return 0;
    }
}
