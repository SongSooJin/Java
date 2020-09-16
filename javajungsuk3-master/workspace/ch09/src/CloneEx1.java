//// Cloneable : Maker Interface, 객체에 형광펜을 칠해서 객체와 다른 객체를 구분한다.
//
//class Point implements Cloneable {
//	int x;
//	int y;
//
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	@Override 
//	public String toString() {
//		return "x="+x +", y="+y;
//	}
//
//	public Object clone() {
//		Object obj = null;
//		try {
//			obj = super.clone();  // clone()은 반드시 예외처리를 해주어야 한다. / Object의 Clone()
//		} catch(CloneNotSupportedException e) {}
//		return obj;
//	}
//}
//
//class CloneEx1 {
//	public static void main(String[] args){
//		Point original = new Point(3, 5);
//		System.out.println(original + "\n");
//		
//		Point copy = (Point)original.clone(); // 복제(clone)해서 새로운 객체를 생성
//		System.out.println(copy + "\n" );
//		
//		System.out.println(original == copy); // false
//		
//		Point original2 = original; 		// 얕은복사
//		System.out.println(original2 == original); // true
//		
//		// 새(new) 객체를 만들고 원본 객체의 멤버변수들의 값을 새 객체에 멤버변수에 복사해 넣는다.
//		Point original3 = (Point) original.clone();		// 깊은복사 
//		System.out.println(original3 == original); // false
//		
//		
//	}
//}
