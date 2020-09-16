package w5;

/*
 * 원래 --
 * 100 123 -1 0 77
 * 오름차순 정렬후 --
 * -1 0 77 100 123
 * 내림차순 정렬후 --
 *  
 */

public class Ex7_정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int a[] = {100,123,-1,0,77};
			//char ch[] = {'b','B','A','z','I'};
			String name[]= {"이이","강감찬","동수","신지아","홍길동"};
			System.out.println("원래--");
			for(int i = 0;i<a.length;i++ ) {
				 System.out.printf("%3d\t",a[i]);
			}
			
			System.out.printf("\n");
			//오름차순
			for(int i=0;i<a.length-1;i++) {//기준을 i
				for(int j=i+1;j<a.length;j++) { //비교대상을 j
					if(a[i] > a[j]) {
						int temp;
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
					
			}		
					
			System.out.println("오름차순 정렬후--");
			for(int i = 0;i<a.length;i++ ) {
				 System.out.printf("%3d\t",a[i]);		
			}
			System.out.printf("\n");
			System.out.println("원래--");
			for(int i = 0;i<name.length;i++ ) {
				 System.out.printf("%3s\t",name[i]);
			}
			
			System.out.printf("\n");
			//정렬하기
			for(int i=0;i<name.length-1;i++) {//기준을 i
				for(int j=i+1;j<name.length;j++) { //비교대상을 j
					if(name[i].compareTo(name[j])>0) { // "이이"> "강감찬"
						String temp;
						temp = name[i];
						name[i] = name[j];
						name[j] = temp;
					}
				}
			
			}
				System.out.println("오름차순 정렬후--");
				for(int i = 0;i<name.length;i++ ) {
					 System.out.printf("%3s\t",name[i]);		
				}
			System.out.printf("\n");

				
			
			
			System.out.printf("\n");
//			System.out.println("원래--");
//			for(int i = 0;i<ch.length;i++ ) {
//				 System.out.printf("%3c\t",ch[i]);
//			}
//			
//			System.out.printf("\n");
//			//오름차순
//			for(int i=0;i<ch.length-1;i++) {//기준을 i
//				for(int j=i+1;j<ch.length;j++) { //비교대상을 j
//					if(ch[i] > ch[j]) {
//						char temp;
//						temp = ch[i];
//						ch[i] = ch[j];
//						ch[j] = temp;
//						
//					}
//				}
//					
//			}		
//					
//			System.out.println("오름차순 정렬후--");
//			for(int i = 0;i<ch.length;i++ ) {
//				 System.out.printf("%3c\t",ch[i]);		
//			}
//			System.out.printf("\n");
//			
			
			
	}

}

/*
 * 정렬
 * 1) 오름차순 : 작은값부터 큰값 순으로 나열 
 * 2) 내림차순 :  큰값부터 작은값 순으로 나열
 *
 * int a[] = {100,123,-1,0,77};
 *  기준  | 비교대상
 * -----------------------------------------
 *  [0] | [1] [2] [3] [4]
 *  [1] | [2] [3] [4]
 *  [2] | [3] [4]
 *  [3] | [4]
 * 
 */