package w10;

/*
 * Math
 * 
 * 기본 산술 연산 메소드를 제공하는 클래스
 * 모든 메소드는 static으로 선언
 * 클래스 이름으로 호출 가능
 * random()은 0보다 크고 1.0보다 작은 실수 난수 발생
 * 
 * Math.random() 메소드로 난수 발생
 * 0.0 < Math.random() < 1.0 메소드로 실수 난수 발생
 * 1 <= 정수난수 <= 100
 * 
 * 0.0*100 < Math.random()*100 < 1.0*100
 * --> 0.0 < Math.random()*100 < 100.0 
 * 
 * 1.0 < Math.random()*100+1 < 101.0
 * 
 * (int)1.0 <(int) (Math.random()*100+1) < (int)101.0
 * --> 1 < (int) (Math.random()*100+1) < 100
 * 
 * 공식 : a <= 정수난수 <= b
 * (int)(Math.random()*(b-a+1) +a)
 * 
 * 123 <= 정수난수 <= 456
 * (int)(Math.random()*(456-123+1) +123)
*/

public class Ex6_Math클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // 1에서 100까지의 랜덤 정수 10개를 발생시키는 코드 사례
		for(int i=0; i<=10; i++) {
			//int n = (int)(Math.random()*100 + 1); // 1~100까지의 랜덤 정수 발생
			int n = (int)(Math.random()*(100-1+1)+1);
			System.out.println(n); //10개의 랜덤 정수 출력
		}// for


	}

}
