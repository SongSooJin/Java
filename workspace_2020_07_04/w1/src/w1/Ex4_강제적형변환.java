package w1;

public class Ex4_����������ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b = 3;
		System.out.printf(" %d + %d = %2d\n",a,b,a+b);
		System.out.printf(" %d - %d = %2d\n",a,b,a-b);
		System.out.printf(" %d * %d = %2d\n",a,b,a*b);
		System.out.printf(" %d / %d = %2f\n",a,b,(double)a/b);
		System.out.printf(" %d / %d = %.4f\n",a,b,a/(double)b);
		System.out.printf(" %d / %.1f = %5.2f\n",a,(double)b,a/(double)b); // ��ü �ټ��ڸ� Ȯ���� �Ҽ��� 2�ڸ����� ǥ���ϰڴ�.
		//System.out.printf(" %d % %d = %d\n",a,b,a%b); // error
		System.out.printf(" %d %% %d = %-2d\n",a,b,a%b);
		// %��ü�� ����� ���� %% �ι����ش�.
	}

}

/*
 
����������ȯ == ���������ȯ
����) (�ٲ��ڷ���)����
int b = 3;
System.out.printf(" %d / %d = %2f\n",a,b,(double)a/b);

*/

/*
	System.out.printf("%o\n",a+b); // 8���� 15
	System.out.printf("%x\n",a+b); // 16���� d
	System.out.printf("%X\n",a+b); // 16���� D 
 */