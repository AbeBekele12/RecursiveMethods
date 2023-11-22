
package One;

public class Problem2 {
	
	public static long power(int base, int exponent) {
		if(exponent == 0)
			return 1;
		long pow = power(base, exponent /2);
		
		if (exponent % 2 ==0)
			return pow * pow;
		else 
			return base * pow * pow; // O(log(e))
		//return base *power (base, exponent -1);
	}
	
	public static void main(String[] args) {
	
		System.out.println(power(2,10));
	}
	
}
       