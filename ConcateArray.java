class Arr {


public static int[] getConcatenation(int[] arr){
	
	int n = arr.length;
	
	int[] ans = new int[2*n];
	
	for(int i =0;i<n;i++){
		
		ans[i] = arr[i];
	}
	for(int i=0;i<n;i++){
		ans[i+n] = arr[i];
	}
	
	return ans;
}


public static void main(String args[]){

int [] arr = {1,2,1};

System.out.println(getConcatenation(arr));

}
}
