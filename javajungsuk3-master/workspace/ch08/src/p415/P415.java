//package p415;
//
//public class P415 {
//
//	public static void main(String[] args) {
//		int result = divide(3,0);
//		// divide �޼ҵ带 ȣ���ߴµ� �޼ҵ� ó���߿� ���ܰ� �߻��߰�
//		// throw e; ��� �ڵ�� �߻��� ���������� ���� �ִ� ��ü��
//		// �����ϸ� divide �޼ҵ带 ȣ���� �ڵ� �κп��� ���ܰ� �߻���
//		// ������ ����Ѵ�.  try ~ catch ������ ������ �ڵ�����
//		// throw e; �ڵ尡 �ִ°Ͱ� ����.
//		// JVM���� ���ܰ� ���޵Ǹ� �ֿܼ� ���������� ���ܸ� ����Ѵ�.
//		System.out.println("result = " + result);
//	}
//	
//	private static int divide(int i, int j) {
//		int result = 0;
//		try {
//			result =i / j ;
//			} 
//		catch  (RuntimeException e) {
//			// ArithmeticException e / ��Ʈ�� f4
//			/*
//			e.printStackTrace(); // �ڵ�ó������غ�
//			java.lang.ArithmeticException: / by zero
//			at p415.P415.divide(P415.java:13)
//			at p415.P415.main(P415.java:6)
//			*/
//			//System.out.println(e.getMessage());
//			
//			throw e; // ���ܸ� �� �޼ҵ带 ȣ���� ������ �����Ѵ�.
//			}
//		return  result;
//	}
//}
//
///*
// * Object
// * 		Throwable : ���� ���� 
// * 			Exception : checked Exception
// * 							Exception Ŭ������ �ڽ� ����Ŭ������ �߻��ϸ�
// * 							�����ڰ� �ݵ�� try ~ catch �ؾ� �Ѵ�.
// * 				RuntimeException : unchecked Exception
// * 											try ~ catch�� ���û���.
// * 					ArithmeticException : 
// * 
// * */
