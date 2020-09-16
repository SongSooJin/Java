package w1;
// 산술연산자 : +,-,*,/,%(나머지를 구하는 연산자)
public class Ex2_산술연산자 {

	public static void main(String[] args) {
		System.out.println(10+3);
		System.out.println(10+3.7);
		System.out.println(10-3);
		System.out.println(10*3);
		System.out.println(10/3); // 결과: 3(정수)  = 정수와 정수의 연산의 결과는 정수이기때문에 자료형을 써준다.
		System.out.println(10/3.0); // 결과: 3.33333...(실수) 정수와 실수의 연산의 결과는 실수 =  (float)10/3
		System.out.println((float )10/3);
		System.out.println((float )10/3.0);
		System.out.println(10%3);
		// C언어 : 정수 % 정수 (O) , 정수 % 실수 (X)
		// Java : 정수 % 정수 (O) , 정수 % 실수 (O)
		System.out.println(3.14%2);
		
	}
}
