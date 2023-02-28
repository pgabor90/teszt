public class feladat3 {

	public static void main(String args[]) {
		int number = 20;
		System.out.print("páros számok 1-től 20-ig " + number + ": ");
		for (int i = 1; i <= number; i++) {

			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
