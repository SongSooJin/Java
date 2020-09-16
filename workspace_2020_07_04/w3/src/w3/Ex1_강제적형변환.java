package w3;

public class Ex1_강제적형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 300;
		//byte b = n; //int 타입이 byte(-128<=byte<=127)로 자동 변환 안됌 
		byte b = (byte)n;
		
		System.out.println("b: "+b); //44
		
		double d = 1.9D;
		// int m = d; c언어의 경우 에러가 안나고 m에 1만 들어간다. 
		int m=(int)d; // 자바는 강제적형변환을 해야지만 들어간다.
		System.out.println("m: "+m); // 1
		
		
	}

}
