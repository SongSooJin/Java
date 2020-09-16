package packA;

/*
 * super
 * 
 * 1. ���� Ŭ������ ����� ������ �� ���Ǵ� ���۷���
 *     super.����Ŭ�����Ǹ��
 * 2. ���� Ŭ���������� ���
 *     ���� Ŭ������ �ʵ� ����
 * 3. ���� Ŭ������ �޼ҵ� ȣ�� ��
 *     super�� �̷������ �޼ҵ� ȣ�� : ���� ���ε�
 * 
 */

class SuperObject {
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}

public class SubObject extends SuperObject {
	protected String name;
	public void draw() {
		name = "Sub"; //�ڳ�������
		super.name = "Super"; //�θ𿡰Ե� �̸�(��)�� �ְ��ʹ�.
		super.draw();
		System.out.println(name);
	}

	public static void main(String[] args) {
		SuperObject b = new SubObject(); //��ĳ����
		b.paint();
		
	}

}