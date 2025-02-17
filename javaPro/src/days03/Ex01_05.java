package days03;

public class Ex01_05 {

	public static void main(String[] args) {
		
		char a = 'x';
		char b;
		
		
	
		System.out.printf("a=%1$c, b=%1$C\n", a);
		
		// 'A'	=	65		'a'	=	97
		// 'B'	=	66		'b'	=	98
		// 'C'	=	67		'c'	=	99
		
		//System.out.printf("%c\n", a-32);
		
		//Type mismatch: cannot convert from int to char
		b = (char) (a - 32);
		System.out.println( b );
		
	}
	
	
	
}
