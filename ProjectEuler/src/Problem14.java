//n = n/2 (n is even)
//n = 3n + 1 (n is odd)
//Which starting number, under one million, produces the longest chain?

//837799
public class Problem14 {
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

		for (int i = 2; i < 1000000; i++) {
			System.out.println(i);
			long n = i;
			count = 0;
			do {
				count++;
				if ((n & 1) == 0)
					n = n >> 1;
				if (n == 1) {
					break;
				} else {
					n = 3 * n + 1;
				}
			} while (true);
			t_cache[i] = count;
			count = 0;
		}
		for (int t : t_cache)
			if (t > ans)
				ans = t;

		System.out.println(ans);
		long now = System.currentTimeMillis();
		System.out.println("Time: " + (now - before));
	}
}
