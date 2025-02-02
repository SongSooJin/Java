//import java.lang.annotation.*;
//
//@Deprecated
//@SuppressWarnings("1111") // 유효하지 않은 애너테이션은 무시된다.
//@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))
//class AnnotationEx5 {
//	public static void main(String args[]) {
//		// AnnotaionEx5의 Class객체를 얻는다.
//		Class<AnnotationEx5> cls = AnnotationEx5.class;
//
//		TestInfo anno = (TestInfo) cls.getAnnotation(TestInfo.class);
//		System.out.println("anno.testedBy()=" + anno.testedBy());
//		System.out.println("anno.testDate().yymmdd()=" + anno.testDate().yymmdd());
//		System.out.println("anno.testDate().hhmmss()=" + anno.testDate().hhmmss());
//
//		for (String str : anno.testTools())
//			System.out.println("testTools=" + str);
//
//		System.out.println();
//
//		// AnnotationEx5에 적용된 모든 애너테이션을 가져온다.
//		Annotation[] annoArr = cls.getAnnotations();
//
//		for (Annotation a : annoArr)
//			System.out.println(a);
//	} // main의 끝
//}
//
//@Target(value = {
//		ElementType.TYPE, 	//  class, interface, enum
//		ElementType.FIELD, 	// 멤버변수
//		ElementType.METHOD,	// 멤버변수
//		ElementType.CONSTRUCTOR,	// 생성자
//		ElementType.PARAMETER, 	// 메소드의 파라미터 
//		
//})
//@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 지정
//@interface TestInfo {
//	// count 키 값으로 int를 받아서 보관한다.
//	// 단, 값을 안주면 대신 기본값으로 1을 보관하겠다.
//	int count() default 1;
//
//	String testedBy();
//
//	String[] testTools() default "JUnit";
//
//	TestType testType() default TestType.FIRST;
//
//	DateTime testDate();
//}
//
//// 애노테이션을 새로 만들면서 애노테이션 설정정보를 셋팅하기 위해서
////사용하는 메타정보를 가지고  애노테이션
////SOURCE(~.java 일때만 유지) ==> Class(~.class 컴파일 후에도 유지)==> RUNTIME(객체상태에서도 유지)
//@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 지정
//@interface DateTime {
//	//  yymmdd 키 값으로 String 값을 받아서 보관한다.
//	String yymmdd();
//
//	String hhmmss();
//}
//
//enum TestType {
//	FIRST, FINAL
//}
