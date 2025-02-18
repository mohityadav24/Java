import java.util.*;

class MajorityElement{
	
	public static int majorityEl(int[] arr){// by Moer's voting algorithm 
		
		int el=0;
		int cnt=0;
		int n = arr.length;
		
		for(int i =0;i<n;i++){
			
			if(cnt == 0){
				cnt ++;
				el = arr[i];
			}
			else if(el == arr[i]){
				cnt++;
			}
			else cnt--;
			
		}
		
		return el;
	}


public static int majorityElByHash(int[] v){
 
int n = v.length;

HashMap<Integer,Integer> mpp = new HashMap<>();
 
for(int i =0;i<n;i++){
 int value = mpp.getOrDefault(v[i],0);
 mpp.put(v[i],value+1);
 
}

for(Map.Entry<Integer, Integer> it : mpp.entrySet()){

if(it.getValue() > (n/2)){

return it.getKey();
}
}
return -1;
}

public static void main(String []args){

int[] arr = {2,2,3,4,5,5,2,5,5,5,5,5,2};

System.out.println(majorityElByHash(arr));
System.out.println(majorityEl(arr));

}
}



