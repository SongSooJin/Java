package w2;

import java.util.Scanner;

/*
 * �̸�? ȫ �� ��
 * ��,�� �÷�? 1.2 1.3
 * ------------------
 * 'x x x'����
 * ��� �÷��� \1.25\ �Դϴ�. 
 */
public class Ex9_��ս÷� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);
		
		//String name = sc.nextLine();
		
		String line = "------------------------";
		
		while(true) {
			System.out.print("�̸�? "); String name = sc.nextLine();
			if(name.equals("")) break;
			
			System.out.print("��,�� �÷�?");double a = tc.nextDouble(); double b = tc.nextDouble();
			
			double avg = (a+b)/2; //����켱���� : () > *,/,% > +,-
			System.out.println(line);
			System.out.printf("\'%s\'����\n",name);
			System.out.printf("��� �÷��� \\%.2f\\�Դϴ�.\n",avg);
			//System.out.println("��� �÷��� \\"+avg+"\\ �Դϴ�.");
		}// while
		System.out.println("����Ǿ����ϴ�.");
		sc.close();
		tc.close();
	}

}
