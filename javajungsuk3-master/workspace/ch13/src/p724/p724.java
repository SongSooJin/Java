//package p724;
//
//public class p724 {
//	// ������(Thread) : �����ϸ� ���� �ǹ�
//	// �ڵ带 ó���ϴ��帧(��� �̾��� ������ ����)
//	// �����ϰ� �ϲ�! 
//	// �⵿ �޼ҵ尡 ���۵Ǹ� �ڵ����� main �̶�� �����尡 �ڵ带 ó���ϱ� �����Ѵ�
//	public static void main(String[] args) {
//		String title = "������";
//		System.out.println("title : "  + title );
//		
//		String mainWorker = Thread.currentThread().getName(); // ���ο��� ���� �������� �̸� ȣ��
//		System.out.println("Worker : " + mainWorker);
//		
//		MyThread mythread = new MyThread();
//		mythread.setName("A");
//		// mythread.run(); // ���ο� �ִ� runȣ�� 
//		 mythread.start();
//		// ���������� start() �ϸ�  run �޼ҵ尡 ���� 
//		 // �� ����  ���� ��=> run()ȣ��
//		 
//		 
//		
//		 MyRunnable myrunnable = new MyRunnable();
////		 myrunnable.start();
//		 Thread mThread = new Thread(myrunnable);
//		 mThread.setName("B");
//		 mThread.start(); 	
//		 // �� ����  ���� �� ==> Thread�� run() �޼ҵ� ��� 
//		 // �����ڷ� ���� Runnable �������̽� ����ü�� run()ȣ�� 
//		 
//		// main ������� start() �޼ҵ带 ȣ�� �� �� �ٷ� ������ �����ͼ� �����ڵ带 ����
//				  Counter.count();
//		 
//		}
//}
//
//// �����带 �Ҷ����� ������ �ݽ��û��� �� �޷θ� ������ ���� 
//class Counter {
//	public static void count() {
//		
//		String name = Thread.currentThread().getName(); 
//		//  ���ο��� ���� �������� �̸� ȣ�� / A B main  
//		// �ڵ�� �ϳ� ������ ȣ���� A B main�̸��� ȣ�� 
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
//// ������ ���� #1
//class MyThread extends Thread {
//	
//	@Override
//	public void run() {
//		// ������ �����尡 ó���ؾ� �� ������ ��ġ�մϴ�.
//		Counter.count();
//	}
//	
//}
//
//class Some {
//	
//}
//// ������ ���� #2
//class MyRunnable extends Some implements Runnable {
//
//	@Override
//	public void run() {
//		// ������ �����尡 ó���ؾ� �� ������ ��ġ�մϴ�.
//		Counter.count();
//	}
//	
//}
//
