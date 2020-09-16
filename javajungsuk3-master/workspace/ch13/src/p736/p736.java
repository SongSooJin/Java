//package p736;
//
//public class p736 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
////		System.out.println("START");
////		long oldTime = System.currentTimeMillis();
////		
////		long result = Counter.count(1, 2000000000);
////		System.out.println("result = " + result);
////		
////		long currentTime = System.currentTimeMillis();
////				System.out.println("Elapsed time = " + (currentTime - oldTime ));
////
//		System.out.println("START");
//		long oldTime = System.currentTimeMillis();
//
//		p736 test = new p736();
//		A a = test.new A();
//		B b = test.new B();
//		a.start();
//		b.start();
//
//		try {
//			a.join(); 	 // A 스레드가 일을 마칠때 까지 기다린다
//			b.join();  // B 스레드가 일을 마칠때 까지 기다린다  
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		long result = test.resultA + test.resultB;
//		System.out.println("result = " + result);
//
//		long currentTime = System.currentTimeMillis();
//		System.out.println("Elapsed time = " + (currentTime - oldTime));
//		
//	}
//
//	long resultA = 0;
//	long resultB = 0;
//
//	class A extends Thread {
//		@Override
//		public void run() {
//			resultA = Counter.count(1, 1000000000);
//		}
//
//	}
//
//	class B extends Thread {
//
//		@Override
//		public void run() {
//			resultB = Counter.count(1000000000, 2000000000);
//		}
//	}
//}
//
//class Counter {
//	public static long count(int start, int end) {
//
//		long sum = 0;
//		for (int i = start; i <= end; i++) {
//			sum += i;
//		}
//		return sum;
//
//	}
//}
//
