package w3;
//자료형의 byte수가 큰것이 우선순위가 높다. 
//byte형 + int형의 연산시 int형(byte형이 자동형변환) + int형으로 연산

public class Ex2_타입변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 127;
		int i = 100;

		System.out.println(b+i); 			// b가 int 타입으로 자동 변환 227
		System.out.println(10/4);        //2
		System.out.println(10.0/4); 	// 4가 4.0으로 자동 변환 2.5
		int h = 0x12340041; // -2147483648<=int<=2147483647
		System.out.println("h: " + h); //305397825
		char c = (char)h;
		int c1 = c;
		System.out.printf("c: %d\n",c1); // 65
		System.out.println("c: "+c); //A
		System.out.println((char)0x12340041); //자바의 char형은 2byte  A
		System.out.println((byte)(b+i)); //-29
		System.out.println((int)2.9 + 1.8); //2+1.8 --> 2.0(자)+1.8 --> 3.8
		System.out.println((int)(2.9 + 1.8)); //(int)(4.7) --> 4
		System.out.println((int)2.9 + (int)1.8); // 2 + 1 --> 3

		
	}

}
