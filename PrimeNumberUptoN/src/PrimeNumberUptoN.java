import java.util.*;

public class PrimeNumberUptoN {
	public static void main(String[] args){
		System.out.println("find prime numners upto 20");
		List<Integer> result = findPrime(20);
		System.out.println(result);
	}
	
	public static List findPrime(int num){
		List<Integer> list = new ArrayList<>();	
		
		for(int i = 2; i< num; i++){
			boolean isPrime = true;
			for(int j = 2; j< i; j++){
				if(i%j == 0){
					isPrime = false;
				}
			}
			if(isPrime){
				list.add(i);
			}
			
		}
		return list;
	}
}
