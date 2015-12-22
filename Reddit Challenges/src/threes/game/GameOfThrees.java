package threes.game;

/**
 * @author Michael
 * 
 *         First, you enter a large random number. Then, repeatedly do the
 *         following: * If the number is divisible by 3, divide it by 3 * If
 *         it's not, either add 1 or subtract 1 (to make it divisible by 3),
 *         then divide by 3. The game stops when you reach "1"
 * 
 *         The computer currently does this itself
 * 
 *         Link to Challenge:
 *         https://www.reddit.com/r/dailyprogrammer/comments/3
 *         r7wxz/20151102_challenge_239_easy_a_game_of_threes/
 * 
 * @param num
 *            : the entered number
 */

public class GameOfThrees {
	private int num;

	public GameOfThrees(int n) {
		// comment
		num = n;
	}

	// recursive function
	public void divideByThree() {
		// may also use a while loop that terminates when num reaches 1

		// if num is equal to 1, then you are done
		if (num == 1) {
			System.out.println(num);
		}
		// if num is divisible by 3, then divide it by 3
		else if (num % 3 == 0) {
			System.out.println(num + ", +" + 0);
			num = num / 3;
			divideByThree();
		} else {
			// if num + 1 is divisible by 3
			// then add one to num and then divide it
			if ((num + 1) % 3 == 0) {
				System.out.println(num + ", +1");
				num = (num + 1) / 3;
				divideByThree();
			}
			// if num - 1 is divisible by 3
			// then subtract one from num and then divide it by 3
			else if ((num - 1) % 3 == 0) {
				System.out.println(num + ", -1");
				num = (num - 1) / 3;
				divideByThree();
			}
		}
	}

	public static void main(String args[]) {
		// used to test for each case
		// GameOfThrees t = new GameOfThrees(57465345);
		// GameOfThrees t = new GameOfThrees(31337357);
		GameOfThrees t = new GameOfThrees(100);
		t.divideByThree();
	}
}
