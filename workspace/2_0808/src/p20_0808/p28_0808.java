package p20_0808; 
public class p28_0808 {
	public static void main(String[] args) {
		// 자료형으로 박스의 크기, 박스에 담을 수있는 데이터의 종류를 한정한다.
		
		boolean isGood = true; // true or false, 1byte
		isGood = false;
		
		char letter = 'a'; // 1글자만 저장이 가능하다. 싱글쿼테이션으로 선언해야 한다.
		
		// 정수만 취급한다.
		byte verySmallInt = 1; // 1byte
		short SmallInt = 2; // 2byte
		int integer = 3; // 4yte -21억~21억 까지 담을수 있다.
		long bigInt = 4; // 8yte
		
		// 실수를 취급한다.
		float f = 3.14F; // 4byte, 8바이트 크기의 long 자료형보다 4바이트 크기의 float 자료형의 박스가 더 큰 숫자를 담는다.
		double d= 3.14; // 8byte
		
		// literal : 원래 약속된 대로 사용하는 값 
	}
	
	
	

	
}
