package w9;

public class Ex13_Wrapper객체의_활용 {

	public static void main(String[] args) {
	
		// Wrapper 객체에 들어 있는 기본 타입 값 알아내기
//		Integer i = new Integer(10);
//		int ii = i.intValue();  // intValue() : Integer 객체에서 int형 값을 뽑아 내는 메소드
//		System.out.println("ii : "+ ii); // ii = 10
//		
//		Character c = new Character('c');
//		char cc = c.charValue(); 	// charValue() : character 객체에서 char형 값을 뽑아 내는 메소드	
//		System.out.println("cc : "+ cc); // cc = 'c' 
//		
//		Boolean b = new Boolean(true);
//		boolean bb = b.booleanValue(); 		// booleanValue() : boolean 객체에서 boolean형 값을 뽑아 내는 메소드		
//		System.out.println("bb : "+ bb); 	// bb = true

		//문자열을 기본타입으로 반환
//		int i = Integer.parseInt("123"); // parseInt() : String형 객체에서 int형 값을 뽑아 내는 메소드
//		System.out.println("i : " + i);// i = 123
//		
//		boolean b = Boolean.parseBoolean("true"); 	
//		System.out.println("b : "+ b);// b = true
//		
//		double d = Double.parseDouble("3.141592"); 
//		System.out.println("d : " + d);// d = 3.141592
		
		//기본 타입 값을 문자열로 변환
		String s1 = Integer.toString(123); 	// 정수 123을 문자열 "123" 으로 변환
		System.out.println("s1 : " + s1);// s1 = 123
		
		String s2 = Integer.toHexString(123); 	// 정수 123을 16진수의 문자열 "7b"로 변환
		System.out.println("s2 : " + s2); // s1 = 7b
		
		String s3 = Double.toString(3.14); 	// 실수 3.141592를 문자열 "3.141592"로 변환
		System.out.println("s3 : " + s3); // s3 = 3.141592

		String s4 = Character.toString('a'); 	// 문자 ‘a’를 문자열 "a"로 변환
		System.out.println("s4 : " + s4); // s4 = a

		String s5 = Boolean.toString(true); 	// 불린 값 true를 문자열 "true"로 변환
		System.out.println("s5 : " + s5); // s5 = true

	}

}
