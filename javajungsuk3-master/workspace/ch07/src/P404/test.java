//package P404;
//
//// p.404 ���� �ؿ� �ִ� BigBox Ŭ������ ���ʿ� �ִ� TinyBox Ŭ������ ����ϰڴ�.
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
//		// BigBox ������ �ѷ��ΰ� �ִ� ��ü�� ����.
//		// Must qualify the allocation with an enclosing instance of type BigBox 
//		// (e.g. x.new A() where x is an instance of BigBox).
//		TinyBox tb = bb.new TinyBox();
//		tb.show();
//	
//	}
//}
