package w2;
// // �������� 5�� ���� ���̿� �ѷ��� ���϶�, PI=3.141592;�� ������
public class Ex2_��� {

	static final double PI=3.141592; // ���
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 5;
		double area = r*r*Math.PI; // Math.PI : class�� static�� ����� ��ü���������� ��밡��
		// PI = 3.14; error final����� ����Ұ�
		double dul = 2*r*Math.PI;
		System.out.printf("������ : %d\n",r);
		System.out.printf("���� ���� : %8.4f\n",area);
		System.out.printf("���� �ѷ� : %8.4f\n",dul);
	}

}

/*

final �����?
�ѹ� ���� �Ҵ���, ������ ������ �ʴ� ��� ���
final������� �ĺ��ڱ�Ģ���� �빮�ڸ� �ַ� ���
(������ �ǹ̷�)
Ȱ�� : ���̰�, �迭�� ũ��, ȯ��

*/