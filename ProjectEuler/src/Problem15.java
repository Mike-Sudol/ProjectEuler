//Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner
//How many such routes are there through a 20×20 grid?

//137846528820
public class Problem15 {
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		/*
		 * Chain Code
		 * 
		 * 
		 * String s = ""; for (int j = 1; j < 10; j++) { s += (j + ": "); for
		 * (int i = j; i != 1;) { if (i % 2 == 0) i = i / 2; else i = (3 * i +
		 * 1); s += (i + " "); } System.out.println(s); s = ""; //
		 * System.out.println(""); }
		 */

		int ans = 0;
		int count = 0;
		int[] t_cache = new int[1000000];

		for (int j = 1; j < 1000000; j++) {
			for (long i = j; i != 1;) {
				if ((i & 1) == 0)
					i >>= 1;
				else
					i = (3 * i + 1);
				count++;
			}
			t_cache[j] = count;
			count = 0;
		}
		for (int t : t_cache)
			if (t > ans)
				ans = t;

		System.out.println(ans);
		long now = System.currentTimeMillis();
		System.out.println("Time: " + (now - before));
	}

	public static int get14() {
		int ans = 1;
		int[] t_cache = new int[1000000];

		for (int i = 2; i < 1000000; i++) {
			long n = i;
			int t = 0;
			do {
				t++;
				if ((n & 1) == 0) {
					n >>= 1;
					if (n < i) {
						t += t_cache[(int) n];
						break;
					}
				} else {
					n = 3 * n + 1;
				}
			} while (true);
			t_cache[i] = t;

		}
		for (int t : t_cache)
			if (t > ans)
				ans = t;

		return ans;
	}
}
