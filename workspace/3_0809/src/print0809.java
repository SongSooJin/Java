//1-1                                                   
//public class print0809 {
//
//	static int x = 2;
//	int y = 3;
//	
//	// static Ű����
//	// ���α׷� ���� �� �޸𸣿� �ε�ȴ�.
//	public static void main(String[] args) { 
//		System.out.println(add(x,3));
//		
//		print0809 p = new print0809();
//		// multiply �޼Ҵ� staticŰ���尡 �����Ƿ�
//		// �޸𸮿� �ε��� �� ����ؾ� �Ѵ�.
//		System.out.println(p.multiply(x,3));
//	}
//	
//	private static int add(int i,int j) {
//		return i+j;
//		
//	}
//	public int multiply (int a,int b) {
//		return a*b;
//	}
//
//}

////2-6
//import java.util.*;    // Scanner�� ����ϱ� ���� �߰�
//
//public class print0809  { 
//
//	public static void main(String[] args) { 
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
//
//		String input = scanner.nextLine();
//		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
//
//		System.out.println("�Է³��� :"+input);
//		System.out.printf("num = %d%n", num);
//	} 
//
//}


////2-7
//class print0809 { 
//
//	public static void main(String[] args) { 
//
//		// ����Ҷ��� ���ڷ� ��������� �������� ������ �����Ҷ��� ���ڷ� ����Ѵ�.
//		char a = 65;
//		System.out.println(a);
//		char b = 'A';
//		System.out.println(b);
//		char c ='A'+1;
//		System.out.println(c);
//		
//		char ch = 'A';	     // char ch = 65;         
//		int code = (int)ch;  // ch�� ����� ���� intŸ������ ��ȯ�Ͽ� �����Ѵ�.
//
//		System.out.printf("%c=%d(%#X)%n", ch, code, code); 
//
//		char hch = '��';     // char hch = 0xAC00;
//		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
//	}
//
//} 

////2-8
//class print0809 {
//
//	public static void main(String[] args) {
//		
//		System.out.println("'");
//		System.out.println('\'');		     //  '''ó�� �� �� ����.
//		System.out.println("abc\t123\b456"); // \b�� ���� 3�� ��������.
//		System.out.println('\n');		     //  ����(new line)���� ����ϰ� ����
//		System.out.println("\"Hello\"");	 //  ū����ǥ�� ����Ϸ��� �̷��� �Ѵ�.
//		System.out.println("c:\\");
//		
//		System.out.println("111");
//		System.out.println("\n\n");
//		System.out.println("111");
//	}
//
//}
//
//// boolean : ture /flase
//// int  : ����
//// double : �Ǽ�
//// String : ���ڿ� 

////2-12
//class print0809 {
//
//	public static void main(String[] args) {
//
//		double d  = 85.4;
//		
//		// int < float < double
//		// �������� �Ǽ����� ������ ũ��.
//		// ���������� ����Ʈ ����� ū ���� ũ��.
//		// �Ǽ������� ����Ʈ ����� ū ���� ũ��.
//		
//		int score = (int)d; //�����ڰ� �˰������� ���� �սǵɼ� ������ �˰��ִ�.
//
//		System.out.println("score="+score);
//		System.out.println("d="+d);
//	}
//
//}

////2-13
//class print0809 {
//
//	public static void main(String[] args) {
//
//		int  i = 10;
//		byte b = (byte)i;
//		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); 
//		
//		i = 300;
//		b = (byte)i;
//		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); 
//
//		b = 10;
//		i = (int)b;
//		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); 
//
//		b = -2;
//		i = (int)b;
//		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); 
//		
//		// �������� 2������ �ٲ��.
//		System.out.println("i="+Integer.toBinaryString(i));
//	}
//
//}

////3-1
//class print0809 {
//	
//	public static void main(String args[]) {
//		
//		int i=5;
//		System.out.println(i);
//		
//	
//		i = i+1;
//		System.out.println(i);
//		
//		i++;	// i=i+1;�� ���� �ǹ��̴�. ++i;�� �ٲ� �ᵵ ����� ����. ��ó�� ������
//		System.out.println(i); 
//		
//		i=5;	//	����� ���ϱ� ���� i���� �ٽ� 5�� ����.
//		++i;	// i=i+1;�� ���� �ǹ��̴�. ��ó�� ������ 
//		System.out.println(i);
//		
//	}
//	
//}

////3-2
//class print0809 {
//	
//	public static void main(String args[]) {
//		// int i = 5;
//		// int j = 0;
//		int i=5, j=0;
//
//		j = i;
//		i = i+1;
//		// j = i++;
//		System.out.println("j=i++; ���� ��, i=" + i +", j="+ j);
//
//		i=5;        // ����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����
//		j=0;
//
//		i = i +1;
//		j = i;
//		// j = ++i;
//		System.out.println("j=++i; ���� ��, i=" + i +", j="+ j);
//	}
//}

////3-4
//class print0809 {
//	
//	public static void main(String[] args) {
//		
//		int i = -10;
//		i = +i;
//		System.out.println(i);
//
//		i=-10;
//		i = -i;
//		System.out.println(i);
//	}
//	
//}

////3-5
//class print0809  {
//	
//	public static void main(String args[]) { 
//	
//		int a = 10;
//		int b = 4;
//
//		System.out.printf("%d + %d = %d\n",  a, b, a + b);
//		System.out.printf("%d - %d = %d\n",  a, b, a - b);
//		System.out.printf("%d * %d = %d\n",  a, b, a * b);
//		System.out.printf("%d / %d = %d\n",  a, b, a / b);
//		System.out.printf("%d / %f = %f\n",  a, (float)b, a / (float)b);
//		
//		
//		
//		int c =3;
//		int x = c/2;	// int/int �� ��� �������� �Ҽ��� �κ��� ������.
//		double y = c / 2.0;		// int / double
//		
//		System.out.println(x);
//		System.out.println(y);
//	 
//		// int result = 3 / 0; // ������ 0���� ������ ����.
//		double result = 3.0 / 0;
//		System.out.println(result);
//	
//	}
//	
//}

////3-17
//class print0809 {
//	
//	public static void main(String args[]) { 
//		
//		double pi = 3.141592; 
//		
//		// round(3.141592), ��°�ڸ����� �ݿø�)
//		System.out.println(Math.round(pi));
//		System.out.println(Math.round(pi * 10));
//		System.out.println(Math.round(pi * 10)/ (double)10);
//		System.out.println(Math.round(pi * 100));
//		System.out.println(Math.round(pi * 1000)/ (double)1000);
//		
//		double shortPi = Math.round(pi * 1000) / 1000.0;
//
//		System.out.println(shortPi);
//		
//	}
//	
//}

////3-18
//	public class print0809 {
//	
//		public static void main(String[] args) {
//		// #2 
//		Math math = new Math();	
//			
//		//double result = Math.round();
//		double result = math.round(3.141592, 4);
//		System.out.println("result = " + result);
//	}
//	
//}
//	
//	class Math {
//		
//		// #1 static �ѹ��� ����� ������
//		double round(double value, int position) {
//		double x = java.lang.Math.pow(10, position-1);
//		return java.lang.Math.round(value * x) /(double) x;
//		
//	}
//
//}

////3-19
//class print0809 {
//	
//	public static void main(String args[]) { 
//		
//		int x = 10;
//		int y = 8;
//
//		System.out.printf("%d�� %d�� ������, \n", x, y); 
//		System.out.printf("���� %d�̰�, �������� %d�Դϴ�.\n", x / y, x % y); 
//	
//	}
//	
//}