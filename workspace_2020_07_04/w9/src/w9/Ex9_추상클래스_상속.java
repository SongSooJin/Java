package w9;

public class Ex9_추상클래스_상속 {

	public static void main(String[] args) {
		
		Cc c = new Cc(); // 정상
		c.show();
		Aa a = c; //업캐스팅
		a.show();
		//자녀메소드 실행
		//서브 클래스에서 슈퍼 클래스의 추상 메소드 구현(오버라이딩)
		
	}

}


abstract class Aa { // 추상 클래스
	abstract int add(int x, int y); // 추상 메소드
	void show() {System.out.println("추상 클래스의 show");}
}

abstract class Bb extends Aa { // 추상 클래스 
	void show() { System.out.println("B"); }
}


class Cc extends Aa { // 추상 클래스 구현. C는 정상 클래스
	int add(int x, int y) { return x+y; } // 추상 메소드 구현. 오버라이딩 
	void show() { System.out.println("C"); }
}
