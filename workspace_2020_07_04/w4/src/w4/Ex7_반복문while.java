package w4;

/*
 i : 10
 i : 20
 i : 30
 i : 40
 i : 50
 */

public class Ex7_반복문while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		for(int i=10; i<=50; i+=10) {
//			System.out.println(" i : " + i);
//		}//for	
		int i=10;//초기값
		while(i<=50) { // 조건식
			//i+=10;
			//System.out.println(" i : " + i); // 20 30 40 50 60 
			System.out.println(" i : " + i); // 10 20 30 40 50
			i+=10; //증감식
		}//while
		System.out.println(" while문을 벗어난 i값 : " + i); // 60
		
		
		
		
	}

}

/*
 * while,do~while : 반복횟수가 사용자에 의해 결정되는 경우 주로 사용
 * while(조건식) {
 * 문장1;
 * 문장2;
 * }
 * 
 * 
 */
