////5-6
//class ArrayEx06 { 
//	public static void main(String[] args) { 
//	//	example();
//		
//		//���� : ���� �ֹ� 
//		int[] score = { 79, 88, 91, 33, 100, 55, 95}; 
//		
//		// �߰� ó�� �ڵ带 �ۼ��Ͽ� ���α׷��� �ϼ��Ͻÿ�.
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		
//		for (int i=0; i<=score.length; i++) {
//			
//			if (score[i] > max) { // �迭���� ���� ���� max���� ũ��, �� ū���� max�� �ִ´�.
//				max = score[i];
//			}
//			if(score[i] < min) { // �迭���� ���� ���� min������ ������ , �� ���� ���� main�� ��´�.
//				min = score[i];
//			}
//			
//		}
//	
//		System.out.println("�ִ밪 :" + max);       
//		System.out.println("�ּҰ� :" + min);  
//		
//		
//	}
//	private static void example() {
//		// TODO Auto-generated method stub
//		int[] score = { 79, 88, 91, 33, 100, 55, 95}; 
//
//		int max = score[0]; // �迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ �Ѵ�. 
//		int min = score[0]; // �迭�� ù ��° ������ �ּҰ��� �ʱ�ȭ �Ѵ�. 
//
//		for(int i=1; i < score.length;i++) {
//			if(score[i] > max) {
//				/// max�� ���� ������ score[i]�� �������� ũ�� �� ū���� max�� �Ҵ��Ѵ�.
//				max = score[i];	
//			} 
//			
//			else if(score[i] < min) { 
//				min = score[i]; 
//			} 
//			
//		} // end of for 
//
//		System.out.println("�ִ밪 :" + max);       
//		System.out.println("�ּҰ� :" + min);       
//	} // end of main 
//
//} // end of class 
