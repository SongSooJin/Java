import java.util.Scanner;

////0-4
//import java.util.Scanner; 
//// import �ڵ� �߰� ����Ű : ��Ʈ�� ����Ʈ oŰ
//
//public class text2_0809 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		// �ַܼ� ���ڸ� 1�� �޴´�.
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("���ڸ� �ϳ� �Է��ϼ���: ");
//		
//		String number = scan.nextLine();
//		
//		System.out.println("�Էµ� ���� =  " + number);
//		
//		// ¦�� , Ȧ�� ���θ� �ֿܼ� ����Ѵ�.
//		
//		int num = Integer.parseInt(number);
//		
//		if ((num %2)==0) {
//			
//			System.out.println("¦��");
//		} 
//		
//		else {
//			System.out.println("Ȧ��");
//		}
//		
//		if (num %2!=0) {
//			
//			System.out.println("Ȧ��");
//		} 
//		
//		else {
//			System.out.println("¦��");
//		}
//		
//	}
//
//}

////3-21
//class text2_0809 {
//	
//	public static void main(String args[]) { 
//		
//		System.out.printf("10 == 10.0f  \t %b\n", 10 == 10.0f);
//		System.out.printf("'0'== 0      \t %b\n", '0'== 0);
//		System.out.printf("'\\0'== 0    \t %b\n", '\0'== 0);
//		System.out.printf("'A'== 65     \t %b\n", 'A'== 65);
//		System.out.printf("'A' > 'B'    \t %b\n", 'A' > 'B');
//		System.out.printf("'A'+1 != 'B' \t %b\n", 'A'+1 != 'B');
//		
//		System.out.println('b' >= 'A'+1); //������ �����ʺ��� ũ�� true, ������ �����ʰ� ������ true
//	
//	}
//
//}

//3-23
class text2_0809 {
	
	public static void main(String[] args) {
		// ���ڿ��� new ������ ���� ������ ���� ª�� �������� ����ϴ� ���� �����Ѵ�.
		// ���� �������� ���ڿ��� �����ϰ��� �õ��ϸ� 
		// �ش� ���ڿ��� �̹� �޸𸮿� �����ϴ��� Ȯ���ϰ� ������ �״�� ����ϰ�, ������ ���ο� ��ü�� ���� ������ �Ҵ��Ѵ�.
		// ���ڿ� �Һ�������� �����ȴ�.
		String str1 = "abc"; // <== new
		
		String a = str1;
		String b = "abc"; // ������ ���簴ü ���� ,���� �޸𸮸� ������ ���� 
		
		// ���ڿ� �������� �� ��뼺�� �ش�ȭ�Ͽ� �޸𸮸� �Ƴ�����
		// �ش� ���ڿ��� �����ִ� String ��ü�� �����ϸ� �� ��ü�� �״�� ����Ѵ�.
		

		System.out.println(b.length());
		System.out.println("abc".length()); // "���ڿ�" �ϴ� �͸����� String ��ü�� �����Ѵ�.
		
		System.out.println(str1==a);
		System.out.println(str1==b);
		
		// String�� Ŭ�����̱� ������ ���Ѵٸ� new �����ڷ� ��ü�� ����� �� ��ü�� ���ڿ��� �����ϵ��� �� �� �ִ�.
		
		String str2 = new String("abc");

		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc");
		// ���ڿ��� �������� ��ü�� ���� �ִ�.
		// �׷��� �񱳿����� == �� �񱳸� �õ��ϸ� �̴� �������� ���ϴ� ���̹Ƿ� 
		// �������� �����ϴ� ���� ���ϰ��� �� �� �������� �ʴ�.
		// ������ ����Ű�� ���� ��ü�� �����ϴ� ���ڿ� ��ü�� ���ϰ��� �� �� equals �޼ҵ带 ����ؾ� �Ѵ�.
		System.out.println();
		System.out.println(str1==str2);		//false
		System.out.println(str1.equals(str2));		//true, 99% �̷��� ���ؾ��ϴ� ��찡 ��κ��̴�.
		System.out.println();

		
		
		
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	
	}
	
}

////3-24
//class text2_0809 {
//	public static void main(String args[]) { 
//		int  x = 0;
//		char ch = ' ';
//
//		x = 15;
//		System.out.printf("x=%2d, 10 < x && x < 20 =%b\n", x, 10 < x && x < 20);
//		// x=15; 10< x && x < 20 = true
//		
//		x = 6;
//		System.out.printf("x=%2d,  x%%2==0 || x%%3==0  && x%%6!=0 =%b\n", 	
//			x , (x %2 == 0) || ((x %3==0) && (x%6 != 0)));
//		// x = 6, x%2==0 || x%3==0 && x%6 !=0 = true	
//		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 =%b\n", x,(x%2==0||x%3==0)&&x%6!=0);
//
//		ch='1';
//		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b\n", ch, '0' <= ch && ch <='9');
//
//		ch='a';
//		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b\n", ch, 'a' <= ch && ch <='z');
//
//		ch='A';
//		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' =%b\n", ch, 'A' <= ch && ch <='Z');
//
//		ch='q';
//		System.out.printf("ch='%c', ch=='q' || ch=='Q' =%b\n", ch, ch=='q' || ch=='Q');
//	}
//}

////3-26
//class text2_0809 {
//	
//	public static void main(String[] args) { 
//		
//		int a = 5;
//		int b = 0;
//
//		System.out.printf("a=%d, b=%d%n", a, b);
//		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
//		
//		System.out.printf("a=%d, b=%d\n", a, b);
//		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
//		
//		System.out.printf("a=%d, b=%d%n", a, b);
//		
////		Scanner scan = new Scanner(System.in);
////		System.out.print("���������� �Է��ϼ���: ");
////		int eng = scan.nextInt();
////		
////		System.out.print("���������� �Է��ϼ���: ");
////		int math = scan.nextInt();
////		
////		if (eng >= 90 && math >= 90) {
////			System.out.print("A");
////		}
////		else if (eng >= 80 && math >= 80) {
////			System.out.print("B");
////		}
////		else if (eng >= 70 && math >= 70) {
////			System.out.print("C");	
////		}	
//		
//		int x = 2;
//		System.out.println(x>3 || 3/0 > 2);
//		
//	} // main�� ��
//	
//}

////3-27
//class text2_0809 {
//	
//	public static void main(String[] args) { 
//		
//		boolean  b  = true; 
//		char ch = 'C';
//		
//		System.out.printf("b=%b\n", b);
//		System.out.printf("!b=%b\n", !b);
//		System.out.printf("!!b=%b\n", !!b);
//		System.out.printf("!!!b=%b\n", !!!b);
//		System.out.println();
//
//		System.out.printf("ch=%c\n", ch);
//		System.out.printf("ch < 'a' || ch > 'z'=%b\n", ch < 'a' || ch > 'z');
//	    System.out.printf("!('a'<=ch && ch<='z')=%b\n", !('a'<= ch && ch<='z'));
//	    System.out.printf("  'a'<=ch && ch<='z' =%b\n",   'a'<=ch && ch<='z');
//	
//	} // main�� ��
//	
//}

////3-32
//class text2_0809 {
//	
//	public static void main(String args[]) { 
//		int ssn = 2;
//		boolean condition = true; 
//		
//		if (ssn==1) {
//			// ������ true�� �� �����ѿ� �ڵ带 �����Ѵ�.
//			System.out.println("����");
//		} else {
//			// ������ false�� �� �����ѿ� �ڵ带 �����Ѵ�.
//			System.out.println("����");
//		}
//
//		// if ~else ������ ���׿����ڷ� ġȯ�ؼ� ǥ�� �Ҽ��ִ�.
//		System.out.println(ssn == 1 ? "����" : "����");
//		
//		int  x, y, z;
//		int  absX, absY, absZ;
//		char signX, signY, signZ;
//
//		x = 10;
//		y = -5;
//		z = 0;
//		// ���׿�����
//		// 1�� ? 2�� : 3 ��
//
//		absX = x >= 0 ? x : -x;  // x�� ���� �����̸�, ����� �����.
//		absY = y >= 0 ? y : -y;
//		absZ = z >= 0 ? z : -z;
//
//		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');  // ���� �����ڸ� ��ø
//		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-'); 
//		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); 
//
//		System.out.printf("x=%c%d\n", signX, absX);
//		System.out.printf("y=%c%d\n", signY, absY);
//		System.out.printf("z=%c%d\n", signZ, absZ);
//		
//	}
//	
//}

////0-5
//class text2_0809 {
//	
//	public static void main(String args[]) { 
//
//	int a =  10;
//	
//	a = a +3;
//	
//	System.out.println(a);
//	
//	a += 3;
//	System.out.println(a);
//		
//	int i = 1;
//	
//	i += 2;
//	i *= 2;
//	System.out.println(i);
//		
//	}
//	
//}


////4-1
//class  text2_0809  {
//	
//	public static void main(String[] args) { 
//		int x= 0;
//
//		System.out.printf("x=%d �϶�, ���� ����%n", x);
//
////		if (x == 0) {
////			System.out.println("x==0");
////		}
//		
//		//���ǹ��� ���������ڸ� �����ϸ� ���� ; �����ݷ��� ���������� ������ ��´�. 
//		if(x!=0) System.out.println("x!=0");
//		if(!(x==0)) System.out.println("!(x==0)");
//		if(!(x!=0)) System.out.println("!(x!=0)");
//		System.out.println();
//
//		x = 1;
//		System.out.printf("x=%d �϶�, ���� ����%n", x);
//
//		if(x==0) System.out.println("x==0");
//		if(x!=0) System.out.println("x!=0");
//		if(!(x==0)) System.out.println("!(x==0)");
//		if(!(x!=0)) System.out.println("!(x!=0)");
//		
//	}
//	
//}


////4-2
//class text2_0809 {
//
//	public static void main(String[] args) {
//
//		int input;
//
//		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");
//
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
//		input = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
//
//		if (input == 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
//		}
//
//		if (input != 0)
//			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
//		System.out.println("�Է��Ͻ� ���ڴ� " + input + "�Դϴ�.");
//
//		some();	
//	} // main�� ��
//
//	
//	static void some() {
//		if (true) {
//			System.out.println("Hello ");
//			
//		}
//		if (true) 
//		{
//			System.out.println("World! ");
//			
//		}
//	}
//}


////4-2
//class text2_0809 {
//	
//	public static void main(String[] args) {  
//		
//		int input;
//
//		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");
//
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
//		input = Integer.parseInt(tmp);   // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
//
//		if(input==0) {
//			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");	
//		} else { // input!=0�� ���
//			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
//		}
//	
//	} // main�� ��
//	
//}


////4-4
//class text2_0809Ex4 {
//	public static void main(String[] args) { 
//		int score  = 0;   // ������ �����ϱ� ���� ����
//		char grade =' ';  // ������ �����ϱ� ���� ����. �������� �ʱ�ȭ�Ѵ�.
//
//		System.out.print("������ �Է��ϼ���.>");
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
//		score = Integer.parseInt(tmp);   // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
//
//		if (score >= 90) {         // score�� 90�� ���� ���ų� ũ�� A����
//			 grade = 'A';             
//		} else if (score >=80) {   // score�� 80�� ���� ���ų� ũ�� B���� 
//			 grade = 'B'; 
//		} else if (score >=70) {   // score�� 70�� ���� ���ų� ũ�� C���� 
//			 grade = 'C'; 
//		} else {                   // �������� D����
//			 grade = 'D'; 
//		}
//            
//		System.out.println("����� ������ "+ grade +"�Դϴ�."); 
//	}
//}

////4-5
//class text2_0809 {
//	public static void main(String[] args) { 
//		int  score = 0;
//		char grade = ' ';
//		char opt   = '0';
//
//		System.out.print("������ �Է����ּ���.>");
//
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
//		score = Integer.parseInt(tmp);   // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
//		
//		System.out.printf("����� ������ %d�Դϴ�.", score);
//
//		if (score >= 90) {		      // score�� 90�� ���� ���ų� ũ�� A����(grade)
//			grade = 'A';
//			if (score >= 98) { 	      // 90�� �̻� �߿����� 98�� �̻��� A+
//				opt = '+';	
//			} else if (score < 94) {  // 90�� �̻� 94�� �̸��� A-
//				opt = '-';
//			}
//		} else if (score >= 80){	  // score�� 80�� ���� ���ų� ũ�� B����(grade)
//			grade = 'B';
//			if (score >= 88) {
//				opt = '+';
//			} else if (score < 84)	{
//				opt = '-';
//			}
//		} else {				      // �������� C����(grade)
//			grade = 'C';
//		}
//			
//		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade, opt);
//	}
//}

