package w9;

/*
 * 다음은 Wrapper 클래스를 활용하는 예이다. 다음 프로그램의 결과는 무엇인가?
 * 'A'--> 'a'
 */

public class WrapperEx {

	public static void main(String[] args) {

				String aa = "ABC", bb="acscsdas";
				System.out.println(aa.toLowerCase()); // abc
				System.out.println(bb.toUpperCase()); // ACSCSDAS
				
				System.out.println();
				// Character 사용
				System.out.println(Character.toLowerCase('A')); // 'A'를 소문자로 변환
				char c1='4', c2='F';
				if(Character.isDigit(c1)) // 문자 c1이 숫자이면 true
					System.out.println(c1 + "는 숫자");
				if(Character.isAlphabetic(c2)) // 문자 c2가 영문자이면 true
					System.out.println(c2 + "는 영문자");
				
				System.out.println();
				// Integer 사용
				System.out.println(Integer.parseInt("28")); // 문자열 "28"을 10진수로 변환
				System.out.println(Integer.toBinaryString(28)); // 정수 28을 2진수 문자열로 변환
				System.out.println(Integer.toHexString(28)); // 28을 16진수 문자열로 변환
				System.out.println(Integer.bitCount(28)); // 28에 대한 2진수의 1의 개수
				Integer i = new Integer(28);
				System.out.println(i.doubleValue()); // 정수를 double 값으로 변환. 28.0

				System.out.println();
				// Double 사용
				Double d = new Double(3.14);
				System.out.println(d.toString()); // Double을 문자열 "3.14"로 변환
				System.out.println(Double.parseDouble("3.14")); // 문자열을 실수 3.14로 변환

				System.out.println();
				// Boolean 사용
				boolean b = 4>3; // b는 true
				System.out.println(Boolean.toString(b)); // true를 문자열 "true"로 변환
				System.out.println(Boolean.parseBoolean("false")); // 문자열을 false로 변환

				// 박싱과 언박싱 : JDK 1.5부터 박싱과 언박싱은 자동으로 이루어지도록 컴파일됨
				Integer ten = 10; 	// 자동 박싱. Integer ten = new Integer(10);과 동일
				int n = ten; 	// 자동 언박싱. int n = ten.intValue();와 동일

	}

}
