package p20_0808;

public class Text2_0808 {
	// ���� : Ư�� ���ۿ� �����ϰ� �ִ� ��
	static int positionBot = 0;
	static int positionOfBag = 3;
	// �����ϱ�
	public static void main(String[] args) {
		moveRight();
		moveRight();
		moveRight();
		
		int result = miltilyBy2(3);
		
		System.out.println("result =" + result);
	}
	// �����ڷ��� �޼ҵ���()
	// �޼ҵ� : �Ʒ� �ڵ带 �����Ҽ� �ִ�. ������ �������� �� ���ִ�.
	static void moveRight() {
		System.out.println("���������� 1ĭ �����δ�.");
		positionBot = positionBot + 1;
		if (positionBot == positionOfBag) {
			System.out.println("����");
		}
	}
	
	static int miltilyBy2(int x) {
		int y = x *2;
		return y;
	}
	
}
