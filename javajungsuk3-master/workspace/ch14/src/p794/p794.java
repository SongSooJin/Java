//package p794;
//
//
//public class p794 {
//
//	public static void main(String[] args) {
//		
//		String who = Thread.currentThread().getName();
//		System.out.println("start who: " + who);
//		
//		Worker worker = new Worker();
//		// worker.run();
//		
//		Thread mThread = new Thread(worker, " A ");
//		mThread.start();
//		
//		System.out.println("end who : " + who);
//		
//	}
//
//}
//
//class Worker implements Runnable {
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
