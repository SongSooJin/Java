//
//class MyMathTest3 {
//	public static void main(String args[]) {
//	 mycalculator calc = new mycalculator();
//	 int result = calc.add(2, 3);
//	 System.out.println(result);
//	 System.out.println(calc.add(2D, 3));
//	 
//	 result = mycalculator.multiply(2, 3);
//	 System.out.println(result);
//	
//	}
//}
//// ���� ���̴� multiply��� �տ� static�� �ٿ��� �����̴�. static������ ���α׷� ���� �� �ڵ����� �޸𸮿� �ε� �Ǳ� �������̴�.
//class mycalculator {
//	// �ν��Ͻ� �޼ҵ� : Ŭ������ ��ü�� �Ǿ�� �̿� �� �� �ִ� �޼ҵ� ]
//	// Ŭ������ new�ؼ� ����ؾ��� 
//	// �޷ε� �����ε�(Method Over Loading) : �޼ҵ���� ������ �Ķ�������ǰ� �ٸ� �ټ��� �޼ҵ带 �����ϴ� ��� 
//	int add (int a, int b) {
//		System.out.println("#1");
//		return a+b;
//	}
//	
//	//�ñ׳�ó (Signature) : �޼ҵ带 �����ϰ� �����ϴ� �κ� = �޼ҵ�� + �Ķ���� ���� �κ� 
//	double add (double a, int b) {
//		System.out.println("#2");
//		return a+b;
//	}
//	
//	static int multiply (int a,int b) {
//		
//		return a *b;
//	}
//	
//}