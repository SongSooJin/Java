package w6;


/*
 * 기본값을 할당후,등수는 사용자함수[rank]에서 구하고
 * 출력도 사용자함수 [disp]에서 한다
 * 점수   등수
 * --------
 * 159   5
 * 200   1
 * 198   2
 * 185   3
 * 175   4
 * 
 */

public class Ex7_등수구하기 {
	
	 static void disp(int s[],int r[]){
		 
		    System.out.println("점수  \t  등수");
		    System.out.println("-------------");
		    for(int i=0; i<s.length; i++) {
		    	System.out.printf("%3d\t%3d\n", s[i],r[i]);
		    }
	}
	 
	 static void rank(int s[],int r[]) {
		// 등수 구하기 
		    for(int i=0;i<s.length;i++){ //i는 기준
		    	r[i]=1;// 비교전 초기치 1등
		    	for(int j = 1;j<s.length;j++) { //j를 비교대상
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
