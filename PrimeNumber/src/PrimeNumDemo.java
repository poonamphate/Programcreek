import java.util.Scanner;

public class PrimeNumDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean isPrime = true;
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		
		for(int i = 2; i<num/2; i++){
			int temp = num%i;
			if(temp == 0){
				isPrime = false;
			}
			
		}
		if(isPrime){
			System.out.println(num+" is a Prime number");
		}
		else{
			System.out.println(num+" is not a Prime number");
		}
	}

}
