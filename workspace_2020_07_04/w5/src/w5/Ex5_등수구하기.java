package w5;

/*
 * ����   ���
 * --------
 * 159   5
 * 200   1
 * 198   2
 * 185   3
 * 175   4
 * 
 */

public class Ex5_������ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score[] = {159,200,198,185,175};
	    int rn[] = new int[score.length];
	    
		// ��� ���ϱ� 
	    for(int i=0;i<score.length;i++){ //i�� ����
	    	rn[i]=1;// ���� �ʱ�ġ 1��
	    	for(int j = 1;j<score.length;j++) { //j�� �񱳴��
	    		//if(i==j) continue;
	    		if(score[i]< score[j]) 	rn[i]++;  // rn[i] = rn[i]+1;;
	    	}
	    }
	    System.out.println("����  \t  ���");
	    System.out.println("-------------");
	    for(int i=0; i<score.length; i++) {
	    	System.out.printf("%3d\t%3d\n", score[i],rn[i]);
	    }
		
	}

}



/*
 * ������ϱ�
 * ex)
 * 	int score[] = {159,200,198,185,175};
 * ���� ����� 1���� �ʱ�ġ�� �ְ�,
 * ����  | �񱳴��
 * -----------------------------------------
 * [0] | [0] [1] [2] [3] [4]
 * [1] | [0] [1] [2] [3] [4]
 * [2] | [0] [1] [2] [3] [4]
 * [3] | [0] [1] [2] [3] [4]
 * [4] | [0] [1] [2] [3] [4]
 * 
 * 
 */