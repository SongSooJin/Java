package w6;
/*
 *  -- �Լ��� �����ε� : ���� �Լ��� ���¿��� �μ��� ������ �μ��� �ڷ����� �ٸ��� 
 *     							���� �ٸ� �Լ��� ���� 
 */


public class Ex11_�Լ���_�����ε� {
	static void func() {
		System.out.println("�ȴ��ϼ���");
	}
	
	static void func(int a,int b) {
		System.out.printf("a: %d b: %d �� : %d\n",a,b,a+b);
	}
	

	static void func(String a,int b) {
		for(int i=0;i<b;i++) {
		System.out.printf("a: %s b: %d\n",a,b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		func();
		func(100,200);
		func("I LOVE YOU",5);	
		
	}

}
