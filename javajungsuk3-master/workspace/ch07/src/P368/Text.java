//package P368;
//
//public class Text {
//
//	 public static void main(String[] args) {
//		Superman s = new Superman();
//		
//		System.out.println(s); // print �޼ҵ�� ��ü �������� ���� �ִ� ���� ������ s.tostring() ���ϰ��� ����Ѵ�.
//		System.out.println(s.toString()); 
//		// ����Ŭ���� Object�� ������ �޼ҵ� toSteing() �� "Ŭ���� �����@�ؽ��ڵ�" ���ڿ��� �����ϵ��� �ൿ�Ѵ�.
//		// �ڽ� Ŭ������ tostring() �޼ҵ带 ������ �ؼ� ��ü�� ���������� ���ڿ��� �����ִ� ����� ������ �� �ִ�. 
//		
//		String msg = s + " is a Hero!!";
//		
//		System.out.println(msg);
//	}
//}
//
//class Superman {
//	
//	String name = "clark";
//	
//	// �ǰ� : ����Ŭ������ �����ϴ� �޼ҵ� �߿��� �ʿ��ϴٸ� �������ؼ� ����ϴ� �޼ҵ尡 4���� �յ�.
//	@Override
//	public String toString() {
////		System.out.println("Superman #toString() called.");
//		return super.toString();
//		
//	}
//}