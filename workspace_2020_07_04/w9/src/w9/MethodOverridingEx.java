package w9;

public class MethodOverridingEx {

	static void paint(Shape p) { // Shape�� ��ӹ��� ��ü���� �Ű� ������ �Ѿ�� �� ����
		p.draw(); // p�� ����Ű�� ��ü�� �������̵��� draw() ȣ��.
		// �������ε�
	}

	public static void main(String[] args) {
		Line line = new Line();
		paint(line); // Line�� draw() ����. "Line" ��� // ��ĳ����
		// Shape p = line;

		paint(new Shape()); // Shape�� draw() ����. "Shape" ��� 
		//Shape p = new Shape();
		
		paint(new Line()); // �������̵��� �޼ҵ� Line�� draw() ���� 
		//Shape p = new Line();
		
		paint(new Rect()); // �������̵��� �޼ҵ� Rect�� draw() ���� 	
		//Shape p = new Rect();
		
		paint(new Circle()); // �������̵��� �޼ҵ� Circle�� draw() ���� 
		//Shape p = new Circle();
	}
}

	
class Shape { // ������ ���� Ŭ����
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Circle");
	}
}
