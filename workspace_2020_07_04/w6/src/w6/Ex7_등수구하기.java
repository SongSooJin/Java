package w6;


/*
 * �⺻���� �Ҵ���,����� ������Լ�[rank]���� ���ϰ�
 * ��µ� ������Լ� [disp]���� �Ѵ�
 * ����   ���
 * --------
 * 159   5
 * 200   1
 * 198   2
 * 185   3
 * 175   4
 * 
 */

public class Ex7_������ϱ� {
	
	 static void disp(int s[],int r[]){
		 
		    System.out.println("����  \t  ���");
		    System.out.println("-------------");
		    for(int i=0; i<s.length; i++) {
		    	System.out.printf("%3d\t%3d\n", s[i],r[i]);
		    }
	}
	 
	 static void rank(int s[],int r[]) {
		// ��� ���ϱ� 
		    for(int i=0;i<s.length;i++){ //i�� ����
		    	r[i]=1;// ���� �ʱ�ġ 1��
		    	for(int j = 1;j<s.length;j++) { //j�� �񱳴��
		    		//if(i==j) continue;
		    		if(s[i]< s[j]) 	r[i]++;  // rn[i] = rn[i]+1;;
		    	}
		    }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score[] = {159,200,198,185,175};
	    int rn[] = new int[score.length];
	    
	    rank(score,rn);
	    disp(score,rn); //call by reference
	    
	    
	}

}
