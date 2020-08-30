
public class Functions {

	public int SumFrom1toN(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("n was less than or equal to 0: " + n);
		}
		else if (n == 1) {
			return n;
		}
		else {
			return n + SumFrom1toN(n-1);
		}
	}
	
	public int Exponent(int base, int power) {
		return (int)(Math.pow(base, power));
	}
	
}
