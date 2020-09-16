package p20_0808;

public class Text2_0808 {
	// 변수 : 특정 시작에 보관하고 있는 값
	static int positionBot = 0;
	static int positionOfBag = 3;
	// 시작하기
	public static void main(String[] args) {
		moveRight();
		moveRight();
		moveRight();
		
		int result = miltilyBy2(3);
		
		System.out.println("result =" + result);
	}
	// 리턴자료형 메소드형()
	// 메소드 : 아래 코드를 수행할수 있다. 변수의 값을변경 할 수있다.
	static void moveRight() {
		System.out.println("오른쪽으로 1칸 움직인다.");
		positionBot = positionBot + 1;
		if (positionBot == positionOfBag) {
			System.out.println("성공");
		}
	}
	
	static int miltilyBy2(int x) {
		int y = x *2;
		return y;
	}
	
}
