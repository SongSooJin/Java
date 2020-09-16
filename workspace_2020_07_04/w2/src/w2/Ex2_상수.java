package w2;
// // 반지름이 5인 원의 넓이와 둘레를 구하라, PI=3.141592;로 정해짐
public class Ex2_상수 {

	static final double PI=3.141592; // 상수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 5;
		double area = r*r*Math.PI; // Math.PI : class의 static의 멤버는 객체생성전에도 사용가능
		// PI = 3.14; error final상수는 변경불가
		double dul = 2*r*Math.PI;
		System.out.printf("반지름 : %d\n",r);
		System.out.printf("원의 넓이 : %8.4f\n",area);
		System.out.printf("원의 둘레 : %8.4f\n",dul);
	}

}

/*

final 상수란?
한번 값의 할당후, 변경을 원하지 않는 경우 사용
final상수명은 식별자규칙으로 대문자를 주로 사용
(강조의 의미로)
활용 : 파이값, 배열의 크기, 환율

*/