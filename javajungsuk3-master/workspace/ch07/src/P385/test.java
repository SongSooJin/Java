//package P385;
//
//// 상속은 단일상속만 가능하지만
//// 구혀은 다중구현이 가능하다. 
//public class test {
//	
//	public static void main(String[] args) {
//	
//		Gildong g1 = new Gildong();
//		g1.play();
//		g1.fly();
//		g1.swim();
//		g1.doSomethingAfterMeal();
//		 System.out.println();
//		 
//		Korean g2 = new Gildong();
//		g2.play();
//		((Gildong)g2).fly(); // 다운캐스팅을 해야함
//		((Gildong)g2).swim();
//		((Gildong)g2).doSomethingAfterMeal();
//		 System.out.println();
//		 
//		Flyable g3 = new Gildong();
//		((Gildong)g3).play(); // 다운캐스팅을 해야함
//		g3.fly();
//		((Gildong)g3).swim();
//		((Gildong)g3).doSomethingAfterMeal();
//		 System.out.println();
//		 
//		Swimmable g4 = new Gildong();
//		((Gildong)g4).play(); // 다운캐스팅을 해야함
//		((Gildong)g4).fly();
//		g4.swim();
//		((Gildong)g4).doSomethingAfterMeal();
//		 System.out.println();
//		 
//		Jimae j1 = new Jimae();
//		Korean j2 = new Jimae();
//		Flyable j3 = new Jimae();
//		Jimae j4 = new Jimae();
//		
//		// 날 수있는 객체들 다 모여봐
//		 Flyable[] delinquent  = {
//				 new Gildong(),
//				 new Jimae(),
//				 new TomCruise()
//		 };
//		
//		 System.out.println();
//		 LetsFly(delinquent);
//		 
//		 System.out.println();
//		 whyUseParamAsInterface(new Gildong());
//		 whyUseParamAsInterface(new Jimae());
//		 whyUseParamAsInterface(new TomCruise());
//		 // 전달하고자 하는 파라미터 객체의 자료형이 바뀔 때마다 메소드가 하나씩 추가되어야 하는 상홥입니다... 
//		 
//	}
//
//	private static void whyUseParamAsInterface(Flyable x) {
//		x.fly();
//	}
//	
//	private static void whyUseParamAsInterface(Gildong x) {
//	x.fly();
//}
//	
////	private static void whyUseParamAsInterface(TomCruise x) {
////		x.fly();
////	}
////
////	private static void whyUseParamAsInterface(Jimae x) {
////		x.fly();
////	}
////
////	private static void whyUseParamAsInterface(Gildong x) {
////		x.fly();
////	}
//
//	private static void LetsFly(Flyable[] delinquent) {
//		for (Flyable flyable : delinquent) {
//			flyable.fly();
//			
//		}
//	}
//	
//}
