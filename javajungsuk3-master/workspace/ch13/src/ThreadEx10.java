// class ThreadEx10 implements Runnable  {
//	static boolean autoSave = false;
//
//	public static void main(String[] args) {
//		Thread t = new Thread(new ThreadEx10());
//		t.setDaemon(true);		// 이 부분이 없으면 종료되지 않는다.
//		t.start();
//
//		for(int i=1; i <= 15; i++) {
//			try{
//				Thread.sleep(1000);
//			} catch(InterruptedException e) {}
//			System.out.println(i);
//			
//			if(i==5)
//				autoSave = true;
//		}
//
//		System.out.println("프로그램을 종료합니다.");
//	}
//
//	@Override
//	public void run() {
//		while(true) { // 무한루프
//			try { 
//				Thread.sleep(3 * 1000);	// 3초마다
//			} catch(InterruptedException e) {}	
//
//
//			// autoSave의 값이 true이면 autoSave()를 호출한다.
//			// 스레드끼리 직접적인 대화는 안됨
//			//
//			if(ThreadEx10.autoSave) {
//				autoSave();
//				// break 문으로 while문을 종료하는 로직이 필요없는 이유는
//				// 데몬스레드 수행하기 때문이다. 데몬스레드는 일반 스레드가
//				// 종료되면 존재의미가 없기 때문에 자동으로 종료됩니다.
//				
//			}
//		}
//	}
//
//	public void autoSave() {
//		System.out.println("작업파일이 자동저장되었습니다.");
//	}
//}
