package days08;

public class Ex10 {

	public static void main(String[] args) {

		int x = 10, y = 20;
		
		swap(x, y);

	}// main

	private static void swap(int x, int y) {
		System.out.printf("> x=%d, y=%d\n", x, y);
		int temp = x;
		x = y; 
		y = temp;
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
	
}// class
