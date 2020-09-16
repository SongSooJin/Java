package w1;

public class EX3_변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a= 10 , b= 3; // 정수형 변수 a,b의 선언과 동시에 초기값 넣어줌
		int a,b; // 정수형 변수 a,b의 선언
		a = 10; // 값 할당
		b = 3; 
		int hap = a+b;
		// b = 3.14; error 
		// 대입연산자 = 
		// 대입연산자 우변 [ liteal 또는 변수 또는 수식]의 결과를 왼쪽변수에 저장(기억)시켜라
		// 변수 = [liteal 또는 변수 또는 수식];
		System.out.println("a: " + a); //여기서 +는 연결연산자 (add가 X)
		System.out.println("b: " + b); 
		System.out.println("10+3 =  " + a+b); 
		System.out.println("10+3 =  " + (a+b));
		System.out.println(a + " + " + b + " = "+(a+b));		
		System.out.println(a + " - " + b + " = "+(a-b));		
		System.out.println(a + " * " + b + " = "+(a*b));		
		System.out.println(a + " / " + b + " = "+(a/b));		
		System.out.println(a + " % " + b + " = "+(a%b));		
		System.out.println("10+3 =  " + hap); 
		
		
	}

}

/*
 * nbit로 표현가능 범위 : -2의 (n-1)승 ~ 2의(n-1)승-1

4byte == 4*8bits : -2(31)승 ~ 2의(31승)-1

data
1) 정수 : 소수점이 없는 수 ex) 504,0,-3949
	자료형 : byte(1) = 8bits -  short(2) - int(4) 기본 - long(8)
	출력 : %d(10진수), %o(8진수), %x(16진수) : 0~9, 10(a),11,12,13,14,15(f)

2) 실수 : 소수점이 있는 수 ex)40.3,0.0,-4052.3
	자료형 : float(4) - double(8)기본
	출력 : %f(소수점이하 6자리까지 표시), %e
	%.mf : 소수이하 m자리까지 출력
	%n.mf : 전체 n자리를 확보 후 , 소수이하 m자리까지 출력 (소수점 포함)
	
3) 문자 literal : ex) 'a', '가'
 	자료형 : char(2)
 	출력 : %c

4) 논리 literal : true, false
	자료형 : boolean
	출력 : %b

5) 문자열 literal : ex) "a", "홍 길 동", "ab c"
 	자료형 : String
 	출력 : %s 	
 	
6) 출력시
	%nd : n칸을 확보하여 오른쪽 정렬
	%-nd : n칸을 확보하여 왼쪽 정렬
	ex) %3d, %-3s, %3c
	 	
 	
식별자란? 
1) 클래스, 변수, final상수, 메소드등에 붙이는 이름
2) @,# 와 같은 특수문자, 공백 또는 탭 식별자로 X _$, 유니코드 문자, 한글 사용 가능
3) 자바 언어의 키워드는 식별자로 사용불가 , 식별자의 첫번째 문자로 숫자는 사용불가
4) _ 또는 $를 식별자 첫 번째 문자로 사용할 수 있으나 일반적으로 잘 사용하지 않는다.
5) 불린 리터럴(true, false)과 널 리터널(null)은 식별자로 사용불가
6) 길이 제한 없다. 

 */	
	
	
	