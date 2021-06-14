//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

//What is the 10 001st prime number?
//104743
public class Problem7 {
	public static void main(String[] args) {
		int n = 3;
		int sum = 1; // includes 2
		while (true) {
			if (isPrime(n))
				sum++;
			if (sum == 10001)
				break;
			n += 2;
		}
		System.out.println(n);
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
