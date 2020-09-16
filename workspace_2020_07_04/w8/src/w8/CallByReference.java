package w8;

public class CallByReference {
	
	static void increase(Circle m) {
	m.radius++;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle p = new Circle(10);
		increase(p); //인수가 레퍼런스변수 call by reference
		System.out.println("p : " +p.radius); //11
	}

}

class Circle {
	int radius;
	public Circle() {}
	public Circle(int r) {this.radius = r;} 
}