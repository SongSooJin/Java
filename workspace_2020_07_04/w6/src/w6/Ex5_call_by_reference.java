package w6;
/*
 * a배열의 합은 사용자함수에서 구하고 출력은 메인에서 
 * 
 * 레퍼런스의 치환 : int ta[]=a;
 * main()의 지역변수 a배열의 영역을 사용자함수에서 ta라는 이름으로 공유
 */
public class Ex5_call_by_reference {

	static int sum(int ta[]){
		int s=0;
	for(int i=0;i<ta.length;i++) {
		s +=ta[i];
				}
	return s;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5};
		int n= sum(a); //call by reference
		System.out.println("합 : " +n);
	}

}