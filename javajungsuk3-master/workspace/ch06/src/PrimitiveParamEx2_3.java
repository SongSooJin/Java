//
//
//class PrimitiveParamEx2_3 {
//		static int count = 0;
//		
//		public static void main(String[] args) throws InterruptedException {
////			A a1 = new A();
////			A a2 = new A();
//			// 객체 생성은 개발자가 직접하지만 사용한 객체의 파괴는 개발자가 파과하지않고 가비지 콜렉텉가 대신 수행한다.
//			// 가비지콜렉터는 힘메모리에 존재하는 객체를 참조하는 변수가 없다면 아무도 사용하지 않는다고 판단하여 파괴하는 작업을 수행한다.
//			// 가비지콜렉터의 작업일정은 알 수없다.
//			p();
//		}
//		
//		// 메소드를 호출할 때마다 그 메소드 로직 처리를 위한 메모리공간을 새롭게 할당된다.
//		private static void p() throws InterruptedException {
//				if (count < 5) {  // 재귀호출은 무한루프에 빠지지 않도록 반드시 무한루프를 벗어사는 로직이 필요하다.
//				count++;
//				
//				System.out.println("Hello" + count);
//				Thread.sleep(500);
//				p(); //재귀호출 (자신이 자신을 부름)
//				}
//		}
//	}
//
