////4-6
//import java.util.*;
//
//class FlowEx06 {
//	public static void main(String[] args) { 
//		int month = 0; // 관습적으로 0값이 1월을 의미한다.
//
//		System.out.print("현재 월을 입력하세요.>");
//
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
//		month = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환
//
//		switch(month) { // 조건문 자리에 숫자, 문자,문자열을 배치 할 수있다.
//			case 3: 
//			case 4: 
//			case 5:
//				System.out.println("현재의 계절은 봄입니다.");
//				break;
//			case 6: case 7: case 8:
//				System.out.println("현재의 계절은 여름입니다.");
//				break;
//			case 9: case 10: case 11:
//				System.out.println("현재의 계절은 가을입니다.");
//				break;
//			default:
//		// case 12:	case 1: case 2:
//				System.out.println("현재의 계절은 겨울입니다.");
//		}
//	} // main의 끝
//}
//

////4-6_1
//class FlowEx06 {
//	public static void main(String[] args) { 
//		
//		String rank = "상병";
//		
//		if (rank.equals("상병")) { // true,false
//			System.out.println("휴가");
//		}
//		
//		else {
//			System.out.println("훈련");
//		}
//		
//		System.out.println();
//		
//		switch (rank) { // 변수명
//		
//			case "상병": //값
//				System.out.println("휴가");
//				break;
//			
//			default:
//				System.out.println("훈련");
//				break;
//		}
//	}
//}
