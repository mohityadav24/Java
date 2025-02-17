// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

import java.util.*;
class SingleNumber{
	
	public static int singleNum(int[] arr,int n){
		
		int ans =0;
		
		for(int item : arr){
			
			ans ^= item;
		}
	
		return ans;
		
	}
	
	
	

public static void main(String []args){

Scanner sc = new Scanner(System.in);

System.out.println("enter size of array");

int n = sc.nextInt();
int [] arr = new int[n];

System.out.println("enter element of array");
for(int i =0;i<n;i++){
	arr[i] = sc.nextInt();
}

System.out.println(singleNum(arr,n));
}

}

