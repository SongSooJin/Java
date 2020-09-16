class FactorialTestBasic2 {
	static int count = 0;

	public static void main(String args[]) throws Exception {

		p();

	}
	//Exception in thread "main" java.lang.StackOverflowError
	
	// 무한루프에 빠지는 로직은 결국 메모리 부족으로 예외가 발생하여 중단된다. 이런 로직은 금기다.
	private static void p() throws Exception {
//		if (count < 5) {
			count++;
			
			System.out.println("Hello "+count);
//			Thread.sleep(500);
			p();
//		}

	}
}
