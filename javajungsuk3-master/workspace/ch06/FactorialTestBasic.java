class FactorialTestBasic {
	
	
	public static void main(String args[]) throws Exception {
	
	p();	
	
	}
	// 무한루프에 빠지는 로직은 결국 메모리 부족으로 예외가 발생하여 중단된다. 이런 로직은 금기다.
	private static void p() throws Exception {
		System.out.println("Hello");
		Thread.sleep(2000);
		p();
		
	}
}
