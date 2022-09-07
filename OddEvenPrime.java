
public class OddEvenPrime {

	public static void main(String[] args) {

		int[] a = { 2, 4, 6, 8, 11, 17, 19, 21, 28 ,13};
		int countEven = 0;
		int countOdd = 0;
		int count2 = 0;
		int p = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				countEven++;
			}
			if (a[i] % 2 != 0) {
				countOdd++;
			}
			int prime = 1;
			for (int j = 2; j <= a.length - 1; j++) {

				if (a[i] % j == 0) {
					prime++;
				}

			}

			if (prime == 1) {

				count2++;

			}

			int sum = 0;
			int t = a[i];
			for (int k = 1; k < t; k++) {

				if (t % k == 0) {

					sum = sum + k;

				}

			}

			if (sum == t) {

				p++;

			}

		}

		System.out.println("The count of Even numbers=" + countEven);
		System.out.println("The count of Odd numbers=" + countOdd);
		System.out.println("The count of prime numbers=" + count2);
		System.out.println("The count of perfect numbers=" + p);
	}
}