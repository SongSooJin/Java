package w6;

public class Ex12_��ü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Sinsang p = new Sinsang(); // Sinsang��ü ���۷������� p����
		//new �����ڰ� �������Լ��� ��ü�� ������, ���� ��ġ���� ��ȯ
		Sinsang q = new Sinsang("ȫ�浿",20,75.8); // Sinsang��ü ���۷������� p����
		System.out.println("p--");
		p.disp();
		System.out.println("q--");
		q.disp();
		
		
	}

}

class Sinsang{
	private String name;
	private int age;
	private double weight;
	public Sinsang() {System.out.println("������ call!!");}
	public Sinsang(String _name,int _age,double _weight) {
		name= _name; //�������=�Ű�����;
		age=_age;
		weight=_weight;
		System.out.println("�μ��ִ� ������ call!!");
	}
	public void disp() {
		System.out.printf("�̸� : %s\n",name);
		System.out.printf("���� : %s\n",age);
		System.out.printf("ü�� : %s\n",weight);
	}
}


/*
 * ��ü : class�� �ڷ������� ����
 * 1) class : Ʋ (�ؾƲ)
 * 		class�� ���� : ������� + ����޼ҵ�
 * 2) ��ü : class�� �ڷ������� ���� (�ؾ)
 * 3) class�� ����
 * class Ŭ������ {
 * 		private �������1�� ����;
 * 		private �������2�� ����;
 * 		public ����޼ҵ�1�� ����
 * 		public ����޼ҵ�2�� ����
 *} 
 *4) ���������� 
 *public : ���� / class���ε� �ܺε� ���ٰ���
 *private : class����  / class�ܺ�[main(),������Լ�]���� ���� �Ұ� / class������ ����޼ҵ忡���� ���ٰ���
 *���������� ������ == default ���������� : ���� ��Ű�� �ȿ����� ���� ����
 * 
 * �������Լ�
 * 1) ��ü ������ �ʿ�
 * 2) �������Լ����� class��� ����, ��ȯ���� ����.
 * 3) pg�� ������ �Լ��� �������� ������, compiler�� �ڵ����� ==default������
 * 		pg�� ������ �Լ��� �����ϸ�, , compiler�� �������Լ��� �������� ����.  pg �� ������ �Լ��� å������ �ڵ�!
 * 4) default�������� ����
 * 		pubilc class��() {}
 * 5) �Լ��� �����ε� ������ ����
 * 
 * 
 * �Լ��� ����
 * 1) c���,python : �Լ������θ� ���� , �Լ��� �����ε� ���� ����
 * 2) c++,java,c# : �Լ���, �μ��� ����, �μ��� �ڷ���, �Լ��� �����ε� ���� ����
 *     -- �Լ��� �����ε� : ���� �Լ��� ���¿��� �μ��� ������ �μ��� �ڷ����� �ٸ��� 
 *     							���� �ٸ� �Լ��� ���� 
 * 
 * 
 * ��ü�������۷��� this :
 * 1) ��ü ������, ������ �Լ������� ���� ���� �ڵ����� ����� 
 * 		��ü �ڽ��� �����ϴ� ���۷����̴�.
 * 
 * 
 * 
 * 
 * 
 */