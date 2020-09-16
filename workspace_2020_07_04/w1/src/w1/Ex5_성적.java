package w1;

/*
 * 국어 95, 영어 100을 변수에 할당 후, 총점과 평균을 구해 아래처럼
 * 국어 : xxx  영어 : xxx
 * --------------------
 * 총점 : xxx  평균 : xxx.x
 */


public class Ex5_성적 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본값 설정
		int 국어 = 95, 영어 = 100;
		// 처리
		int tot  = 국어 + 영어;
		// double avg = tot / 2.0;
		double avg = (double)tot / 2;
		
		// 출력
		System.out.printf("국어 : %3d\t영어 : %3d\n" ,국어,영어);
		System.out.println("-----------------------------");
		System.out.printf("총점 : %3d\t평균 : %5.1f\n" ,tot,avg);
		
	}

}
