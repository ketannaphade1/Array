
public class CountOddEven {
	/*
	 * 5.An Array Contain different numbers you have to find how many are even,
	 * odd, perfect and prime
	 */

	public static void main(String[] args) {

		int countEven = 0;
		int countOdd = 0;
		int countPrime = 0;
		int countPrimeNumber = 0;

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		for (int i = 0; i < a.length; i++) {

			if (i % 2 == 0) {

				countEven++;
			}

			if (i % 2 != 0) {

				countOdd++;
			}
		
				for (int j = 0; j < a.length; j++) {

					if ((a[i] % j) == 0) {

						countPrime++;
					}
					if (countPrime == 2) {

						countPrimeNumber++;
					}

			}

		}

		System.out.println("The Even number count=" + countEven);
		System.out.println("The Odd number count=" + countOdd);
		System.out.println("The Prime number count=" + countPrimeNumber);

	}
}
