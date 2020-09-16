//package P404;
//
//// p.404 폴더 밑에 있는 BigBox 클래스가 안쪽에 있는 TinyBox 클래스를 사용하겠다.
//import P404.BigBox.TinyBox;
//
//public class test {
//	public static void main(String[] args) {
//		BigBox bb = new BigBox();
//		bb.printA();
//		bb.printB();
//		// The static method printB() from the type BigBox 
//		// should be accessed in a static way
//		BigBox.printB(); // in a static way 
//		
//		
//		// TinyBox tb = new TinyBox();
//		// No enclosing instance of type BigBox is accessible. 
//		// BigBox 유형의 둘러싸고 있는 객체가 없다.
//		// Must qualify the allocation with an enclosing instance of type BigBox 
//		// (e.g. x.new A() where x is an instance of BigBox).
//		TinyBox tb = bb.new TinyBox();
//		tb.show();
//	
//	}
//}
