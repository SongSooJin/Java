package w10;

import java.util.Random;

public class Ex7_Math클래스_난수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		for(int i=0; i<=10; i++) {
			int n = r.nextInt(); 	// 음수, 양수, 0 포함, 자바의 정수 범위 난수 발생
			System.out.println(n); //10개의 랜덤 정수 출력
		}// for
		System.out.println("-------------------------------------------");
		for(int i=0; i<10; i++) {
			int m = r.nextInt(100); // 0에서 99 사이(0과 99 포함)의 정수 난수 발생
			System.out.println(m); //10개의 랜덤 정수 출력
		}// for
	


	}

}
