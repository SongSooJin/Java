class FactorialTestBasic3 {
	static int count = 0;

	public static void main(String args[]) throws Exception {
//		A a1 = new A();
//		A a2 = new A();
		// ��ü ������ �����ڰ� ���������� ����� ��ü�� �ı��� �����ڰ� ���� �ʰ� ������ �ݷ��Ͱ� ��� �����Ѵ�.
		// ������ �ݷ��ʹ� ���޸𸮿� �����ϴ� ��ü�� �����ϴ� ������ ���ٸ� �ƹ��� ������� �ʴ´ٰ� �Ǵ��Ͽ� �ı��ϴ� �۾��� �����Ѵ�.
		// ������ �ݷ����� �۾������� �� ���� ����.
		
		p();

	}

	
	// �޼ҵ带 ȣ���� ������ �� �޼ҵ��� ���� ó���� ���� �޸� ������ ���Ӱ� �Ҵ�ȴ�.
	private static void p() throws Exception {
		if (count < 5) { // ���ȣ���� ���ѷ����� ������ �ʵ��� �ݵ�� ���ѷ����� ����� ������ �ʿ��ϴ�.
			count++;
			
			System.out.println("Hello "+count);
			Thread.sleep(500);
			p();	// ���ȣ��
		}

	}
}
