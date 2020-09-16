//package p794;
//
//public class P764_4 {
//
//	// Lambda Expression
//	// �Լ��� �ϳ��� ������ ǥ���ϴ� ���̴�.
//	// �Լ�? �ϳ��� ��ü�� �ϳ��� �޼ҵ常 ������ �� �ش� �޼ҵ带 �Լ��� ��Ī�Ѵ�.
//	// �Լ��� �������̽� ����ü�� �����ϰ� ������ �ٿ��� �� �� �ִ� ǥ���� 
//	public static void main(String[] args) {
//		
//		// #1�� ����
//		// class  �͸�Ŭ���� extends Thread 
//		new Thread("a") {
//			@Override
//			public void run() {
//				try {
//					MyCounter4.count(Thread.currentThread().getName());
//				} catch (InterruptedException ignore) {
//				}
//			}
//		}.start();
//		
//	
//		// #2�� ����
//		// class �͸�Ŭ���� implements Runnable
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				try {
//					MyCounter4.count(Thread.currentThread().getName());
//				} catch (InterruptedException ignore) {
//				}		
//			}
//		},"b").start();
//		
//		// #2�� ������ ���ٽ� 
//		// Ŭ������� �޼ҵ���� ������ �� �ִ�. 
//		// �����Ϸ��� �ֺ� �ڵ带 ���� �ƶ��� ���ؼ� ������
//		// Ŭ������� �޼ҵ���� �߷��� �� �ֱ� �����̴�.
//		new Thread(() -> {
//			try {
//				MyCounter4.count(Thread.currentThread().getName());
//			} catch (InterruptedException ignore) {
//			}		
//		},"b-Lambda").start();
//	}
//	
//}
//
//class MyCounter4 {
//	public static void count(String who) throws InterruptedException {
//		for (int i = 0; i < 10; i++) {
//			System.out.print(who + i + " ");
//			Thread.sleep(500);
//		}
//		
//	}
//}