package w1;
// ��������� : +,-,*,/,%(�������� ���ϴ� ������)
public class Ex2_��������� {

	public static void main(String[] args) {
		System.out.println(10+3);
		System.out.println(10+3.7);
		System.out.println(10-3);
		System.out.println(10*3);
		System.out.println(10/3); // ���: 3(����)  = ������ ������ ������ ����� �����̱⶧���� �ڷ����� ���ش�.
		System.out.println(10/3.0); // ���: 3.33333...(�Ǽ�) ������ �Ǽ��� ������ ����� �Ǽ� =  (float)10/3
		System.out.println((float )10/3);
		System.out.println((float )10/3.0);
		System.out.println(10%3);
		// C��� : ���� % ���� (O) , ���� % �Ǽ� (X)
		// Java : ���� % ���� (O) , ���� % �Ǽ� (O)
		System.out.println(3.14%2);
		
	}
}
