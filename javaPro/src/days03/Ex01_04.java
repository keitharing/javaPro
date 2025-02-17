package days03;

public class Ex01_04 {

	public static void main(String[] args) {
		//	'\t'
		//	'\b'
		//	'\n'
		//	'\"'
		//	'%%'
		//System.out.printf("%%n\tame=\b%s\nage=%d\n", "홍길동", 20);
		//double money = 1234569.7089; 
		
		//String strMoney = String.format("₩%,.2f", money);
		//System.out.println( strMoney );
		
		
		//Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		//System.out.printf("₩%,.2f", money);
		
		String name = "홍길동";
		byte	age	= 20;
		char grade = 'A';
		//String sex = "true";
		boolean gender = true;		


		//System.out.printf(">이름:\"%1$s\", 나이:%2$d, 학점:'%3$c', 성별:%4$b", name, age, grade, gender);
		
		String result = String.format(">이름:\"%1$s\", 나이:%2$d, 학점:'%3$c', 성별:%4$b", name, age, grade, gender);
		System.out.println(result);
		
		
		
		
	}

}
