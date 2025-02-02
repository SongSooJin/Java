package w10;



/*
 * 배열의 범위를 벗어나 원소를 접근하는 예외 처리
 * ArrayIndexOutOfBoundsException 예외
 * 
 */

public class Ex9_예외처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray [] = new int[5];

		try {
			intArray[3] = 10; // 예외 발생하지 않음
			intArray[6] = 5; // 예외 발생
		}
		// ArrayIndexOutOfBoundsException
		catch(ArrayIndexOutOfBoundsException e) { // 객체 e에 예외 정보가 넘어옴
			System.out.println("e : " + e);// java.lang.ArrayIndexOutOfBoundsException: 6
			System.out.println("배열의 범위를 초과하여 원소를 접근하였습니다.");
		}
		
	}

}
