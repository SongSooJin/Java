//package p794;
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		// =Worker worker = new Worker();
//		// Runnable로 쓴것 : 기능적면을 더 집중하기 위해
//		Runnable worker1 = new Worker();
//		// =Thread t = new java.lang.Thread();
//		Thread t1 = new Thread(worker1);
//		t1.start();
//
//		Runnable worker2 = new Worker();
////		Thread t2 = new Thread(worker2);
////		t2.start();
//		new Thread(worker2).start();
//
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				String name = Thread.currentThread().getName();
//				for (int i = 0; i < 10; i++) {
//					System.out.println(name + " i = " + i);
//				}
//			}
//		}).start();
//
//		new Thread(() -> {
//			String name = Thread.currentThread().getName();
//			for (int i = 0; i < 10; i++) {
//				System.out.println(name + " i = " + i);
//			}
//		}).start();
//	}
//
//}
//
//class Worker implements Runnable {
//	@Override
//	public void run() {
//		String name = Thread.currentThread().getName();
//		for (int i = 0; i < 10; i++) {
//			System.out.println(name + " i = " + i);
//		}
//	}
//
//}
//
//// Programming Language