package fibonacciSeries;

public class fibonacciSeries {
	public static void main(String[] args){
		System.out.println("Pringt fibonacci series upto 10 numbers");
		
		//print fibonacci series recursively
		for(int i = 1; i <= 10; i++){
			System.out.print(fibonacci(i)+" ");
		}
		
		//print fibonacci series recursively
		int n1 = 1, n2 = 1, n3 = 0;
		System.out.println();
		System.out.print(n1+" "+n2);
		
		for(int i = 3; i<=10; i++){
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
			
		}
	}
	
	public static int fibonacci(int num){
		if(num == 1 || num == 2){
			return 1;
		}
		else return fibonacci(num-1)+fibonacci(num-2);
	}
}
