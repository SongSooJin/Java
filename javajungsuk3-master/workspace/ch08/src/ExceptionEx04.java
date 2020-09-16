//class ExceptionEx04 {
//	public static void main(String args[]) {
//			System.out.println(1);			
//			System.out.println(2);
//			try {
//				System.out.println(3);
//				System.out.println(4);
//				
//				//throw new ArithmeticException();
//				throw new RuntimeException();
//				} // 예외가 발생해야 catch문이 돌아감 
//			catch (IndexOutOfBoundsException e)	{ 
//				// try부분에서 발생한 예외 instanceof(상속관계) Exception이 true 일때
//				// Exception e = try 부분에서 발생한 예외 할당하고 catch 블록안에
//				// 코드를 수행한다.
//				System.out.println("5-1");
//				} // try-catch의 끝
//			catch (ArithmeticException e)	{ 
//				System.out.println("5-2");
//			}
//			catch (Exception e)	{ 
//				System.out.println("5-3");
//			}// 예외클래스 상속트리에서 부모클래스를 하단에 배치해야 한다.
//	
//			System.out.println(6);
//	}	// main메서드의 끝
//}
