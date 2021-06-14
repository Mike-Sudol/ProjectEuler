//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
public class Problem2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 2; i++) {
			if (fibo(i) > 4000000)
				break;
			if (fibo(i) % 2 == 0)
				sum += fibo(i);

		}
		System.out.print(sum);
	}

	public static int fibo(int n) {
		if (n == 1 || n == 2)
			return 1;
		return fibo(n - 1) + fibo(n - 2);
	}

}
