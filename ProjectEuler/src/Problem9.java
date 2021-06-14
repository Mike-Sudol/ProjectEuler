// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//a2 + b2 = c2

// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

//31875000

public class Problem9 {
	public static void main(String[] args) {
		int sum = 3;
		long before = System.currentTimeMillis();
		while (true) {
			out: for (int i = 3; i < i + 1; i++) {
				for (int j = 2; j < i - 1; j++) {
					for (int k = 1; k < j - 1; k++) {
						if (trip(k, j, i))
							if (i + j + k == 1000) {
								sum = i * j * k;
								break out;
							}
					}
				}
			}
			break;
		}
		long now = System.currentTimeMillis();
		System.out.println(now - before);
	}

	public static boolean trip(int a, int b, int c) {
		return (c * c == (a * a + b * b));
	}
}
