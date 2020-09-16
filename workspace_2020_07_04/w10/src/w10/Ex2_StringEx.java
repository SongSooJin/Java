package w10;

public class Ex2_StringEx {

	public static void main(String[] args) {
		
		String a = new String(" C#");
		String b = new String(",C++ ");

		System.out.println(a + "�� ���̴� " + a.length()); // ���ڿ��� ����(���� ����)
		System.out.println(a.contains("#")); // true
		System.out.println(a.contains("")); // true
		System.out.println(a.contains("*")); // false
		// contains() : ���ڿ��� ���� ���蹯�� �Լ� , ���ڿ����� ()���ڿ��� �ִ���
		System.out.println("-------------------------------------");
		
		a = a.concat(b); // ���ڿ� ����  : ����C#,C++����
		System.out.println(a); // ����C#,C++����
		System.out.println(a.length()); // ����C#,C++���� = 8
		System.out.println("-------------------------------------");

		a = a.trim(); // ���ڿ� �� ���� ���� ����
		System.out.println(a); // C#,C++
		System.out.println(a.length()); // 6
		System.out.println("-------------------------------------");

		a = a.replace("C#","Java"); // replace() :���ڿ� ��ġ, ���� C#�� �ִ� �ڸ��� ,�ڿ� ���ڿ��� �ٲ��
		System.out.println(a); // Java,C++
		System.out.println("-------------------------------------");

		String s[] = a.split(","); // split() : ���ڿ� �и�, ,�������� �и��ض�
		for (int i=0; i<s.length; i++) {
			System.out.println("�и��� ���ڿ�" + i + ": " + s[i]);
			// �и��� ���ڿ�0: Java , s[0] = "Java"
			// �и��� ���ڿ�1: C++ , , s[1] = "C++"
		}
		System.out.println("-------------------------------------");

		a = a.substring(5); 
		// substring() : �ε��� 5���� ������ ���� ��Ʈ�� ����
		// a = Java,C++ = 5���� C���� ���ڿ� ����
		System.out.println(a); //C++
		System.out.println("-------------------------------------");

		char c = a.charAt(2); 
		// charAt() : �ε��� 2�� ���� ����
		// a = C++ = 2���� +���� ����
		System.out.println(c); // + 
		System.out.println(a.charAt(0)); // C 		
		System.out.println("-------------------------------------");
		
	}

}