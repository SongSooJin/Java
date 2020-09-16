package w8;
/*
 * 가비지
	가리키는 레퍼런스가 하나도 없는 객체
	더 이상 접근할 수 없어 사용할 수 없게 된 메모리
	
	가비지 켈렉션
	자바 가상 기계의 가비지 컬렉터가 자동으로 가비지 수집, 반환

 */
public class Ex6_가지비의_생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		a = null; 
		d = c;
		c = null;
		e = c;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		System.out.println("e : "+e);

	}

}
