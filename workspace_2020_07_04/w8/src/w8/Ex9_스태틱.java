package w8;

public class Ex9_스태틱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticSample.m = 3; 	// 클래스 이름으로 static 필드 접근
		StaticSample.f(); 	// 클래스 이름으로 static 메소드 호출
		System.out.println("m : "+StaticSample.m);

		StaticSample b1 = new StaticSample();

		b1.m = 5; 	// 객체 이름으로 static 필드 접근
		b1.f(); 	// 객체 이름으로 static 메소드 호출
		b1.n = 100;
		b1.g();
		System.out.println("b1.m : "+b1.m);
		System.out.println("StaticSample.m : "+StaticSample.m);
		System.out.println(Math.max(111, 199));
		System.out.println(Math.abs(-3.14));
	}

}
