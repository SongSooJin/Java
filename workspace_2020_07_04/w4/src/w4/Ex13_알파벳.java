package w4;
/*
 * 'a'���� 'z'���� ���
 */
public class Ex13_���ĺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char ch = 'a'; //-32768<=char(2)<=32767
				
				do {
					System.out.print(ch);
					ch = (char) (ch + 1); //����������ȯ ����
				} while (ch <= 'z');
				
				
	}

}
