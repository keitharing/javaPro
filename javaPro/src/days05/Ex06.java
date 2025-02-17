package days05;

public class Ex06 {

	public static void main(String[] args) {

		int i = 0;
		int sum = 0;

		while (true) {
			if (i == 11)	break;
			if (i == 10)
				System.out.printf("%d+", i);

			sum += i;
		}

		System.out.printf("=%d", sum);

	}// maina

}// class
