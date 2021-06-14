//WARNING - not efficient

//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

//Find the sum of all the primes below two million.
//142 913 828 922
public class Problem10 {
	public static void main(String[] args) {
		long sum = 2;
		int limit = 2000000;
		long before = System.currentTimeMillis();
		for (int i = 3; i < limit; i += 2) {
			if (isPrime(i))
				sum += i;
		}
		long now = System.currentTimeMillis();
		System.out.println(now - before);
		System.out.println(sum);
	}

	public static boolean isPrime(int num) {
		if (num % 2 == 0)
			return false;
		for (int i = 3; i * i <= num; i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}