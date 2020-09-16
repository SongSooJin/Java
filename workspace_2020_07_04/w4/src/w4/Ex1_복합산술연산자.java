package w4;

public class Ex1_복합산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;
		a += 3; //a= a + 3;
		System.out.println("a: "+a); // 103
		a -= 10; // == a = a - 10;
		System.out.println("a: "+a); // 93
		a*=3; //== a=a*3;
		System.out.println("a: "+a); // 279
		a /=10; // == a=a/10;
		System.out.println("a: "+a); // 27
		a%=5;
		System.out.println("a: "+a); // 2
		
		
		
	}

}


/*
 * 복합산술연산자 : +=, -=,*=,/=,%=
 * 1) a +=3; == a=a+3;
 * 2) a-=10; == a=a-10;
 * 3) a*=3; == a=a*3;
 * 4) a/=10; == a=a/10;
 * 5) a%=5; == a=a%5;
 * 
  */
