package p20_0808; 
import java.util.*;    // Scanner�� ����ϱ� ���� �߰�
//java.util.*; ��Ű�� �ؿ� �����ϴ� *(���) Ŭ�������� �� Ŭ���� (p28_2_0808)���� ����Ҷ�]
// ��Ű������ �����ϰ� Ŭ���� �� �����ε� ª�� ����� �� �ְ� �����.

public class p28_2_0808 {

	public static void main(String[] args) { //�޼ҵ� ���� = �Ķ���� + ���������� ����~��
		
		// ���� ���ͷ�
		// ������ �����ϸ� �ڵ������� int �ڷ������� ����Ѵ�.
		// �Ǽ��� �����ϸ� �ڵ������� double �ڷ������� ����Ѵ�.
		
//1-1		short x = 1;
//		int y = x; //�ڵ� ����ȯ! ������ ����ȯ!
//		//	x = y; //ū �ڽ��� ���� ���� �ڽ��� �ű涧 ���� �ս��� �ִٸ� �ڹٴ� �ڵ������� �������� �ʴ´�.
//		x = (short) y; // (�ڷ���) : ����ȯ������, ������ �ڷ������� ��ȯ�� �� ����Ѵ�. ����� ����ȯ!
//		
//		
//		//int z = 2200000000;
//		
//		double a = 0;
//		//�� �ڵ�� ���� �ڵ�� �ǹ������� ����. double a = (double) (int) 0;
//		
//		float b =1;
//		// �� �ڵ�� ���� �ڵ�� �ǹ������� ����. float b = (float) (int) 1;
//		
//		double c = 0.12;
//		// �� �ڵ�� ���� �ڵ�� �ǹ������� ����. double c = (double) 0.12;
//		
//		//float d = 1.0;
//		// ���ڵ�� ���� �ڵ�� �ǹ������� ����. float d = (double) 1.0;
//		
//		float f1 = (float) 1.0;
//		float f2 = 1.0f;
//		
//		long big = 100_000_000;
		
//1-2	String firstName = "Tom";
//		String laststName = "Cruise";
//		
//		System.out.println(firstName + laststName);
//		
//		int num = 10;
//		String number = "10";
//
//		System.out.println(num + number); //1010
//		
//		String name = "Ja" + "va";
//		String str  = name + 8.0;
//
//		System.out.println(name);
//		System.out.println(str);
//		System.out.println(7 + " ");
//		System.out.println(" " + 7);
//		System.out.println(7 + "");
//		System.out.println("" + 7);
//		System.out.println("" + "");
//		
//		System.out.println(7 + 7 + ""); // 14
//		System.out.println("" + 7 + 7); // 77
//		
//		// ��Ʈ�� ��Ʈ ȭ��ǥ �Ʒ�Ű : ���ٺ���
//		System.out.println("" + (7 + 7)); // ():�켱���� ������ 14
		
//1-3	byte  b = 1;
//		short s = 2;
//		char  c = 'A';
//
//		int  finger = 10; 
//		long big = 100_000_000_000L;   
//		
//		long oct = 077; // 8����
//		
//		// 10���� : 0,1,2...9
//		// 16���� : 0,1,2....9,A,B,C,D,E,F ex) colorǥ��
//		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;  // long hex = 0xFFFFFFFFFFFFFFFFL;
//
//		int octNum = 010;       //  8���� 10, 10�����δ� 8
//		int hexNum = 0x10;      // 16���� 10, 10�����δ� 16
//		int binNum = 0b10;      //  2���� 10, 10�����δ� 2
//		
//		
//		System.out.println("��� �ٹٲ� ����");	
//		System.out.print("��� �ٹٲ� ����");
//		System.out.println("��� �ٹٲ� ����");	
//		
//		// �ڷ����� ���� ��ġ������ ����,Ư����ȣ��  ����Ҽ� �ִ�.
//		// %d�� ����(decimal) , %b �ٹٲ� ,%c char��, 
//		System.out.printf("b=%d%n", b);
//		System.out.printf("s = %d %n", s);
//		System.out.printf("c=%c, %d %n", c, (int)c);
//		System.out.printf("finger=[%5d]%n",  finger);
//		System.out.printf("finger=[%-5d]%n", finger);
//		System.out.printf("finger=[%05d]%n", finger);
//		System.out.printf("big=%d%n", big);
//		System.out.printf("hex=%#x%n", hex); // '#'�� ���λ�(16���� 0x, 8���� 0)
//		System.out.printf("octNum=%o, %d%n", octNum, octNum);   
//		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);   
//		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);  
//		
//		int x1 = 1;
//		int x2 = 2;
//		int x3 = 3;
//		
//		System.out.println("x1:" + x1 +"x2:"+x2+"x3:"+x3);
//		System.out.printf("x1:%dx2:%dx3:%d",x1,x2,x3);
//		System.out.println();
//		System.out.println("done");	
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");

		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ

		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d%n", num);
		
		}
		
	}
	

