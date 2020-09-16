package p20_0808; 
import java.util.*;    // Scanner를 사용하기 위해 추가
//java.util.*; 패키지 밑에 존재하는 *(모든) 클래스들을 이 클래스 (p28_2_0808)에서 사용할때]
// 패키지명은 생략하고 클래스 명 만으로도 짧게 사용할 수 있게 만든다.

public class p28_2_0808 {

	public static void main(String[] args) { //메소드 영역 = 파라미터 + 범위연산자 시작~끝
		
		// 숫자 리터럴
		// 정수로 선언하면 자동적으로 int 자료형으로 취급한다.
		// 실수로 선언하면 자동적으로 double 자료형으로 취급한다.
		
//1-1		short x = 1;
//		int y = x; //자동 형변환! 묵시적 형변환!
//		//	x = y; //큰 박스의 값을 작은 박스에 옮길때 값의 손실이 있다면 자바는 자동적으로 수행하지 않는다.
//		x = (short) y; // (자료형) : 형변환연산자, 지정된 자료형으로 변환한 후 사용한다. 명시적 형변환!
//		
//		
//		//int z = 2200000000;
//		
//		double a = 0;
//		//위 코드는 다음 코드와 의미적으로 같다. double a = (double) (int) 0;
//		
//		float b =1;
//		// 위 코드는 다음 코드와 의미적으로 같다. float b = (float) (int) 1;
//		
//		double c = 0.12;
//		// 위 코드는 다음 코드와 의미적으로 같다. double c = (double) 0.12;
//		
//		//float d = 1.0;
//		// 위코드는 다음 코드와 의미적으로 같다. float d = (double) 1.0;
//		
//		float f1 = (float) 1.0;
//		float f2 = 1.0f;
//		
//		long big = 100_000_000;
		
//1-2	String firstName = "Tom";
//		String laststName = "Cruise";
//		
//		System.out.println(firstName + laststName);
//		
//		int num = 10;
//		String number = "10";
//
//		System.out.println(num + number); //1010
//		
//		String name = "Ja" + "va";
//		String str  = name + 8.0;
//
//		System.out.println(name);
//		System.out.println(str);
//		System.out.println(7 + " ");
//		System.out.println(" " + 7);
//		System.out.println(7 + "");
//		System.out.println("" + 7);
//		System.out.println("" + "");
//		
//		System.out.println(7 + 7 + ""); // 14
//		System.out.println("" + 7 + 7); // 77
//		
//		// 컨트롤 알트 화살표 아래키 : 한줄복사
//		System.out.println("" + (7 + 7)); // ():우선순위 연산자 14
		
//1-3	byte  b = 1;
//		short s = 2;
//		char  c = 'A';
//
//		int  finger = 10; 
//		long big = 100_000_000_000L;   
//		
//		long oct = 077; // 8진수
//		
//		// 10진수 : 0,1,2...9
//		// 16진수 : 0,1,2....9,A,B,C,D,E,F ex) color표현
//		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;  // long hex = 0xFFFFFFFFFFFFFFFFL;
//
//		int octNum = 010;       //  8진수 10, 10진수로는 8
//		int hexNum = 0x10;      // 16진수 10, 10진수로는 16
//		int binNum = 0b10;      //  2진수 10, 10진수로는 2
//		
//		
//		System.out.println("출력 줄바꿈 있음");	
//		System.out.print("출력 줄바꿈 없음");
//		System.out.println("출력 줄바꿈 있음");	
//		
//		// 자료형에 따른 위치보유자 문법,특수기호를  사용할수 있다.
//		// %d는 숫자(decimal) , %b 줄바꿈 ,%c char형, 
//		System.out.printf("b=%d%n", b);
//		System.out.printf("s = %d %n", s);
//		System.out.printf("c=%c, %d %n", c, (int)c);
//		System.out.printf("finger=[%5d]%n",  finger);
//		System.out.printf("finger=[%-5d]%n", finger);
//		System.out.printf("finger=[%05d]%n", finger);
//		System.out.printf("big=%d%n", big);
//		System.out.printf("hex=%#x%n", hex); // '#'은 접두사(16진수 0x, 8진수 0)
//		System.out.printf("octNum=%o, %d%n", octNum, octNum);   
//		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);   
//		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);  
//		
//		int x1 = 1;
//		int x2 = 2;
//		int x3 = 3;
//		
//		System.out.println("x1:" + x1 +"x2:"+x2+"x3:"+x3);
//		System.out.printf("x1:%dx2:%dx3:%d",x1,x2,x3);
//		System.out.println();
//		System.out.println("done");	
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("두자리 정수를 하나 입력해주세요.>");

		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n", num);
		
		}
		
	}
	

