import java.util.Scanner;

 class PrimeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        

        boolean found = false;
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println("Two prime numbers whose sum is " + n + " are: " + i + " and " + (n - i));
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("No prime numbers found whose sum is " + n);
        }
        
        scanner.close();
    }


    public static boolean isPrime(int number) {
	
	
	for(int i =2;i<number;i++){
		if(i<=1){
		return false;}
		
		if(number % i==0){
			return false;
		}
		
	}
	return false;
}
 }
