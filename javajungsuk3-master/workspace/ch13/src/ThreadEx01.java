//class ThreadEx01 {
//	public static void main(String args[]) {
//		ThreadEx1_1 t1 = new ThreadEx1_1();
//
//		Runnable r  = new ThreadEx1_2();
//		// ThreadEx1_2 클래스 내에는 start() 메소드가 없으므로
//		// Thread 클래스의 도움을 받아서 처리해야 합니다.
//		Thread   t2 = new Thread(r);	  // 생성자 Thread(Runnable target)
//
//		t1.start(); 	 // 개별적인 콜스택이 만들어진 후 run 메소드가 수행된다
//		t2.start();
//		// Thread 클래스의 생성자에 Runnable 구현체를 전달하면
//		// Thread객체는 start() 메소드 호출 시
//		// 콜스택이 만들고 난 후 Runnable 구현체의 run()메소드를 수행합니다.
//	}
//}
//
//class ThreadEx1_1 extends Thread {
//	// 재정의 
//	@Override
//	public void run() {
//		// 별도의 쓰레드가 처리해야 할 로직을 배치합니다
//		for(int i=0; i < 5; i++) {
//			System.out.println(getName()); // 조상인 Thread의 getName()을 호출
//		}
//	}
//}
//
//class ThreadEx1_2 extends Object implements Runnable {
//	@Override	
//	public void run() {
//		for(int i=0; i < 5; i++) {
//			// 조상인 Thread의 getName()
//			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
//		    System.out.println(Thread.currentThread().getName());
//		}
//	}
//}
