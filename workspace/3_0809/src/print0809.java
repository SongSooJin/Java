//1-1                                                   
//public class print0809 {
//
//	static int x = 2;
//	int y = 3;
//	
//	// static 키워드
//	// 프로그램 시작 전 메모르에 로드된다.
//	public static void main(String[] args) { 
//		System.out.println(add(x,3));
//		
//		print0809 p = new print0809();
//		// multiply 메소는 static키워드가 없으므로
//		// 메모리에 로드한 후 사용해야 한다.
//		System.out.println(p.multiply(x,3));
//	}
//	
//	private static int add(int i,int j) {
//		return i+j;
//		
//	}
//	public int multiply (int a,int b) {
//		return a*b;
//	}
//
//}

////2-6
//import java.util.*;    // Scanner를 사용하기 위해 추가
//
//public class print0809  { 
//
//	public static void main(String[] args) { 
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("두자리 정수를 하나 입력해주세요.>");
//
//		String input = scanner.nextLine();
//		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
//
//		System.out.println("입력내용 :"+input);
//		System.out.printf("num = %d%n", num);
//	} 
//
//}


////2-7
//class print0809 { 
//
//	public static void main(String[] args) { 
//
//		// 출력할때는 문자로 취급하지만 내부적인 연산을 수행할때는 숫자로 취급한다.
//		char a = 65;
//		System.out.println(a);
//		char b = 'A';
//		System.out.println(b);
//		char c ='A'+1;
//		System.out.println(c);
//		
//		char ch = 'A';	     // char ch = 65;         
//		int code = (int)ch;  // ch에 저장된 값을 int타입으로 변환하여 저장한다.
//
//		System.out.printf("%c=%d(%#X)%n", ch, code, code); 
//
//		char hch = '가';     // char hch = 0xAC00;
//		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
//	}
//
//} 

////2-8
//class print0809 {
//
//	public static void main(String[] args) {
//		
//		System.out.println("'");
//		System.out.println('\'');		     //  '''처럼 할 수 없다.
//		System.out.println("abc\t123\b456"); // \b에 의해 3이 지워진다.
//		System.out.println('\n');		     //  개행(new line)문자 출력하고 개행
//		System.out.println("\"Hello\"");	 //  큰따옴표를 출력하려면 이렇게 한다.
//		System.out.println("c:\\");
//		
//		System.out.println("111");
//		System.out.println("\n\n");
//		System.out.println("111");
//	}
//
//}
//
//// boolean : ture /flase
//// int  : 정수
//// double : 실수
//// String : 문자열 

////2-12
//class print0809 {
//
//	public static void main(String[] args) {
//
//		double d  = 85.4;
//		
//		// int < float < double
//		// 정수보다 실수형의 범위가 크다.
//		// 정수끼리는 바이트 사이즈가 큰 놈이 크다.
//		// 실수끼리는 바이트 사이즈가 큰 놈이 크다.
//		
//		int score = (int)d; //개발자가 알고있으니 값이 손실될수 있음을 알고있다.
//
//		System.out.println("score="+score);
//		System.out.println("d="+d);
//	}
//
//}

////2-13
//class print0809 {
//
//	public static void main(String[] args) {
//
//		int  i = 10;
//		byte b = (byte)i;
//		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); 
//		
//		i = 300;
//		b = (byte)i;
//		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); 
//
//		b = 10;
//		i = (int)b;
//		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); 
//
//		b = -2;
//		i = (int)b;
//		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); 
//		
//		// 십진수를 2진수로 바꿔라.
//		System.out.println("i="+Integer.toBinaryString(i));
//	}
//
//}

////3-1
//class print0809 {
//	
//	public static void main(String args[]) {
//		
//		int i=5;
//		System.out.println(i);
//		
//	
//		i = i+1;
//		System.out.println(i);
//		
//		i++;	// i=i+1;과 같은 의미이다. ++i;로 바꿔 써도 결과는 같다. 후처리 증감식
//		System.out.println(i); 
//		
//		i=5;	//	결과를 비교하기 위해 i값을 다시 5로 변경.
//		++i;	// i=i+1;과 같은 의미이다. 선처리 증감식 
//		System.out.println(i);
//		
//	}
//	
//}

////3-2
//class print0809 {
//	
//	public static void main(String args[]) {
//		// int i = 5;
//		// int j = 0;
//		int i=5, j=0;
//
//		j = i;
//		i = i+1;
//		// j = i++;
//		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);
//
//		i=5;        // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
//		j=0;
//
//		i = i +1;
//		j = i;
//		// j = ++i;
//		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
//	}
//}

////3-4
//class print0809 {
//	
//	public static void main(String[] args) {
//		
//		int i = -10;
//		i = +i;
//		System.out.println(i);
//
//		i=-10;
//		i = -i;
//		System.out.println(i);
//	}
//	
//}

////3-5
//class print0809  {
//	
//	public static void main(String args[]) { 
//	
//		int a = 10;
//		int b = 4;
//
//		System.out.printf("%d + %d = %d\n",  a, b, a + b);
//		System.out.printf("%d - %d = %d\n",  a, b, a - b);
//		System.out.printf("%d * %d = %d\n",  a, b, a * b);
//		System.out.printf("%d / %d = %d\n",  a, b, a / b);
//		System.out.printf("%d / %f = %f\n",  a, (float)b, a / (float)b);
//		
//		
//		
//		int c =3;
//		int x = c/2;	// int/int 인 경우 정수형은 소수점 부분을 버린다.
//		double y = c / 2.0;		// int / double
//		
//		System.out.println(x);
//		System.out.println(y);
//	 
//		// int result = 3 / 0; // 정수를 0으로 나눌수 없다.
//		double result = 3.0 / 0;
//		System.out.println(result);
//	
//	}
//	
//}

////3-17
//class print0809 {
//	
//	public static void main(String args[]) { 
//		
//		double pi = 3.141592; 
//		
//		// round(3.141592), 몇째자리에서 반올림)
//		System.out.println(Math.round(pi));
//		System.out.println(Math.round(pi * 10));
//		System.out.println(Math.round(pi * 10)/ (double)10);
//		System.out.println(Math.round(pi * 100));
//		System.out.println(Math.round(pi * 1000)/ (double)1000);
//		
//		double shortPi = Math.round(pi * 1000) / 1000.0;
//
//		System.out.println(shortPi);
//		
//	}
//	
//}

////3-18
//	public class print0809 {
//	
//		public static void main(String[] args) {
//		// #2 
//		Math math = new Math();	
//			
//		//double result = Math.round();
//		double result = math.round(3.141592, 4);
//		System.out.println("result = " + result);
//	}
//	
//}
//	
//	class Math {
//		
//		// #1 static 한번만 쓸경우 부적합
//		double round(double value, int position) {
//		double x = java.lang.Math.pow(10, position-1);
//		return java.lang.Math.round(value * x) /(double) x;
//		
//	}
//
//}

////3-19
//class print0809 {
//	
//	public static void main(String args[]) { 
//		
//		int x = 10;
//		int y = 8;
//
//		System.out.printf("%d을 %d로 나누면, \n", x, y); 
//		System.out.printf("몫은 %d이고, 나머지는 %d입니다.\n", x / y, x % y); 
//	
//	}
//	
//}