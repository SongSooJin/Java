//// A�����ڰ� �ۼ�
//class Parent {
//	void parentMethod() {
//		System.out.println("Parent");
//	}
//}
//
//// B�����ڰ� �ۼ�
//class Child extends Parent {
//
//	// �ֳ����̼�(����)
//	// �ҽ��ڵ�ȿ� �ٸ� ���α׷��� ���� ������ ���Խ�Ű�� ���
//	@Override
//	void parentMethod() {
//		System.out.println("Child");
//	}
//}
//
////class Child extends Parent {
////	@Override
////	void parentmethod() { } // ���� �޼����� �̸��� �߸�������. 
////}
//
//public class AnnotationEx1 {
//	public static void main(String[] agrs) {
//		Parent c = new Child();
//		((Child)c).parentMethod();
//	}
//}