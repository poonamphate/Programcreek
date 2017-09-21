/* Multiply two integers without using multiplication, division and bitwise operators, and no loops
 */
public class MultiplyIntegers {
	public static void main(String[] args){
		int result = multiply(-2, -4);
		System.out.println(result);
	}

	public static int multiply(int x, int y){
		if(x == 0 || y == 0)
			return 0;

		if(y > 0)
			return x+multiply(x, y-1);
		
		if(y < 0)
			return -multiply(x, -y);

		return -1;
		

	}


}
