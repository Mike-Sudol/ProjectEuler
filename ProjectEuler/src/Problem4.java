//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 * 99.

//Find the largest palindrome made from the product of two 3-digit numbers.\

//906609  913,993

public class Problem4 {
	public static void main(String[] args) {
		int pal = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = i; j < 1000; j++) {
				if (isPalindrone(i * j))
					if (pal < i * j)
						pal = i * j;
			}
		}
		System.out.println(pal);
	}

	public static boolean isPalindrone(int x) {
		int r, sum = 0, temp;
		temp = x;
		while (x > 0) {
			r = x % 10;
			sum = (sum * 10) + r;
			x = x / 10;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}
}
