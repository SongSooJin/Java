package w5;

/*
 * ���� --
 * 100 123 -1 0 77
 * �������� ������ --
 * -1 0 77 100 123
 * �������� ������ --
 *  
 */

public class Ex7_�����ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int a[] = {100,123,-1,0,77};
			//char ch[] = {'b','B','A','z','I'};
			String name[]= {"����","������","����","������","ȫ�浿"};
			System.out.println("����--");
			for(int i = 0;i<a.length;i++ ) {
				 System.out.printf("%3d\t",a[i]);
			}
			
			System.out.printf("\n");
			//��������
			for(int i=0;i<a.length-1;i++) {//������ i
				for(int j=i+1;j<a.length;j++) { //�񱳴���� j
					if(a[i] > a[j]) {
						int temp;
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
					
			}		
					
			System.out.println("�������� ������--");
			for(int i = 0;i<a.length;i++ ) {
				 System.out.printf("%3d\t",a[i]);		
			}
			System.out.printf("\n");
			System.out.println("����--");
			for(int i = 0;i<name.length;i++ ) {
				 System.out.printf("%3s\t",name[i]);
			}
			
			System.out.printf("\n");
			//�����ϱ�
			for(int i=0;i<name.length-1;i++) {//������ i
				for(int j=i+1;j<name.length;j++) { //�񱳴���� j
					if(name[i].compareTo(name[j])>0) { // "����"> "������"
						String temp;
						temp = name[i];
						name[i] = name[j];
						name[j] = temp;
					}
				}
			
			}
				System.out.println("�������� ������--");
				for(int i = 0;i<name.length;i++ ) {
					 System.out.printf("%3s\t",name[i]);		
				}
			System.out.printf("\n");

				
			
			
			System.out.printf("\n");
//			System.out.println("����--");
//			for(int i = 0;i<ch.length;i++ ) {
//				 System.out.printf("%3c\t",ch[i]);
//			}
//			
//			System.out.printf("\n");
//			//��������
//			for(int i=0;i<ch.length-1;i++) {//������ i
//				for(int j=i+1;j<ch.length;j++) { //�񱳴���� j
//					if(ch[i] > ch[j]) {
//						char temp;
//						temp = ch[i];
//						ch[i] = ch[j];
//						ch[j] = temp;
//						
//					}
//				}
//					
//			}		
//					
//			System.out.println("�������� ������--");
//			for(int i = 0;i<ch.length;i++ ) {
//				 System.out.printf("%3c\t",ch[i]);		
//			}
//			System.out.printf("\n");
//			
			
			
	}

}

/*
 * ����
 * 1) �������� : ���������� ū�� ������ ���� 
 * 2) �������� :  ū������ ������ ������ ����
 *
 * int a[] = {100,123,-1,0,77};
 *  ����  | �񱳴��
 * -----------------------------------------
 *  [0] | [1] [2] [3] [4]
 *  [1] | [2] [3] [4]
 *  [2] | [3] [4]
 *  [3] | [4]
 * 
 */