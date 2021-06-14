/*

The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

25164150
 */
public class Problem6 {
	public static void main(String[] args) {
		int sum1 = 0, sum2 = 0;
		int n = 100;
		for (int i = 1; i <= n; i++) {
			sum1 += Math.pow(i, 2);
		}
		for (int i = 1; i <= n; i++) {
			sum2 += i;
		}
		System.out.println(Math.pow(sum2, 2) - sum1);
	}

}
