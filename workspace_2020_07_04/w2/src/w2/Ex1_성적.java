package w2;

/*�̸� ȫ �� ��, ���������� b, ���� 95, ���� 100�� ������ �Ҵ���,
������ ����� ���� �Ʒ�ó��!
�̸� : xxxx   ���������� : x
���� : xxx     ���� : xxx
--------------------------
���� : xxx     ��� : xxx.x
*/
public class Ex1_���� {
	public static void main(String[] args) {
		//�⺻�� ���� 	          
		      String line="---------------------------";
		      String name=new String("ȫ �� ��"); //== String name="ȫ �� ��";
	           char ty='b';
				int ����=95, ����=100;
				//ó�� 
				int tot=����+����;
				double ave=(double)tot/2;// == double ave=tot/2.0;		
				//��� 
				//%s�� �ּҸ� ������Ű�� '\0'�������� ��� ���ڿ��� ���
				System.out.printf("�̸� : %s\t���������� : %c\n",name,ty);
				System.out.printf("���� : %3d\t���� : %3d\n",����,����);
				System.out.println(line);
				System.out.printf("���� : %3d\t��� : %5.1f\n",tot,ave);
	}
}
