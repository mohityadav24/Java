class Demo{
public static void main(String args[]){

int n=20;
int copy=n;
int sum=0;
while(copy>9){
  while(copy>0){
       int r=copy%10;
	   sum=sum+r*r;
	   copy=copy/10;
  }
  if(sum==1){
System.out.println("Number is Happy");
}
  
  copy=sum;
  sum=0;

}


}
}