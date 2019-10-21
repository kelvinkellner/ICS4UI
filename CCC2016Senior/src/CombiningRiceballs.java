import java.util.*;

public class CombiningRiceballs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.nextLine();

		String line = scan.nextLine();
		String[] split = line.split(" ");

		int[] ball = new int[split.length];

		for (int i = 0; i < n; i++)
			ball[i] = Integer.parseInt(split[i]);

		boolean move = false;
		boolean done = false;

		do {
			done = true;
			do {
				move = false;
				
				for (int i = 0; i < ball.length - 1; i++) {
					if (ball[i] == ball[i + 1]) {
						ball = merge(ball, i, i + 1);
						move = true;
						done = false;
					}
				}

			} while (move);
			
			for (int i = 0; i < ball.length - 2; i++) {
				if (ball[i] == ball[i + 2]) {
					ball = merge(ball, i, i + 1, i + 2);
					i=ball.length;
					done = false;
				}
			}
		} while (!done);
		
		int max = 0;

		for (int i = 0; i < ball.length; i++) {
			if (ball[i] > max)
				max = ball[i];
		}

		System.out.println(max);

		scan.close();
	}

	public static int[] merge(int[] ball, int pos1, int pos2) {
		int[] ball2 = new int[ball.length - 1];

		for (int i = 0; i < pos1; i++)
			ball2[i] = ball[i];

		ball2[pos1] = ball[pos1] + ball[pos2];

		for (int i = pos2; i < ball2.length; i++)
			ball2[i] = ball[i + 1];

		return ball2;
	}

	public static int[] merge(int[] ball, int pos1, int pos2, int pos3) {
		int[] ball2 = new int[ball.length - 2];

		for (int i = 0; i < pos1; i++)
			ball2[i] = ball[i];

		ball2[pos1] = ball[pos1] + ball[pos2] + ball[pos3];

		for (int i = pos2; i < ball2.length; i++)
			ball2[i] = ball[i + 2];

		return ball2;
	}
}
