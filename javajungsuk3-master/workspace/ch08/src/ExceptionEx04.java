//class ExceptionEx04 {
//	public static void main(String args[]) {
//			System.out.println(1);			
//			System.out.println(2);
//			try {
//				System.out.println(3);
//				System.out.println(4);
//				
//				//throw new ArithmeticException();
//				throw new RuntimeException();
//				} // ���ܰ� �߻��ؾ� catch���� ���ư� 
//			catch (IndexOutOfBoundsException e)	{ 
//				// try�κп��� �߻��� ���� instanceof(��Ӱ���) Exception�� true �϶�
//				// Exception e = try �κп��� �߻��� ���� �Ҵ��ϰ� catch ��Ͼȿ�
//				// �ڵ带 �����Ѵ�.
//				System.out.println("5-1");
//				} // try-catch�� ��
//			catch (ArithmeticException e)	{ 
//				System.out.println("5-2");
//			}
//			catch (Exception e)	{ 
//				System.out.println("5-3");
//			}// ����Ŭ���� ���Ʈ������ �θ�Ŭ������ �ϴܿ� ��ġ�ؾ� �Ѵ�.
//	
//			System.out.println(6);
//	}	// main�޼����� ��
//}
