package w6;

import java.util.Scanner;

public class Ex2_�Ǹ�_�������迭 {

	static final int CN=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		String copn[][]=new String[CN][2];
		int a[][] = new int[CN][3];
		int totsu = 0;
		int totkum = 0;
		int temp = 0;
		String tcopn="@@@";
		
		for(int i=0; i<CN; i++) { //5�� �Է��� �ޱ�����
			System.out.printf("%d��° data�Է� -->", i+1);
			System.out.print("�ڵ�? "); copn[i][0]=sc.next();
			System.out.print("\t\t ����? "); a[i][0]=sc.nextInt();
			
				switch( copn[i][0].toLowerCase()) {
					case "a": copn[i][1]="���찳";a[i][1]=800;break;
					case "b": copn[i][1]="��Ʈ";a[i][1]=2000;break;
					case "c": copn[i][1]="����";a[i][1]=1200;break;
					case "d": copn[i][1]="����";a[i][1]=2100;break;		
					default:copn[i][1]="����";a[i][1]=4500;break;
				}//switch
				
		      a[i][2] = a[i][0]*a[i][1];
		      totsu += a[i][0];
		      totkum += a[i][2];
				
		}//for
		System.out.println(" \n                     *�Ǹź���*");
		System.out.println("�ڵ�     \t  ǰ�� \t          ���� \t        �ܰ� \t        �ݾ�");
		
		for(int i=0; i<CN; i++) { //5���� �Է¹������� �����ֱ����� 
			System.out.printf("%3s \t %s \t",copn[i][0],copn[i][1]);
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%8d\t",a[i][j]);
			}//for j
			System.out.printf("\n");
		}//for i
		
		System.out.printf("������ �Ѱ� : %8d\n",totsu);
		System.out.printf("�ݾ��� �Ѱ� : %8d\n",totkum);
		//ǰ������� �����ϱ�
		for(int i=0; i<CN-1;i++) {
			for(int j=i+1;j<CN;j++) {
				if(copn[i][1].compareTo(copn[j][1])>0) { //"���찳" > "��Ʈ"
					// �ٲٱ�
					tcopn = copn[i][0];copn[i][0] = copn[j][0];copn[j][0] = tcopn;
					tcopn =copn[i][1];copn[i][1] = copn[j][1];copn[j][1] = tcopn;
					temp = a[i][0];a[i][0] = a[j][0];a[j][0] = temp;
					temp = a[i][1];a[i][1] = a[j][1];a[j][1] = temp;
					temp = a[i][2];a[i][2] = a[j][2];a[j][2] = temp;
				}//if
			}// for j
		}//for i
		System.out.println(" \n                     *�Ǹź���(ǰ���)*");
		System.out.println("�ڵ�     \t  ǰ�� \t          ���� \t        �ܰ� \t        �ݾ�");
		
		for(int i=0; i<CN; i++) { //5���� �Է¹������� �����ֱ����� 
			System.out.printf("%3s \t %s \t",copn[i][0],copn[i][1]);
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%8d\t",a[i][j]);
			}//for j
			System.out.printf("\n");
		}//for i
		
		sc.close();
	}

}
