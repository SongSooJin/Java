package w1;

/*
 * ���� 95, ���� 100�� ������ �Ҵ� ��, ������ ����� ���� �Ʒ�ó��
 * ���� : xxx  ���� : xxx
 * --------------------
 * ���� : xxx  ��� : xxx.x
 */


public class Ex5_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �⺻�� ����
		int ���� = 95, ���� = 100;
		// ó��
		int tot  = ���� + ����;
		// double avg = tot / 2.0;
		double avg = (double)tot / 2;
		
		// ���
		System.out.printf("���� : %3d\t���� : %3d\n" ,����,����);
		System.out.println("-----------------------------");
		System.out.printf("���� : %3d\t��� : %5.1f\n" ,tot,avg);
		
	}

}
