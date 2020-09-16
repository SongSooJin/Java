import java.util.Scanner;

////0-4
//import java.util.Scanner; 
//// import 자동 추가 단축키 : 컨트롤 쉬프트 o키
//
//public class text2_0809 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		// 콘솔로 숫자를 1개 받는다.
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("숫자를 하나 입력하세요: ");
//		
//		String number = scan.nextLine();
//		
//		System.out.println("입력된 숫자 =  " + number);
//		
//		// 짝수 , 홀수 여부를 콘솔에 출력한다.
//		
//		int num = Integer.parseInt(number);
//		
//		if ((num %2)==0) {
//			
//			System.out.println("짝수");
//		} 
//		
//		else {
//			System.out.println("홀수");
//		}
//		
//		if (num %2!=0) {
//			
//			System.out.println("홀수");
//		} 
//		
//		else {
//			System.out.println("짝수");
//		}
//		
//	}
//
//}

////3-21
//class text2_0809 {
//	
//	public static void main(String args[]) { 
//		
//		System.out.printf("10 == 10.0f  \t %b\n", 10 == 10.0f);
//		System.out.printf("'0'== 0      \t %b\n", '0'== 0);
//		System.out.printf("'\\0'== 0    \t %b\n", '\0'== 0);
//		System.out.printf("'A'== 65     \t %b\n", 'A'== 65);
//		System.out.printf("'A' > 'B'    \t %b\n", 'A' > 'B');
//		System.out.printf("'A'+1 != 'B' \t %b\n", 'A'+1 != 'B');
//		
//		System.out.println('b' >= 'A'+1); //왼쪽이 오른쪽보다 크면 true, 왼쪽이 오른쪽과 같으면 true
//	
//	}
//
//}

//3-23
class text2_0809 {
	
	public static void main(String[] args) {
		// 문자열은 new 연산자 없이 다음과 같은 짧은 문법으로 등록하는 것을 권장한다.
		// 다음 문법으로 문자열을 저장하고자 시도하면 
		// 해당 문자열이 이미 메모리에 존재하는지 확인하고 있으면 그대로 사용하고, 없으면 새로운 객체를 만들어서 참조를 할당한다.
		// 문자열 불변방식으로 관리된다.
		String str1 = "abc"; // <== new
		
		String a = str1;
		String b = "abc"; // 위에서 만든객체 참조 ,새로 메모리를 만들지 않음 
		
		// 문자열 데이터의 재 사용성을 극대화하여 메모리를 아끼고자
		// 해당 문자열을 갖고있는 String 객체가 존재하면 그 객체를 그대로 사용한다.
		

		System.out.println(b.length());
		System.out.println("abc".length()); // "문자열" 하는 것만으로 String 객체로 인정한다.
		
		System.out.println(str1==a);
		System.out.println(str1==b);
		
		// String도 클래스이기 때문에 원한다면 new 연산자로 객체를 만들고 그 객체가 문자열을 보관하도록 할 수 있다.
		
		String str2 = new String("abc");

		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc");
		// 문자열은 힙영역에 객체가 갖고 있다.
		// 그런데 비교연산자 == 로 비교를 시도하면 이는 참조값을 비교하는 것이므로 
		// 실제값을 보관하는 값을 비교하고자 할 때 적당하지 않다.
		// 변수가 가리키는 실제 객체가 보관하는 문자열 자체를 비교하고자 할 때 equals 메소드를 사용해야 한다.
		System.out.println();
		System.out.println(str1==str2);		//false
		System.out.println(str1.equals(str2));		//true, 99% 이렇게 비교해야하는 경우가 대부분이다.
		System.out.println();

		
		
		
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	
	}
	
}

////3-24
//class text2_0809 {
//	public static void main(String args[]) { 
//		int  x = 0;
//		char ch = ' ';
//
//		x = 15;
//		System.out.printf("x=%2d, 10 < x && x < 20 =%b\n", x, 10 < x && x < 20);
//		// x=15; 10< x && x < 20 = true
//		
//		x = 6;
//		System.out.printf("x=%2d,  x%%2==0 || x%%3==0  && x%%6!=0 =%b\n", 	
//			x , (x %2 == 0) || ((x %3==0) && (x%6 != 0)));
//		// x = 6, x%2==0 || x%3==0 && x%6 !=0 = true	
//		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 =%b\n", x,(x%2==0||x%3==0)&&x%6!=0);
//
//		ch='1';
//		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b\n", ch, '0' <= ch && ch <='9');
//
//		ch='a';
//		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b\n", ch, 'a' <= ch && ch <='z');
//
//		ch='A';
//		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' =%b\n", ch, 'A' <= ch && ch <='Z');
//
//		ch='q';
//		System.out.printf("ch='%c', ch=='q' || ch=='Q' =%b\n", ch, ch=='q' || ch=='Q');
//	}
//}

////3-26
//class text2_0809 {
//	
//	public static void main(String[] args) { 
//		
//		int a = 5;
//		int b = 0;
//
//		System.out.printf("a=%d, b=%d%n", a, b);
//		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
//		
//		System.out.printf("a=%d, b=%d\n", a, b);
//		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
//		
//		System.out.printf("a=%d, b=%d%n", a, b);
//		
////		Scanner scan = new Scanner(System.in);
////		System.out.print("영어점수를 입력하세요: ");
////		int eng = scan.nextInt();
////		
////		System.out.print("수학점수를 입력하세요: ");
////		int math = scan.nextInt();
////		
////		if (eng >= 90 && math >= 90) {
////			System.out.print("A");
////		}
////		else if (eng >= 80 && math >= 80) {
////			System.out.print("B");
////		}
////		else if (eng >= 70 && math >= 70) {
////			System.out.print("C");	
////		}	
//		
//		int x = 2;
//		System.out.println(x>3 || 3/0 > 2);
//		
//	} // main의 끝
//	
//}

////3-27
//class text2_0809 {
//	
//	public static void main(String[] args) { 
//		
//		boolean  b  = true; 
//		char ch = 'C';
//		
//		System.out.printf("b=%b\n", b);
//		System.out.printf("!b=%b\n", !b);
//		System.out.printf("!!b=%b\n", !!b);
//		System.out.printf("!!!b=%b\n", !!!b);
//		System.out.println();
//
//		System.out.printf("ch=%c\n", ch);
//		System.out.printf("ch < 'a' || ch > 'z'=%b\n", ch < 'a' || ch > 'z');
//	    System.out.printf("!('a'<=ch && ch<='z')=%b\n", !('a'<= ch && ch<='z'));
//	    System.out.printf("  'a'<=ch && ch<='z' =%b\n",   'a'<=ch && ch<='z');
//	
//	} // main의 끝
//	
//}

////3-32
//class text2_0809 {
//	
//	public static void main(String args[]) { 
//		int ssn = 2;
//		boolean condition = true; 
//		
//		if (ssn==1) {
//			// 조건이 true면 이 영역한에 코드를 수행한다.
//			System.out.println("남성");
//		} else {
//			// 조건이 false면 이 영역한에 코드를 수행한다.
//			System.out.println("여성");
//		}
//
//		// if ~else 구문을 삼항연산자로 치환해서 표현 할수있다.
//		System.out.println(ssn == 1 ? "남성" : "여성");
//		
//		int  x, y, z;
//		int  absX, absY, absZ;
//		char signX, signY, signZ;
//
//		x = 10;
//		y = -5;
//		z = 0;
//		// 삼항연산자
//		// 1항 ? 2항 : 3 항
//
//		absX = x >= 0 ? x : -x;  // x의 값이 음수이면, 양수로 만든다.
//		absY = y >= 0 ? y : -y;
//		absZ = z >= 0 ? z : -z;
//
//		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');  // 조건 연산자를 중첩
//		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-'); 
//		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); 
//
//		System.out.printf("x=%c%d\n", signX, absX);
//		System.out.printf("y=%c%d\n", signY, absY);
//		System.out.printf("z=%c%d\n", signZ, absZ);
//		
//	}
//	
//}

////0-5
//class text2_0809 {
//	
//	public static void main(String args[]) { 
//
//	int a =  10;
//	
//	a = a +3;
//	
//	System.out.println(a);
//	
//	a += 3;
//	System.out.println(a);
//		
//	int i = 1;
//	
//	i += 2;
//	i *= 2;
//	System.out.println(i);
//		
//	}
//	
//}


////4-1
//class  text2_0809  {
//	
//	public static void main(String[] args) { 
//		int x= 0;
//
//		System.out.printf("x=%d 일때, 참인 것은%n", x);
//
////		if (x == 0) {
////			System.out.println("x==0");
////		}
//		
//		//조건문의 범위연산자를 생략하면 다음 ; 새미콜론을 만날때까지 범위를 삼는다. 
//		if(x!=0) System.out.println("x!=0");
//		if(!(x==0)) System.out.println("!(x==0)");
//		if(!(x!=0)) System.out.println("!(x!=0)");
//		System.out.println();
//
//		x = 1;
//		System.out.printf("x=%d 일때, 참인 것은%n", x);
//
//		if(x==0) System.out.println("x==0");
//		if(x!=0) System.out.println("x!=0");
//		if(!(x==0)) System.out.println("!(x==0)");
//		if(!(x!=0)) System.out.println("!(x!=0)");
//		
//	}
//	
//}


////4-2
//class text2_0809 {
//
//	public static void main(String[] args) {
//
//		int input;
//
//		System.out.print("숫자를 하나 입력하세요.>");
//
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
//		input = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
//
//		if (input == 0) {
//			System.out.println("입력하신 숫자는 0입니다.");
//		}
//
//		if (input != 0)
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//		System.out.println("입력하신 숫자는 " + input + "입니다.");
//
//		some();	
//	} // main의 끝
//
//	
//	static void some() {
//		if (true) {
//			System.out.println("Hello ");
//			
//		}
//		if (true) 
//		{
//			System.out.println("World! ");
//			
//		}
//	}
//}


////4-2
//class text2_0809 {
//	
//	public static void main(String[] args) {  
//		
//		int input;
//
//		System.out.print("숫자를 하나 입력하세요.>");
//
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
//		input = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환
//
//		if(input==0) {
//			System.out.println("입력하신 숫자는 0입니다.");	
//		} else { // input!=0인 경우
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//		}
//	
//	} // main의 끝
//	
//}


////4-4
//class text2_0809Ex4 {
//	public static void main(String[] args) { 
//		int score  = 0;   // 점수를 저장하기 위한 변수
//		char grade =' ';  // 학점을 저장하기 위한 변수. 공백으로 초기화한다.
//
//		System.out.print("점수를 입력하세요.>");
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
//		score = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환
//
//		if (score >= 90) {         // score가 90점 보다 같거나 크면 A학점
//			 grade = 'A';             
//		} else if (score >=80) {   // score가 80점 보다 같거나 크면 B학점 
//			 grade = 'B'; 
//		} else if (score >=70) {   // score가 70점 보다 같거나 크면 C학점 
//			 grade = 'C'; 
//		} else {                   // 나머지는 D학점
//			 grade = 'D'; 
//		}
//            
//		System.out.println("당신의 학점은 "+ grade +"입니다."); 
//	}
//}

////4-5
//class text2_0809 {
//	public static void main(String[] args) { 
//		int  score = 0;
//		char grade = ' ';
//		char opt   = '0';
//
//		System.out.print("점수를 입력해주세요.>");
//
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
//		score = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환
//		
//		System.out.printf("당신의 점수는 %d입니다.", score);
//
//		if (score >= 90) {		      // score가 90점 보다 같거나 크면 A학점(grade)
//			grade = 'A';
//			if (score >= 98) { 	      // 90점 이상 중에서도 98점 이상은 A+
//				opt = '+';	
//			} else if (score < 94) {  // 90점 이상 94점 미만은 A-
//				opt = '-';
//			}
//		} else if (score >= 80){	  // score가 80점 보다 같거나 크면 B학점(grade)
//			grade = 'B';
//			if (score >= 88) {
//				opt = '+';
//			} else if (score < 84)	{
//				opt = '-';
//			}
//		} else {				      // 나머지는 C학점(grade)
//			grade = 'C';
//		}
//			
//		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
//	}
//}

