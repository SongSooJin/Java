////4-6
//import java.util.*;
//
//class FlowEx06 {
//	public static void main(String[] args) { 
//		int month = 0; // ���������� 0���� 1���� �ǹ��Ѵ�.
//
//		System.out.print("���� ���� �Է��ϼ���.>");
//
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
//		month = Integer.parseInt(tmp);   // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
//
//		switch(month) { // ���ǹ� �ڸ��� ����, ����,���ڿ��� ��ġ �� ���ִ�.
//			case 3: 
//			case 4: 
//			case 5:
//				System.out.println("������ ������ ���Դϴ�.");
//				break;
//			case 6: case 7: case 8:
//				System.out.println("������ ������ �����Դϴ�.");
//				break;
//			case 9: case 10: case 11:
//				System.out.println("������ ������ �����Դϴ�.");
//				break;
//			default:
//		// case 12:	case 1: case 2:
//				System.out.println("������ ������ �ܿ��Դϴ�.");
//		}
//	} // main�� ��
//}
//

////4-6_1
//class FlowEx06 {
//	public static void main(String[] args) { 
//		
//		String rank = "��";
//		
//		if (rank.equals("��")) { // true,false
//			System.out.println("�ް�");
//		}
//		
//		else {
//			System.out.println("�Ʒ�");
//		}
//		
//		System.out.println();
//		
//		switch (rank) { // ������
//		
//			case "��": //��
//				System.out.println("�ް�");
//				break;
//			
//			default:
//				System.out.println("�Ʒ�");
//				break;
//		}
//	}
//}
