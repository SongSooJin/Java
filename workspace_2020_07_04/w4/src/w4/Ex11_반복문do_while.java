package w4;

/*
i : 10
i : 20
i : 30
i : 40
i : 50
*/

public class Ex11_�ݺ���do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10; //�ʱⰪ
		do{
			System.out.printf("i : %d\n",i);
			i+=10;  //������
		}while(i<=50); //���ǽ�
		
	}

}

/*
 *  while,do~while : �ݺ�Ƚ���� ����ڿ� ���� �����Ǵ� ��� �ַ� ���
 *  do{
 *  ����1;
 *  ����2;
 *  }while(���ǽ�);
 *  ...
 *  do�� {}�� 1���� ������, ���ǽ��� �����ϸ� do�� �ö�
 *  ���ǽ��� ���� ���ϸ� do~while������ ������ ����
 *  
 *  
 */