


public class Template {
	public static void main(String[] args) {
		long before = System.currentTimeMillis();

		long now = System.currentTimeMillis();
		System.out.println(now - before);
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
	
	public static int countDivisors(int n) {
		int sum = 2;// 1 and 2
		for (int i = 3; i <= n; i++) {
			if (n % i == 0)
				sum++;
		}
		return sum;
	}
}
