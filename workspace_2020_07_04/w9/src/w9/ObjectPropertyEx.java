package w9;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	
	//Object클래스의 String toString(){}을 무시
	public String toString() {
		String ss = "("+x+","+y+")";
		return ss;
	}
	
	//Object클래스의 boolean equals(another Object){}을 무시
	public boolean equals(Point rb) {
//		if(x==rb.x && y==rb.y) 
//			return true;
//		else
//			return false;
		return (x==rb.x && y==rb.y)?true:false;
		}
}


public class ObjectPropertyEx {

	public static void main(String[] args) {
		Point p = new Point(2,3);
		Point q = new Point(12,13);
		System.out.println(p.getClass()); 	//class w9.Point
		System.out.println(p.getClass().getName()); 	// w9.Point // 클래스 이름 
		System.out.println(p.hashCode()); 	// 366712642 // 해시 코드 값
		System.out.println(q.hashCode()); 	// 1829164700 // 해시 코드 값
		System.out.println(p.toString()); 		// w9.Point@15db9742 // 객체의 문자열 // toString을 정의후(메소드 오버라이딩후)-->(2,3)	
		
		//‘객체 + 문자열’ -> ‘객체.toString() + 문자열’로 자동 변환
		String s = q.toString() + "점"; //String s = q + "점";
		//객체를 단독으로 사용 하는 경우 -> 객체.toString()으로 자동변환	
		System.out.println(q.toString()); // System.out.println(q); 	 
		
	}

}
