//// A개발자가 작성
//class Parent {
//	void parentMethod() {
//		System.out.println("Parent");
//	}
//}
//
//// B개발자가 작성
//class Child extends Parent {
//
//	// 애너테이션(주해)
//	// 소스코드안에 다른 프로그램을 위한 정보를 포함시키는 기술
//	@Override
//	void parentMethod() {
//		System.out.println("Child");
//	}
//}
//
////class Child extends Parent {
////	@Override
////	void parentmethod() { } // 조상 메서드의 이름을 잘못적었음. 
////}
//
//public class AnnotationEx1 {
//	public static void main(String[] agrs) {
//		Parent c = new Child();
//		((Child)c).parentMethod();
//	}
//}