class FactorialTestBasic2 {
	static int count = 0;

	public static void main(String args[]) throws Exception {

		p();

	}
	//Exception in thread "main" java.lang.StackOverflowError
	
	// ���ѷ����� ������ ������ �ᱹ �޸� �������� ���ܰ� �߻��Ͽ� �ߴܵȴ�. �̷� ������ �ݱ��.
	private static void p() throws Exception {
//		if (count < 5) {
			count++;
			
			System.out.println("Hello "+count);
//			Thread.sleep(500);
			p();
//		}

	}
}
