//package p330;
//
//public class text {
//	public static void main(String[] args) {
//		//new Gildong();
//		
//		// 상속의 룰을 지키기 위해서 자식객체보다 부모객체가 먼저 만들어 저야 한다.
//		// Korean() called.
//		// HongFamily() called.
//		// Gildong() called.
//		
//		Gildong g = new Gildong();
//		// 자식객체에서 가장 가까운 자원을 사용한다.
//		System.out.println(g.food);
//		g.play();
//		
//		// 업캐스팅(Up - casting) : 실제 자료형으로 지칭하지 않고 부모자료형으로 높여서 지칭하는것 
//		// 다형성(Polymorphism) : 상속관계에 따라 업캐스팅/다운 캐스팅하여 대상 객체를 취급할 수 있는 성질
//		HongFamily g2 = new Gildong();
//		Gildong g4 = (Gildong) g2;
//		Korean g5 = g4;
//		
//		HongFamily gilsoon = new Gilsoon();
//		
//		int a = 10;
//		long b = a; // 자동캐스팅
//		short c = (short) a; // 명시적 캐스팅
//		
//		System.out.println("================");
//		
//		Korean g3 = new Gildong();
//		System.out.println(g3.food); 
//		// 다형성에서  변수는 은닉되고 메소드는 재정의 된다.
//		// 지칭에 따라 변수는 지칭에 영향을 받고 메소드는 실체에 영향을 받는다.
//		g3.play(); // 메소드는 지칭에 상관없이 실체에서 가장 가까운 메소드가 사용된다.
//		
//		HongFamily hf =(HongFamily) g3;
//		System.out.println(hf.food);
//		hf.play();
//		
//	}
//}
