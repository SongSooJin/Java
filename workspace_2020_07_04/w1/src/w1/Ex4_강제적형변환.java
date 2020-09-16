package w1;

public class Ex4_강제적형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b = 3;
		System.out.printf(" %d + %d = %2d\n",a,b,a+b);
		System.out.printf(" %d - %d = %2d\n",a,b,a-b);
		System.out.printf(" %d * %d = %2d\n",a,b,a*b);
		System.out.printf(" %d / %d = %2f\n",a,b,(double)a/b);
		System.out.printf(" %d / %d = %.4f\n",a,b,a/(double)b);
		System.out.printf(" %d / %.1f = %5.2f\n",a,(double)b,a/(double)b); // 전체 다섯자리 확보후 소수점 2자리까지 표현하겠다.
		//System.out.printf(" %d % %d = %d\n",a,b,a%b); // error
		System.out.printf(" %d %% %d = %-2d\n",a,b,a%b);
		// %자체의 출력을 위해 %% 두번써준다.
	}

}

/*
 
강제적형변환 == 명시적형변환
형식) (바꿀자료형)변수
int b = 3;
System.out.printf(" %d / %d = %2f\n",a,b,(double)a/b);

*/

/*
	System.out.printf("%o\n",a+b); // 8진수 15
	System.out.printf("%x\n",a+b); // 16진수 d
	System.out.printf("%X\n",a+b); // 16진수 D 
 */