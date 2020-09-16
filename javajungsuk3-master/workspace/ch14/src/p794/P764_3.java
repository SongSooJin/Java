//package p794;
//
//public class P764_3 {
//
//	public static void main(String[] args) {
////		// #1 class  MyThread extends Thread
//		Thread t1 = new MyThread();
//		t1.setName("A");
//		t1.start();
//		
//		// #1의 변형
//		// class  익명클래스 extends Thread 
//		new Thread("a") {
//			@Override
//			public void run() {
//				try {
//					MyCounter.count(Thread.currentThread().getName());
//				} catch (InterruptedException ignore) {
//				}
//			}
//		}.start();
//		
//		// #2
//		
//		new Thread(new MyRunnable(), "B").start();
//		
//		// #2의 변형
//		// class 익명클래스 implements Runnable
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				try {
//					MyCounter.count(Thread.currentThread().getName());
//				} catch (InterruptedException ignore) {
//				}		
//			}
//		},"b").start();
//		
//		// 메인 스레드
//		try {
//			MyCounter.count(Thread.currentThread().getName());
//		} catch (InterruptedException ignore) {
//		}
//		
//	}
//}
//
//class  MyThread extends Thread {
//	
//	@Override
//	public void run() {
//		
//		try {
//			MyCounter.count(Thread.currentThread().getName());
//		} catch (InterruptedException ignore) {
//		}
//	
//	}
//	
//}
//
//class MyRunnable implements Runnable {
//
//	@Override
//	public void run() {
//		try {
//			MyCounter.count(Thread.currentThread().getName());
//		} catch (InterruptedException ignore) {
//		}
//	
//		
//	}
//	
//}
//
//class MyCounter {
//	public static void count(String who) throws InterruptedException {
//		for (int i = 0; i < 10; i++) {
//			System.out.print(who + i + " ");
//			Thread.sleep(500);
//		}
//		
//	}
//}