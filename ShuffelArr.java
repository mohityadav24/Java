class Arr{

public static void main(String args[]){

int[] nums = {2,5,1,3,4,7};



     int start = 0;
      int mid = 3;
      int i =0;
      while(mid < nums.length){
        nums[i++] = nums[start++];
        nums[i++] = nums[mid++];
      }
			
		
    for(int num : nums){
    System.out.print(num);
		}
}
}