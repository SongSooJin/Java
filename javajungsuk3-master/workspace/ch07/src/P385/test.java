//package P385;
//
//// ����� ���ϻ�Ӹ� ����������
//// ������ ���߱����� �����ϴ�. 
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
//		((Gildong)g2).fly(); // �ٿ�ĳ������ �ؾ���
//		((Gildong)g2).swim();
//		((Gildong)g2).doSomethingAfterMeal();
//		 System.out.println();
//		 
//		Flyable g3 = new Gildong();
//		((Gildong)g3).play(); // �ٿ�ĳ������ �ؾ���
//		g3.fly();
//		((Gildong)g3).swim();
//		((Gildong)g3).doSomethingAfterMeal();
//		 System.out.println();
//		 
//		Swimmable g4 = new Gildong();
//		((Gildong)g4).play(); // �ٿ�ĳ������ �ؾ���
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
//		// �� ���ִ� ��ü�� �� �𿩺�
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
//		 // �����ϰ��� �ϴ� �Ķ���� ��ü�� �ڷ����� �ٲ� ������ �޼ҵ尡 �ϳ��� �߰��Ǿ�� �ϴ� ���d�Դϴ�... 
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
