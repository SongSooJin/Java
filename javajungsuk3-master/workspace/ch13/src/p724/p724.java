//package p724;
//
//public class p724 {
//	// 쓰레드(Thread) : 직역하면 실을 의미
//	// 코드를 처리하는흐름(길게 이어진 선으로 보임)
//	// 간단하게 일꾼! 
//	// 기동 메소드가 시작되면 자동으로 main 이라는 스레드가 코드를 처리하기 시작한다
//	public static void main(String[] args) {
//		String title = "스레드";
//		System.out.println("title : "  + title );
//		
//		String mainWorker = Thread.currentThread().getName(); // 메인에서 현재 스레드의 이름 호출
//		System.out.println("Worker : " + mainWorker);
//		
//		MyThread mythread = new MyThread();
//		mythread.setName("A");
//		// mythread.run(); // 메인에 있는 run호출 
//		 mythread.start();
//		// 최종적으로 start() 하면  run 메소드가 실행 
//		 // 콜 스택  생성 후=> run()호출
//		 
//		 
//		
//		 MyRunnable myrunnable = new MyRunnable();
////		 myrunnable.start();
//		 Thread mThread = new Thread(myrunnable);
//		 mThread.setName("B");
//		 mThread.start(); 	
//		 // 콜 스택  생성 후 ==> Thread의 run() 메소드 대신 
//		 // 생성자로 받은 Runnable 인터페이스 구현체의 run()호출 
//		 
//		// main 스레드는 start() 메소드를 호출 한 후 바로 밑으로 내려와서 다음코드를 수행
//				  Counter.count();
//		 
//		}
//}
//
//// 스레드를 할때마다 별도의 콜스택생성 즉 메로리 공간이 생김 
//class Counter {
//	public static void count() {
//		
//		String name = Thread.currentThread().getName(); 
//		//  메인에서 현재 스레드의 이름 호출 / A B main  
//		// 코드는 하나 이지만 호출은 A B main이름이 호출 
//		for (int i = 1; i <= 20; i++) {
//			System.out.print(name + i + " ");
//			try {
//				Thread.sleep(1000);
//				} 
//			catch (InterruptedException ignore) {
//				}
//		}
//		
//	}
//}
//
//// 쓰레드 문법 #1
//class MyThread extends Thread {
//	
//	@Override
//	public void run() {
//		// 별도의 스레드가 처리해야 할 로직을 배치합니다.
//		Counter.count();
//	}
//	
//}
//
//class Some {
//	
//}
//// 쓰레드 문법 #2
//class MyRunnable extends Some implements Runnable {
//
//	@Override
//	public void run() {
//		// 별도의 스레드가 처리해야 할 로직을 배치합니다.
//		Counter.count();
//	}
//	
//}
//
