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
//			// �迭���� ���� ��ü�� HongFamily �̸� �߰�������  �޼ҵ带 �����Ѵ�.
//			// �迭���� ���� ��ü�� KimFamily �̸� �߰������� walk() �޼ҵ带 �����Ѵ�.
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
