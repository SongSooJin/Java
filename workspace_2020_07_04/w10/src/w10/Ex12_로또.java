package w10;

/*
 * [1,45] 6개 + 보너스번호 1개
 * [1,45] 중복이면 다시 1~45 실행
 * 보너스 번호 1 개는 6개와 중복이면 안됌 
 * 2 6 13 17 23 41, 보너스번호 32
 * 
 */

public class Ex12_로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lotto[]=new int[7];
		boolean sw;
		int i;
		
		for (i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*(45-1+1) + 1); // 난수 발생
			//중복체크
			sw=false; // 중복체크 전 초기치
			for(int j =0;j<i;j++) {
				if(lotto[j]==lotto[i]) {
					sw = true; break;
				}
			}// for j
			if(sw) {
				//System.out.println("중복 : " +lotto[i]);
				i--; //2
				continue;
			}
		}// for i
		
		int luckeyNo=lotto[i-1];
//		System.out.println("당첨번호 sort전: ");
//		for (int i=0;i<lotto.length-1;i++) {
//			System.out.printf("%3d\t",lotto[i]);
//		}
		
		for (i=0;i<lotto.length;i++) {
			for(int j=i+1;j<lotto.length-1;j++) {
				if(lotto[i]>lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("당첨번호는 : ");
		for (i=0;i<lotto.length-1;i++) {
			System.out.printf("%3d\t",lotto[i]);
		}
		System.out.println("보너스번호는 : " + luckeyNo);
		
		
		
		System.out.println();
	}

}
