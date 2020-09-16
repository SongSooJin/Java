package w9;

/*
 * 1) == 연산자 : 객체 레퍼런스 비교
 * 2) boolean equals(Object obj) :두 객체의 내용물 비교
 * 													객체의 내용물을 비교하기 위해 클래스의 멤버로 작성
 * 
 */

public class Ex12_객체의비교와_equals메소드 {

	public static void main(String[] args) {
		
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = a;
		Point d = new Point(100, 200);
		String name = "이 이";

		if(name.equals("이 이"))
			System.out.println("name equals \"이이\" ");
		if(a.equals(b))
			System.out.println("a equals b");
		if(a.equals(c))
			System.out.println("a equals c");
		if(a.equals(d))
			System.out.println("a equals d");
		
		
//		if(a == b) // false
//			System.out.println("a==b");
//		if(a == c) // true
//			System.out.println("a==c");

	}

}
