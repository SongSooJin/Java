package day4;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class day4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 InputStream in = new FileInputStream("d:\\a.txt"); // ���� 1����Ʈ
		// Reader in = new FileReader("d:\\a.txt"); // �ѱ� 2����Ʈ 
		 BufferedReader br = new BufferedReader(new InputStreamReader(in,"euc-kr"));
		
		 String line = null;
		 if((line = br.readLine()) != null ) System.out.println(line);
		 
//		int count = 0;
//		
//		for (int b; (b = in.read()) != -1;) {
//			++count;
//			System.out.println(b);
//		}
//		
//		System.err.println(count + "����Ʈ ����...");
//		in.close();
	}

	
	
}
