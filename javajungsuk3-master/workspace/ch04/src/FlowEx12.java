////4-12
//class FlowEx12 {
//	int count = 20; // 멤버변수 : 클래스를 new 할 때 만들어지는 객체의 기본 멤버가 된다.
//	
//	void print(int count) { // 파라미트 변수 : 메소드가 호출될때 외부에서 전달한 값이 할당되면서 만들어 진다.
//		
//	}
//	
//	public static void main(String[] args) { 
//		
////		int count = 10; // 지역변수 : 코드 처리의 흐름이 도달 할 때 자동으로 메모리에 변수가 만들어 진다.값은 직접 할당해야 한다.
////		
////		if (true) {
////			// 범위연산자를 기분으로 안쪽에서 바깥쪽에 있는 변수는 접근해서 사용할 수 있다.
////			int count2 = count;
////			int count3 = 20;
////		}
////			// 범위연산자를 기준으로 안쪽에서 선언한 변수는 바깥쪽에서 접근해서 사용할수 없다.
////			int count4 = count3;
////			
////			
////		for (초기식; 조건식; 증감식) {
////			System.out.println("코드1");
////			System.out.println("코드2");
////			System.out.println("코드3");
////		}
////		
//		// 조건식 : 최초에 한번만 수행된다.
//		// 조건식 처리 결과가 true 이면 for문 범위안에 코드를 수행하고 그렇지 않으면 for문을 벗어난다.
//		// 증감식 : for문 범위안에 코드를 수행한 후 반복적으로 수행하야 하는 구문을 배치하는 곳이고 다음으로
//		// 조건식이 처리된다.
//		for (int i = 0; i < 3; i++) {
//			System.out.println("i = " + i);
//		}
//		//int k = i;
//		
//		for(int i=1;i<=5;i++)
//			System.out.println(i); // i의 값을 출력한다.
//
//		for(int i=1;i<=5;i++)
//			System.out.print(i);  // println()대신 print()를 쓰면 가로로 출력된다.
//
//		System.out.println();
//	}
//}
