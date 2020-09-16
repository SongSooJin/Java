package w4;

/*
 * 1~100까지의 수중 소수만 출력
 */


public class Ex17_소수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		for(int su = 1;su<=100;su++) {
	
			boolean sw=false; //나눠보기전 초기값
			int i;
			
				for(i=2;i<su;i++) { //2)1과 자신을 제외하고 나눠 봄 
					if(su%i==0) { sw=true;  break;}
				}//for i
			
			if(sw == false && i == su) {
				System.out.printf("%d ",su);
				count++;
			}
		}//for su
		System.out.println("총 갯수 : "+count);
		
	}

}
