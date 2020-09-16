package w9;

public class EX14_스트링리터럴과_스트링생성자 {

	public static void main(String[] args) {

		String a = "Hello"; 
		String b = "Java"; 
		String c = "Hello";
		// == : 레퍼런스의 비교
		if(a==c) System.out.println("a==c");
		else System.out.println("a==c");
		
		// equals : 내용물의 비교
		if(a.equals(c)) System.out.println("a equals c");
		else System.out.println("a not equals c");
		
		System.out.println();
		
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Hello");
		// == : 레퍼런스의 비교
		if(d==f) System.out.println("d==f");
		else System.out.println("d!=f");
		
		// equals : 내용물의 비교
		if(d.equals(f)) System.out.println("d equals f");
		else System.out.println("d not equals f");
		
		System.out.println("---------------------------------------------");
		String s = new String("Hello"); 	// s의 스트링은 수정 불가능
		System.out.println("s : " + s);
		s  = s.concat("Java");
		System.out.println("s : " + s);
		
		String t = s.concat("Java"); 	// 스트링 s에 "Java"를 덧붙인 스트링 리턴
		System.out.println("t : " + t);
	}

}
