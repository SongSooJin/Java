package w9;

public class MethodOverridingEx {

	static void paint(Shape p) { // Shape을 상속받은 객체들이 매개 변수로 넘어올 수 있음
		p.draw(); // p가 가리키는 객체에 오버라이딩된 draw() 호출.
		// 동적바인딩
	}

	public static void main(String[] args) {
		Line line = new Line();
		paint(line); // Line의 draw() 실행. "Line" 출력 // 업캐스팅
		// Shape p = line;

		paint(new Shape()); // Shape의 draw() 실행. "Shape" 출력 
		//Shape p = new Shape();
		
		paint(new Line()); // 오버라이딩된 메소드 Line의 draw() 실행 
		//Shape p = new Line();
		
		paint(new Rect()); // 오버라이딩된 메소드 Rect의 draw() 실행 	
		//Shape p = new Rect();
		
		paint(new Circle()); // 오버라이딩된 메소드 Circle의 draw() 실행 
		//Shape p = new Circle();
	}
}

	
class Shape { // 도형의 슈퍼 클래스
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Circle");
	}
}
