import java.util.Scanner;

public class Hangman {

	private static String[] words = {"terminator", "apple", "laptop", "lion", "winter", "air" };
	private static String word = words[(int) (Math.random() * words.length)];
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
	private static int count = 0;
	int choice;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : \n 1.Play the game \n 2.View game instructions /n Exit Gmae!!");

		while (count < 8 && asterisk.contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess);
		}
		sc.close();
	}

	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "*";
			}
		}

		if (asterisk.equals(newasterisk)) {
			count++;
			hangmanImage();
		} else {
			asterisk = newasterisk;
		}
		if (asterisk.equals(word)) {
			System.out.println("Correct! You win! The word was " + word);
		}
	}

	public static void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("_|_");
			System.out.println();
		}
		if (count == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("_|_");
		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("_|_");
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____");
			System.out.println("   |          |");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("_|_");
		}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____");
			System.out.println("   |          |");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("_|_");
		}
		if (count == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____");
			System.out.println("   |          |");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("_|_      /   \\");
		}
		if (count == 7) {
			System.out.println("wrong guess, try again");
			System.out.println("   ____");
			System.out.println("   |          |");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          |");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("_|_      /   \\");
		
		}
		
		if (count ==8) {
			System.out.println("GAME OVER!");
			System.out.println("_____");
			System.out.println("|             |");
			System.out.println("|            /    \\ ");
			System.out.println("|           |     |");
			System.out.println("|            \\_ _/");
			System.out.println("|              |");
			System.out.println("|            /  | \\");
			System.out.println("|              / \\");
		   System.out.println("_|_            /   \\");
		   System.out.println("GAME OVER!The Word was"+word);		
		}
	}
}