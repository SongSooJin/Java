package w9;

public class EX14_��Ʈ�����ͷ���_��Ʈ�������� {

	public static void main(String[] args) {

		String a = "Hello"; 
		String b = "Java"; 
		String c = "Hello";
		// == : ���۷����� ��
		if(a==c) System.out.println("a==c");
		else System.out.println("a==c");
		
		// equals : ���빰�� ��
		if(a.equals(c)) System.out.println("a equals c");
		else System.out.println("a not equals c");
		
		System.out.println();
		
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Hello");
		// == : ���۷����� ��
		if(d==f) System.out.println("d==f");
		else System.out.println("d!=f");
		
		// equals : ���빰�� ��
		if(d.equals(f)) System.out.println("d equals f");
		else System.out.println("d not equals f");
		
		System.out.println("---------------------------------------------");
		String s = new String("Hello"); 	// s�� ��Ʈ���� ���� �Ұ���
		System.out.println("s : " + s);
		s  = s.concat("Java");
		System.out.println("s : " + s);
		
		String t = s.concat("Java"); 	// ��Ʈ�� s�� "Java"�� ������ ��Ʈ�� ����
		System.out.println("t : " + t);
	}

}
