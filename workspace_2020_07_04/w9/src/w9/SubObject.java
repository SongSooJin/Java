package w9;

class SuperObject {
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("Super Object");
	}
}


public class SubObject extends SuperObject {
	public void draw() {
		System.out.println("Sub Object");
	}
	public static void main(String [] args) {
		SuperObject b = new SubObject(); //��ĳ����
		b.paint(); // Sub Object , ���� ���ε�
		b.draw(); // Sub Object , ���� ���ε�

	}

}