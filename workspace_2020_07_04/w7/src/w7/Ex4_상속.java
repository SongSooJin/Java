package w7;/*�Ļ���ü ������, ���� �ڳ�����ڷ� ��� �Ѿ����,
�θ�����ڸ� �ڵ����� ȣ���Ͽ� ������, ȣ����ġ�� ������
�ڳ������ ���� 

*/

public class Ex4_��� {

	public static void main(String[] args) {
		BBB p=new BBB();//�Ļ���ü�� ������, ��ü���۷������� p���� ��ü�� �ּҸ� ��ȯ 
        
	}

}
class AAA{
	 public AAA() {System.out.println("�θ������...");}
}
class BBB extends AAA{ //�θ�AAAŬ������ ����� �ڳ� Ŭ���� BBB
	 public BBB() {  System.out.println("�ڳ������...");}
}


/*
 * 1. ���
0) �ڵ��� ����
    data�� ǳ��
1) �θ�class==base class == �⺻class
    �ڳ�class == derived class == �Ļ�class
2) �Ļ���ü���忡���� �θ��� public�� public�̰�
                            �θ��� private�� private�̴�.


�̸� (��)���� ���ڷ� �̸� ����,

 */




