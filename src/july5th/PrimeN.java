package july5th;

public class PrimeN {// 1
	int i;
	int j;

	PrimeN(int i, int j) {// 2
		this.i = i;
		this.j = j;
	}// 2

	public int getPrimenn(int i, int j) {

		for (int i1 = 1; i1 <= 10; i1++) {
			for (j = 2; j <= i1; j++)
				if (i % j != 0) {

					return i;
				} else {
					return 0;
				}

		}
		return j;
	}
}// 1
