import java.util.*;

class Search2D{
	
	static int [] search(int [][] arr,int target){
		
		for(int row=0;row<arr.length;row++){
			for(int col=0; col<arr[row].length;col++){
				
				if(arr[row][col] == target){
					return new int[]{row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
public static void main (String [] arg){

int[][] arr = {
              {2,3,4,5},
			  {56,77,88},
			  {33,44,34,45},
{12,32,34,55,65,77}};
int target = 34;

int [] ans = search(arr,target);

System.out.println(Arrays.toString(ans));

}
}

				  
