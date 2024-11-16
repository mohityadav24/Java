/* class Demo{
	public static void main(String srgs[]){
int n=20;
int copy=n;
int sumdigit=0,sumfact=0;
while(n>0){
int r=n%10;
sumdigit=sumdigit+r;
n=n/10;
}
// dividing the no. from 2 because we need prime factor 
for(int i=2;i<=copy;){
	
   if(copy%i==0){
	   
       if(i>9)
	 {
	    int num=i;
	    while(num>0)
		{
	     int r=num%10;
	     sumfact=sumfact+r;
	     num=num/10;
	    }
	 }
	  else{
	  sumfact=sumfact+i;
	  }
	  copy=copy/i;
	  }
	  
	  else{
	  i++;
	  }
   }
   System.out.println(sumdigit);
   System.out.println(sumfact);
}

}
*/

// by using methods finding smith number 
import java.util.*;

class demo{
	
int sumDigit(int n)
	{
	 int sum = 0;
	 while(n>0)
	 {
	  	sum+= n%10;
		n/=10;
	 }
	return sum;
	}
	
int primeFactor(int n)
	{
	int i = 2;
        int sum = 0;
        while(n>1)
	   {
		if(n%i==0)
			{
			sum = sum + sumDigit(i);
			n/=i;
			}
		 else{
			i++;
			} 
	   }
	   return sum;
	}
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		
		demo obj = new demo();
		
		int a = obj.primeFactor(n);
		int b = obj.sumDigit(n);
		
		if(a==b){
		System.out.println("Number is prime");
	    }
     		else{
		System.out.println("Number is not prime");
		}
		
		
	}
}
		
