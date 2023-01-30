public class Search_2D_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{2,3,1,7,5},
				{6,8,9,17,18},
				{21,27,34,-5,11},
				{6,36,-3,-7,-8}};
		System.out.print(Search(arr,17));
	}
	public static boolean Search(int[][]arr,int item) {
		int row =0;
		int col = arr[0].length-1;
		while(row<=arr.length &&  col>0) {
			if(arr[row][col]==item) {
				return true;
			}else if(arr[row][col]>item) {
				col--;
			}else {
				row++;
			}
		}
		return false;
	}

}
