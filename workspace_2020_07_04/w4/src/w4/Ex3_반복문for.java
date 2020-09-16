package w4;

public class Ex3_반복문for {

/*
 i : 10
 i : 20
 i : 30
 i : 40
 i : 50
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=10; i<=50; i+=10) {
			System.out.println(" i : " + i); //
		}//for	
//		System.out.println(" for문을 벗어난 후 i값 : " + i); //i는 모르는 변수		
		
//		
//		int i;
//		for(i=10; i<=50; i+=10) {
//			System.out.println(" i : " + i); //
//		}//for
		
//		System.out.println(" for문을 벗어난 후 i값 : " + i); //60
		
		
	}

}


/*
 * 반복문 for : 반복횟수가 이미 결정된 반복의 경우 주로 사용
 * for(변수=초기값; 조건식; 증감식) {
 *     문장1;
 *     믄장2;
 * }
 *...
 * 
 */