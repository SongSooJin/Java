package w5;

/*
 * 점수   등수
 * --------
 * 159   5
 * 200   1
 * 198   2
 * 185   3
 * 175   4
 * 
 */

public class Ex5_등수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score[] = {159,200,198,185,175};
	    int rn[] = new int[score.length];
	    
		// 등수 구하기 
	    for(int i=0;i<score.length;i++){ //i는 기준
	    	rn[i]=1;// 비교전 초기치 1등
	    	for(int j = 1;j<score.length;j++) { //j를 비교대상
	    		//if(i==j) continue;
	    		if(score[i]< score[j]) 	rn[i]++;  // rn[i] = rn[i]+1;;
	    	}
	    }
	    System.out.println("점수  \t  등수");
	    System.out.println("-------------");
	    for(int i=0; i<score.length; i++) {
	    	System.out.printf("%3d\t%3d\n", score[i],rn[i]);
	    }
		
	}

}



/*
 * 등수구하기
 * ex)
 * 	int score[] = {159,200,198,185,175};
 * 비교전 등수는 1등의 초기치를 주고,
 * 기준  | 비교대상
 * -----------------------------------------
 * [0] | [0] [1] [2] [3] [4]
 * [1] | [0] [1] [2] [3] [4]
 * [2] | [0] [1] [2] [3] [4]
 * [3] | [0] [1] [2] [3] [4]
 * [4] | [0] [1] [2] [3] [4]
 * 
 * 
 */