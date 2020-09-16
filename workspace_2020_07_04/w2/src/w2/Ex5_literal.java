package w2;

public class Ex5_literal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String na = "홍 길 동", nb = "홍길동", nc = "홍길동";
		//문자열 즉 String의 비교는 String의 객체1.equals(String객체2)의 반환값으로
		System.out.println(na.equals(nb)); //false
		System.out.println(na.equals(nc)); //true
		
		/*
		//null 리터럴 : 레퍼런스에 대입 사용
		//int ia=null; 
		String name="이 이";
		String irum=null;
		String irum1="";
		System.out.println("name:"+name);
		System.out.println("irum:"+irum);
		System.out.println("irum1:"+irum1);
		*/
		
		/*
		boolean a = true;
		boolean b = 10>0; // 10>0가 참이므로 b값은 true
		boolean c = 10<0;
		System.out.printf("a: %b\n",a);
		System.out.printf("b: %b\n",b);
		System.out.printf("c: %b\n",c);
		*/
		
		/*
		char a = 'w';
		char b = '글';
		char c = '\uae00';
		System.out.printf("a : %c\n",a);
		System.out.printf("b : %c\n",b);
		System.out.printf("c : %c\n",c);
		*/
		
		
		/*
		float f = 0.1234f;
		System.out.printf("f: %f\t w:%.4f\n",f,f); //0.123400 0.1234
		
		double w = .1234D; // .1234D와 .1234는 동일
		System.out.printf("w: %f\t w:%.4f\n",w,w); //0.123400 0.1234
		*/
		
		/*
		double d = 0.1234;
		double e = 1234E-4; // 1234E-4 = 1234x10-4이므로 0.1234와 동일
		System.out.printf("d: %f\n",d);
		System.out.printf("e: %f\n",e);
		System.out.printf("d: %.4f\n",e);
		System.out.printf("e: %.4f\n",e);
		System.out.printf("d: %e\n",e);
		System.out.printf("e: %e\n",e);
		*/
		
		/*
		long g = 24; //long형은 8byte
		System.out.printf("g : %d\n",g);
		long h = 2147483648L;
		System.out.printf("h : %d\n",h);
		*/
		
		/*
		// 정수 리터럴
		int n = 15;
		int m = 015; // 8진수 1 5
		int k = 0x15; // 16진수 1 5
		int b = 0b0101; //2진수 0101
		System.out.printf("n: %d\n",n); // 15
		System.out.printf("m: %d\t8진수:%o\n",m,m); // 13 8진수:15
		System.out.printf("k: %d\t16진수:%x\n",k,k); // 21 16진수:15
		System.out.printf("b: %d\n",b); // 5
		*/
		
	}

}
