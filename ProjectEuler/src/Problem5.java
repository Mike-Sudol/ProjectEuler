//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
//232792560

public class Problem5 {
	public static void main(String[] args) {
		int x = 0;
		boolean found = false;
		while (true) {
			if (found)
				break;
			x++;
			for (int i = 1; i < 21; i++) {
				if (x % i != 0)
					break;
				if (i == 20)
					found = true;
			}
		}
		System.out.println(x);
	}
}
