//package p794;
//
//public class p794_2 {
//
//	// �������̽��� �����ϴ� ����� ���� Ŭ������ ���� ��ü�� �Ҵ��Ѵ�.
//	// ? implements Runnable 
//	static Runnable mRunnable = new Runnable() { 
//		// Ŭ�������� ����. �͸�Ŭ����(Anonymous Class)
//		// �������̽��� new �ȵǴ� ���� �߻�޼ҵ� ������ 
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
//		// �����带 ���� Ŭ������ ���� ������ �ʰ� ����� �� �ִ� ���
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
//class Worker2 implements Runnable { // Ŭ�������� ���� 
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
