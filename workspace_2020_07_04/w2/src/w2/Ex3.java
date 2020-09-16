package w2;
// 반지름이 5인 원의 넓이와 둘레를 구하라
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 5;
		double area = r*r*Math.PI; // Math.PI : class의 static의 멤버는 객체생성전에도 사용가능
		// PI = 3.14; error final상수는 변경불가
		double dul = 2*r*Math.PI;
		System.out.printf("반지름 : %d\n",r);
		System.out.printf("원의 넓이 : %8.4f\n",area);
		System.out.printf("원의 둘레 : %8.4f\n",dul);
//		System.out.println(Math.PI); // 3.141592653589793
//		System.out.println(Math.E); // 2.718281828459045

	}

}
