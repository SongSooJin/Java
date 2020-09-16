package w10;

/*
 * StringTokenizer
 * 
 * ���� ���ڸ� �������� ���ڿ��� �и��ϴ� Ŭ����
 * ���� ����(delimiter) : ���ڿ��� ������ �� ���Ǵ� ����
 * ��ū(token) : ���� ���ڷ� �и��� ���ڿ�
 */

import java.util.StringTokenizer;

public class Ex5_StringTokenizerŬ���� {

	public static void main(String[] args) {
		
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");

		int n = st.countTokens(); 					// countTokens() : �и��� ��ū ����, ��ū ���� �˾Ƴ���
		System.out.println("��ū ���� = " + n); // ��ū ���� = 3

		while(st.hasMoreTokens()) { 
			String token = st.nextToken(); 		// nextToken() : ��ū ��� , ���� ��ū ����
			System.out.println(token); 				// ��ū ���
		}

		System.out.println("----------------------------------------");
		
		String query1 = "name=kitae&addr=seoul&age=21";
		StringTokenizer st1 = new StringTokenizer(query1, "&="); // ���� ���ڴ� 2�� , '&'�� '=' 


		int n1 = st1.countTokens(); 					// countTokens() : �и��� ��ū ����, ��ū ���� �˾Ƴ���
		System.out.println("��ū ���� = " + n1); // ��ū ���� = 6

		while(st1.hasMoreTokens()) { 
			String token = st1.nextToken(); 		// nextToken() : ��ū ��� , ���� ��ū ����
			System.out.println(token); 				// ��ū ���
		}


	}

}
