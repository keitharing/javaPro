package days02;

public class test {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 25;
		double height = 190.34;
		int budget = 800000;
		
		//"홍길동!! 안녕하세요 홍길동 입니다."
		System.out.printf("%1$s!! 안녕하세요 %1$s 입니다\n", name);

		//내이름은 "홍길동"이고 나이는 '25' 키는 190.34cm입니다 
		System.out.printf("내이름은 \"%1$s\"이고 나이는 '%2$d 키는 %3$.2fcm입니다\n",name, age, height);
		System.out.printf("내이름은 \"%2$s\"이고 나이는 '%1$d'이고 키는 %3$.2fcm입니다\n",age, name, height);
		
		//800,000원
		System.out.printf("%,d원\n", budget);
		
		//내이름은 "홍길동"이고 
		//나이는 '25' 
		//키는 190.34cm입니다 
		System.out.printf("내이름은 \"%2$s\"이고 \n나이는 '%1$d'이고 \n키는 %3$.2fcm입니다",age, name, height);
		
		
		// 기본형 정수형 d,s,i,l
		//		실수형 f,d
		//		논리형 boolean
		// 논리형 배열, 클래스, 인터페이스
		
		
		
		
		
		
		
		
		

	}//main

}//class
