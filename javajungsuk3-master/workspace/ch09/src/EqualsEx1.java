//
//class EqualsEx1 {
//	public static void main(String[] args) {
//		Value v1 = new Value(10);
//		Value v2 = new Value(10);		
//		/*
//		 * ���赵 value�� equals �޼ҵ带 ������ ���� �ʾҴٸ� :
//		 * v1.equals(v2) <===> v1 == v2
//		 * 
//		 * ���赵 value�� equals �޼ҵ带 ������ �ؼ� ��ü�� ��������� ������ 
//		 * ���ϰ� �ִٸ� :
//		 * v1.equals(v2) <===> v1.value == v2.value
//		 * */
//		
//									// .equals�� �θ�(super)Ŭ������ Object , Object�� �ᱹ �񱳿����� 
//		System.out.println(v1.equals(v2) ? "����" : "�ٸ���");
//		System.out.println(v1 == v2 ? "����" : "�ٸ���");
//		
//		String x1 ="ȫ�浿";	// new String("ȫ�浿");
//		String x2 ="ȫ�浿";	// �̹� ������� ��ü�� �����Ѵ�.
//		String x3 = new String ("ȫ�浿");
//		
//		
//		/*
//		 * ���� Ŭ���� Object�� equals �޼ҵ带 �״�� ����Ѵٸ�
//		 * ����� �񱳿����� == �� ����.
//		 * */
//		
//		if (v1.equals(v2)) {
//			System.out.println("v1�� v2�� �����ϴ�.");
//		} else {
//			System.out.println("v1�� v2�� �ٸ��ϴ�.");		
//		}
//
//		v2 = v1;
//
//		if (v1.equals(v2)) {
//			System.out.println("v1�� v2�� �����ϴ�.");
//		} else {
//			System.out.println("v1�� v2�� �ٸ��ϴ�.");		
//		}
//	} // main
//} 
//
//class Value extends java.lang.Object{
//	int value;
//
//	Value(int value) {
//		this.value = value;
//	}
//
//	//String Ŭ������ �̹� ������ �Ǿ��ִ�.
//	// �ڵ带 �ڵ����� ���ʷ���Ʈ �� �� �ִٴ� �ǹ� : 
//	// ���� ¥�� �Ȱ��� ������ ���� �����ڰ� Ÿ���� �� �ʿ���� �ڵ����� ���� �ȴٴ� �� 
//	@Override // .equals�� value�� Object , Object�� ������ 
//	public boolean equals(Object obj) {
//		// �� ��ü�� �Ķ���ͷ� ���� obj�� ����Ű�� ��ü�� ������? 
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		
//		// ��ü�� ���������� ���Ѵ�. ���赵�� ������? 
//		if (this.getClass() != obj.getClass())
//			return false;
//		
//		Value other = (Value) obj;
//		
//		
//		if (this.value != other.value)
//			return false;
//
//		return true;
//	}
//
//
//}
