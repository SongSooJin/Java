package w1;

public class EX3_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a= 10 , b= 3; // ������ ���� a,b�� ����� ���ÿ� �ʱⰪ �־���
		int a,b; // ������ ���� a,b�� ����
		a = 10; // �� �Ҵ�
		b = 3; 
		int hap = a+b;
		// b = 3.14; error 
		// ���Կ����� = 
		// ���Կ����� �캯 [ liteal �Ǵ� ���� �Ǵ� ����]�� ����� ���ʺ����� ����(���)���Ѷ�
		// ���� = [liteal �Ǵ� ���� �Ǵ� ����];
		System.out.println("a: " + a); //���⼭ +�� ���Ῥ���� (add�� X)
		System.out.println("b: " + b); 
		System.out.println("10+3 =  " + a+b); 
		System.out.println("10+3 =  " + (a+b));
		System.out.println(a + " + " + b + " = "+(a+b));		
		System.out.println(a + " - " + b + " = "+(a-b));		
		System.out.println(a + " * " + b + " = "+(a*b));		
		System.out.println(a + " / " + b + " = "+(a/b));		
		System.out.println(a + " % " + b + " = "+(a%b));		
		System.out.println("10+3 =  " + hap); 
		
		
	}

}

/*
 * nbit�� ǥ������ ���� : -2�� (n-1)�� ~ 2��(n-1)��-1

4byte == 4*8bits : -2(31)�� ~ 2��(31��)-1

data
1) ���� : �Ҽ����� ���� �� ex) 504,0,-3949
	�ڷ��� : byte(1) = 8bits -  short(2) - int(4) �⺻ - long(8)
	��� : %d(10����), %o(8����), %x(16����) : 0~9, 10(a),11,12,13,14,15(f)

2) �Ǽ� : �Ҽ����� �ִ� �� ex)40.3,0.0,-4052.3
	�ڷ��� : float(4) - double(8)�⺻
	��� : %f(�Ҽ������� 6�ڸ����� ǥ��), %e
	%.mf : �Ҽ����� m�ڸ����� ���
	%n.mf : ��ü n�ڸ��� Ȯ�� �� , �Ҽ����� m�ڸ����� ��� (�Ҽ��� ����)
	
3) ���� literal : ex) 'a', '��'
 	�ڷ��� : char(2)
 	��� : %c

4) �� literal : true, false
	�ڷ��� : boolean
	��� : %b

5) ���ڿ� literal : ex) "a", "ȫ �� ��", "ab c"
 	�ڷ��� : String
 	��� : %s 	
 	
6) ��½�
	%nd : nĭ�� Ȯ���Ͽ� ������ ����
	%-nd : nĭ�� Ȯ���Ͽ� ���� ����
	ex) %3d, %-3s, %3c
	 	
 	
�ĺ��ڶ�? 
1) Ŭ����, ����, final���, �޼ҵ� ���̴� �̸�
2) @,# �� ���� Ư������, ���� �Ǵ� �� �ĺ��ڷ� X _$, �����ڵ� ����, �ѱ� ��� ����
3) �ڹ� ����� Ű����� �ĺ��ڷ� ���Ұ� , �ĺ����� ù��° ���ڷ� ���ڴ� ���Ұ�
4) _ �Ǵ� $�� �ĺ��� ù ��° ���ڷ� ����� �� ������ �Ϲ������� �� ������� �ʴ´�.
5) �Ҹ� ���ͷ�(true, false)�� �� ���ͳ�(null)�� �ĺ��ڷ� ���Ұ�
6) ���� ���� ����. 

 */	
	
	
	