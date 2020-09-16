//package p794;
//
//public class p794_2 {
//
//	// 인터페이스가 제안하는 기능을 갖춘 클래스로 만든 객체를 할당한다.
//	// ? implements Runnable 
//	static Runnable mRunnable = new Runnable() { 
//		// 클래스명이 없다. 익명클래스(Anonymous Class)
//		// 인터페이스가 new 안되는 이유 추상메소드 때문에 
//		@Override
//		public void run() {
//		}
//	};
//	
//	public static void main(String[] args) {
//	
//		// Runnable worker = new Worker2();
//
//		// Thread mThread = new Thread(new Worker2(), " A ");
//		// mThread.start();
//		
//		// 스레드를 위한 클래스를 따로 만들지 않고 사용할 수 있는 방법
//		Thread mThread = new Thread (new Runnable() {
//			@Override
//			public void run() {
//				String who = Thread.currentThread().getName();
//				System.out.println( "run who : " + who);
//				
//				for (int i = 0; i < 10; i++) {
//					System.out.print(i);
//					
//					try {
//						Thread.sleep(500);
//						} 
//					catch (InterruptedException ignore) {
//					}
//					
//				}
//			}
//		}, " A ");
//		 mThread.start();
//	}
//
//}
//
//class Worker2 implements Runnable { // 클래스명이 존재 
//
//	@Override
//	public void run() {
//		String who = Thread.currentThread().getName();
//		System.out.println( "run who : " + who);
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i);
//			
//			try {
//				Thread.sleep(500);
//				} 
//			catch (InterruptedException ignore) {
//			}
//			
//		}
//		
//	}
//	
//	
//}
