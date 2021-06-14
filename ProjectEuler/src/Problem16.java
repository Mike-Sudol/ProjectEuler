import java.math.BigInteger;

public class Problem16 {
	public static void main(String[] args) {
		
		
		long n = 40;
		long k = 20;
		// n!/k!(n-k!
		System.out.println(fact(n));
		//System.out.println((fact(n)) / (fact(k) * fact(n - k)));
	}

	public static int fact(long n) {
		if (n > 1)
			n *= fact(n - 1);
		if (n == 1)
			return 1;
		return (int) n;
	}

}
