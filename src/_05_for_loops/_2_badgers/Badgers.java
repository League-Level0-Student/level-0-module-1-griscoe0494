package _05_for_loops._2_badgers;

public class Badgers {
	public static void main(String[] args) {

		for (int verse = 0; verse <= 3; verse++) {
			for (int badger = 1; badger <= 12; badger++) {
				System.out.print("badger ");
			}
			System.out.println();
			for (int mushroom = 1; mushroom <= 2; mushroom++) {
				System.out.print("mushroom ");
			}
			System.out.println();
		}
		for (int snake = 0; snake <= 5; snake++) {
			System.out.print("snake ");
		}
	}

}
