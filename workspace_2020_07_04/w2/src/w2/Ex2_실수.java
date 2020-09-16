package w2;/*반지름이 5인 원의 넓이와 둘레를 구해 아래처럼!, 
단 파이는 3.1415928로 하기로 함!
반지름 : x
원의 넓이 : xxx.xxxx
원의 둘레 : xxx.xxxx
*/
public class Ex2_실수 {
	static final double PI=3.1415928;//final상수 
	//사용자함수
	public static void main(String[] args) {		
		int r=5;
		double area=r*r*PI;
		//PI=3.14;//error final상수는 변경불가!
		double dul=2*r*PI;			
		System.out.printf("반지름 : %d\n",r);
		System.out.printf("원의 넓이 : %8.4f\n",area);
		System.out.printf("원의 둘레 : %8.4f\n",dul);
	}
}