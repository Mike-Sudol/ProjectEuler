//What is the largest prime factor of the number 600,851,475,143 ?
//6857
public class Problem3 {
	public static void main(String[] args) {
		long big = 600851475143L;
		long prime = 0L;
		for (long i = 2; i * i < big; i++) {
			if (big % i == 0)
				if (isPrime(i)) {
					prime = i;
					System.out.println(prime);
				}
		}
	}

	public static boolean isPrime(long num) {
		if (num % 2 == 0)
			return false;
		for (int i = 3; i * i <= num; i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
