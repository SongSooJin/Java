package w8;

public class Ex9_����ƽ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticSample.m = 3; 	// Ŭ���� �̸����� static �ʵ� ����
		StaticSample.f(); 	// Ŭ���� �̸����� static �޼ҵ� ȣ��
		System.out.println("m : "+StaticSample.m);

		StaticSample b1 = new StaticSample();

		b1.m = 5; 	// ��ü �̸����� static �ʵ� ����
		b1.f(); 	// ��ü �̸����� static �޼ҵ� ȣ��
		b1.n = 100;
		b1.g();
		System.out.println("b1.m : "+b1.m);
		System.out.println("StaticSample.m : "+StaticSample.m);
		System.out.println(Math.max(111, 199));
		System.out.println(Math.abs(-3.14));
	}

}
