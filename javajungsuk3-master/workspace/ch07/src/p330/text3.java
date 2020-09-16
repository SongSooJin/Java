//package p330;
//
//public class text3 {
//
//	public static void main(String[] args) {
//		Korean[] kors = {
//				new Kimfamily(), 
//				new HongFamily(),
//				new LeeFamily()
//				};
//		
//		allplay(kors);
//	}
//
//	private static void allplay(Korean[] kors) {
//		for (int i = 0; i < kors.length; i++) {
//			kors[i].play();
//			
//			// 배열에서 꺼낸 객체가 HongFamily 이면 추가적으로  메소드를 수행한다.
//			// 배열에서 꺼낸 객체가 KimFamily 이면 추가적으로 walk() 메소드를 수행한다.
//			
//			if (kors[i] instanceof HongFamily) {
//				HongFamily hf = (HongFamily) kors[i];
//				hf.doSomethingAfterMeal();
//			} 
//			else if (kors[i] instanceof Kimfamily) {
//				Kimfamily kf = (Kimfamily) kors[i];
//				kf.walk();
//			}
//			
//		}
//	}
//}
