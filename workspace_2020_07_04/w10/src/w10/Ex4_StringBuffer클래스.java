package w10;

/*
 * StringBuffer
 * 1) 가변 스트링을 다루는 클래스
 * 2) String 클래스와 달리 문자열 변경 가능
 *      가변 크기의 버퍼를 가지고 있어 문자열 수정 가능
 * 3) 문자열의 수정이 많은 작업에 적합
 * 
 */

public class Ex4_StringBuffer클래스 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");

		sb.append(" is pencil."); 	
		// append() : 문자열을 추가 
		// sb = "This is pencil."
		System.out.println("sb : " + sb);
		
		sb.insert(7, " my"); 		
		// insert(인덱스번호,"추가할 문자열 삽입") : 번호자리에 문자열 추가
		// sb = "This is my pencil."
		System.out.println("sb : " + sb);
		
		sb.replace(8, 10, "your");
		// replace(인덱스번호,인덱스번호,"대체할 문자열") : 인덱스번호~인덱스번호까지 대체할 문자열 삽입
		// sb = "This is your pencil."
		System.out.println("sb : " + sb);
		
		System.out.println(sb); 	// "This is your pencil." 출력


	}

}
