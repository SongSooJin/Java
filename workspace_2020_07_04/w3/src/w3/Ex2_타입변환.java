package w3;
//�ڷ����� byte���� ū���� �켱������ ����. 
//byte�� + int���� ����� int��(byte���� �ڵ�����ȯ) + int������ ����

public class Ex2_Ÿ�Ժ�ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 127;
		int i = 100;

		System.out.println(b+i); 			// b�� int Ÿ������ �ڵ� ��ȯ 227
		System.out.println(10/4);        //2
		System.out.println(10.0/4); 	// 4�� 4.0���� �ڵ� ��ȯ 2.5
		int h = 0x12340041; // -2147483648<=int<=2147483647
		System.out.println("h: " + h); //305397825
		char c = (char)h;
		int c1 = c;
		System.out.printf("c: %d\n",c1); // 65
		System.out.println("c: "+c); //A
		System.out.println((char)0x12340041); //�ڹ��� char���� 2byte  A
		System.out.println((byte)(b+i)); //-29
		System.out.println((int)2.9 + 1.8); //2+1.8 --> 2.0(��)+1.8 --> 3.8
		System.out.println((int)(2.9 + 1.8)); //(int)(4.7) --> 4
		System.out.println((int)2.9 + (int)1.8); // 2 + 1 --> 3

		
	}

}
