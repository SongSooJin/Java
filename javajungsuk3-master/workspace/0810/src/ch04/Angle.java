package ch04;

public class Angle {
	// �������
	String name = "����";

	// ��� �޼ҵ�
	
	public void forward() {
		System.out.println(" ���� # forward() called.");
	}
	public void turnLeft() {
		System.out.println(" ���� # turnLeft() called.");
	}
	public void turnRight() {
		System.out.println(" ���� # turnRight() called.");
	}
	public void flower() {
		System.out.println(" ���� # flower() called.");
	}
	
	
	
	public static void main(String[] args) {
		// �̼� �����ϱ� : for�� �Ǵ� while���� ������
		
		Angle a = new Angle();
//		
//		a.forward();
//		a.turnLeft();
//		a.flower();
//		for (int i = 1; i <= 3; i++) {
//			a.forward();
//			a.turnLeft();
//			a.flower();
//			a.turnRight();
//			a.forward();
//			System.out.println("");
//		}
		int i = 1;
		while (i <= 3) {
			a.forward();
			a.turnLeft();
			a.flower();
			a.turnRight();
			a.forward();
			System.out.println("");
			i++;
		}
		

	}
}
