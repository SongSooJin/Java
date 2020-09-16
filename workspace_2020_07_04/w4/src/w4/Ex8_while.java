package w4;

/*
i : 10
i : 20
i : 30
i : 40
i : 50
*/

public class Ex8_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;//초기값
		while(i<50) { // 조건식
			i+=10; //증감식
			System.out.println(" i : " + i); // 10 20 30 40 50 
		}//while
		System.out.println(" while문을 벗어난 i값 : " + i); // 50
		
	}

}
