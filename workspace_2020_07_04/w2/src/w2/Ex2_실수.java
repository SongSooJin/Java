package w2;/*�������� 5�� ���� ���̿� �ѷ��� ���� �Ʒ�ó��!, 
�� ���̴� 3.1415928�� �ϱ�� ��!
������ : x
���� ���� : xxx.xxxx
���� �ѷ� : xxx.xxxx
*/
public class Ex2_�Ǽ� {
	static final double PI=3.1415928;//final��� 
	//������Լ�
	public static void main(String[] args) {		
		int r=5;
		double area=r*r*PI;
		//PI=3.14;//error final����� ����Ұ�!
		double dul=2*r*PI;			
		System.out.printf("������ : %d\n",r);
		System.out.printf("���� ���� : %8.4f\n",area);
		System.out.printf("���� �ѷ� : %8.4f\n",dul);
	}
}