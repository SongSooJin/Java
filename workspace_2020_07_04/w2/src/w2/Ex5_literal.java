package w2;

public class Ex5_literal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String na = "ȫ �� ��", nb = "ȫ�浿", nc = "ȫ�浿";
		//���ڿ� �� String�� �񱳴� String�� ��ü1.equals(String��ü2)�� ��ȯ������
		System.out.println(na.equals(nb)); //false
		System.out.println(na.equals(nc)); //true
		
		/*
		//null ���ͷ� : ���۷����� ���� ���
		//int ia=null; 
		String name="�� ��";
		String irum=null;
		String irum1="";
		System.out.println("name:"+name);
		System.out.println("irum:"+irum);
		System.out.println("irum1:"+irum1);
		*/
		
		/*
		boolean a = true;
		boolean b = 10>0; // 10>0�� ���̹Ƿ� b���� true
		boolean c = 10<0;
		System.out.printf("a: %b\n",a);
		System.out.printf("b: %b\n",b);
		System.out.printf("c: %b\n",c);
		*/
		
		/*
		char a = 'w';
		char b = '��';
		char c = '\uae00';
		System.out.printf("a : %c\n",a);
		System.out.printf("b : %c\n",b);
		System.out.printf("c : %c\n",c);
		*/
		
		
		/*
		float f = 0.1234f;
		System.out.printf("f: %f\t w:%.4f\n",f,f); //0.123400 0.1234
		
		double w = .1234D; // .1234D�� .1234�� ����
		System.out.printf("w: %f\t w:%.4f\n",w,w); //0.123400 0.1234
		*/
		
		/*
		double d = 0.1234;
		double e = 1234E-4; // 1234E-4 = 1234x10-4�̹Ƿ� 0.1234�� ����
		System.out.printf("d: %f\n",d);
		System.out.printf("e: %f\n",e);
		System.out.printf("d: %.4f\n",e);
		System.out.printf("e: %.4f\n",e);
		System.out.printf("d: %e\n",e);
		System.out.printf("e: %e\n",e);
		*/
		
		/*
		long g = 24; //long���� 8byte
		System.out.printf("g : %d\n",g);
		long h = 2147483648L;
		System.out.printf("h : %d\n",h);
		*/
		
		/*
		// ���� ���ͷ�
		int n = 15;
		int m = 015; // 8���� 1 5
		int k = 0x15; // 16���� 1 5
		int b = 0b0101; //2���� 0101
		System.out.printf("n: %d\n",n); // 15
		System.out.printf("m: %d\t8����:%o\n",m,m); // 13 8����:15
		System.out.printf("k: %d\t16����:%x\n",k,k); // 21 16����:15
		System.out.printf("b: %d\n",b); // 5
		*/
		
	}

}
