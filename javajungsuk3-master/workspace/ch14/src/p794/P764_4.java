//package p794;
//
//public class P764_4 {
//
//	// Lambda Expression
//	// 함수를 하나의 식으로 표현하는 것이다.
//	// 함수? 하나의 객체에 하나의 메소드만 존재할 때 해당 메소드를 함수로 지칭한다.
//	// 함수형 인터페이스 구현체를 간단하게 식으로 줄여서 쓸 수 있는 표현법 
//	public static void main(String[] args) {
//		
//		// #1의 변형
//		// class  익명클래스 extends Thread 
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
//		// #2의 변형
//		// class 익명클래스 implements Runnable
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
//		// #2의 변형의 람다식 
//		// 클래스명과 메소드명을 생략할 수 있다. 
//		// 컴파일러가 주변 코드를 보고 맥락을 이해서 생략된
//		// 클래스명과 메소드명을 추론할 수 있기 때문이다.
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