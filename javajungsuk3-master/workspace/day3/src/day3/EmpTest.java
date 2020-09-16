//package day3;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//// 인터페이스는 상수와 추상메소드만 쓸수 있다./ 수평적개념 / 인터페이스 자동 Public 
//// 공통적인 사항들 
//interface Emp {
//	static final String compName = "TopCredu";
//	// 추상메소드
//	public abstract void work();
//}
//
//// abstract : 어떤 클래스가 구체적이지 않을때
////abstract class Emp {
////	int empno; // 변수 : 어떤 클래스의 속성 ,상태를 나타냄
////
////	void gotoOffice() {
////		System.out.println(empno + "가(이) 출근합니다.");
////	}
////
////	// 추상메소드- 자식들이 너희에 맞게 써라 
////	// 추상메소드가 하나라도 있으면 클래스에도 반드시 붙어야함 (abstract)
////	abstract void work();
////	public String toString() {
////		return "[사번:" + empno + "]";
////	}
////}
//
//// class Emp {
////	int empno; // 변수 : 어떤 클래스의 속성 ,상태를 나타냄
////
////	Emp(int empno) {
////		this.empno = empno;
////	} // 생성자는 new할때 호출됨
////
////	Emp() {
////	}
////
////	void gotoOffice() {
////		System.out.println(empno + "가(이) 출근합니다.");
////	}
////
////	public String toString() {
////		return "[사번:" + empno + "]";
////	}
////}
//
//class Programmer implements Emp {
//	public void work() {
//		System.out.println(compName + " 프로그래머...Work");
//	}
//}
//
//class Designer implements Emp {
//	public void work() {
//		System.out.println(compName + " 디자이너...Work");
//	}
//}
//
////class Programmer extends Emp {
////	void work() {
////		System.out.println(empno + "은(는) 프로그래머...Work");
////	}
////}
////
////class Designer extends Emp {
////	void work() {
////		System.out.println(empno + "은(는) 디자이너...Work");
////	}
////}
//
//public class EmpTest {
//
//	public static void main(String[] args) {
//
//		Emp e1 = new Programmer();
//
//		Programmer p1 = new Programmer();
//		p1.work();
//
//		Emp d1 = new Designer();
//		((Designer) d1).work();
//
//		// 값 (value) 값이 Emp인데 왜 프로그램이 디자이너가 들어올수있나
//		// 자식 클래스는 완벽한 부모 클래스다.
//		Map<Integer, Emp> m1 = new HashMap<Integer, Emp>();
//		m1.put(1, new Programmer());
//		m1.put(2, new Designer());
//
//		System.out.println(m1);
//		
//		//  ArrayList  : 배열이지만 크기가 동적으로 늘어나는 배열 
//		// List : 인터페이스 
//		List<Emp> emps = new ArrayList<Emp>();
//		emps.add(new Programmer());
//		emps.add(new Designer());
//		
//		System.out.println(emps);
//		
//		// 추상 클래스는 new할수 없어 하지만 왼쪽에 데이터 타입으로는 올수있다.
////		Emp e1 = new Programmer();
////
////		// new 하게 되면 객체는 메모리 힙에 만들어 진다.
////		Programmer p1 = new Programmer();
////		// = Emp p1 = new Programmer();
////		// Programmer타입이 같아야함 p1의 타입은 Programmer.
////		// 왼쪽은 오른쪽보다 커야함
////		p1.gotoOffice();
////		p1.work();
////
////		// 다형성기반의 코딩
////		// 객체 기반의 다형성
////		Emp d1 = new Designer();
////		d1.gotoOffice();
////		((Designer) d1).work();
////
////		// Map => 엔트리 : (키, 값)
////		Map<Integer, Emp> m1 = new HashMap<Integer, Emp>();
////		m1.put(1, new Emp(1));
////		m1.put(2, new Emp(2));
////
////		System.out.println(m1.get(1));
//	}
//
//}



