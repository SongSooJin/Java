package w5;

public class Ex3_�������迭��ü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ia[] = new int[5]; //�������� �迭��ü�� ���� �� ���� ==  int []ia = new int[5];
		System.out.printf("ia�迭�� ����� ���� : %d\n",ia.length); //5
		System.out.printf("ia--\n");
		for (int i=0;i<ia.length;i++) {
			System.out.printf("ia[%d] : %d\n",i,ia[i]);		
		}
		
		double da[]; //double���� ���������۷������� da�� ����
		da = new double[7]; // double���� �������迭 ��ü ����
		System.out.printf("\nda--\n");
		for (int i=0;i<da.length;i++) {
			System.out.printf("da[%d] : %.1f\n",i,da[i]);
		}
		
		char ca[] =  new char[8]; // char���� �������迭 ��ü ����
		System.out.printf("\nca--\n");
		for (int i=0;i<ca.length;i++) {
			System.out.printf("ca[%d] : %c\n",i,ca[i]);
		}

		String sa[] =  {"������","�ٳ���","����","������"}; // double���� �������迭 ��ü ����
		System.out.printf("\nsa--\n");
		for (int i=0;i<sa.length;i++) {
			System.out.printf("sa[%d] : %s\n",i,sa[i]);
		}
		
		
	}

}
