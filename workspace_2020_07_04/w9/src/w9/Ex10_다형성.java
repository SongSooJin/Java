package w9;

public class Ex10_������ {

	public static void main(String[] args) {

		LLine p = new LLine();
		p.draw(); // Line
		
		DObject d = new LLine();
		d.draw(); // Line
		
		RRect q = new RRect();
		q.draw(); // Rect
		
		CCircle c = new CCircle();
		c.draw(); // Circle
	}

}


abstract class DObject {
	public abstract void draw();
	
}

class LLine extends DObject {
	public void draw() {
		 System.out.println("Line");
	}
}

class RRect extends DObject {
	public void draw() {
		 System.out.println("Rect");
	}
}

class CCircle extends DObject {
	public void draw() {
		 System.out.println("Circle");
	}
}

