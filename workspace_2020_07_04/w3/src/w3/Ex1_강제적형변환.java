package w3;

public class Ex1_����������ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 300;
		//byte b = n; //int Ÿ���� byte(-128<=byte<=127)�� �ڵ� ��ȯ �ȉ� 
		byte b = (byte)n;
		
		System.out.println("b: "+b); //44
		
		double d = 1.9D;
		// int m = d; c����� ��� ������ �ȳ��� m�� 1�� ����. 
		int m=(int)d; // �ڹٴ� ����������ȯ�� �ؾ����� ����.
		System.out.println("m: "+m); // 1
		
		
	}

}
