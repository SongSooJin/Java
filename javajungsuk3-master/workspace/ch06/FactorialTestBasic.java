class FactorialTestBasic {
	
	
	public static void main(String args[]) throws Exception {
	
	p();	
	
	}
	// ���ѷ����� ������ ������ �ᱹ �޸� �������� ���ܰ� �߻��Ͽ� �ߴܵȴ�. �̷� ������ �ݱ��.
	private static void p() throws Exception {
		System.out.println("Hello");
		Thread.sleep(2000);
		p();
		
	}
}
