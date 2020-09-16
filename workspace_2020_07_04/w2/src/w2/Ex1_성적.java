package w2;

/*이름 홍 길 동, 시험지유형 b, 국어 95, 영어 100을 변수에 할당후,
총점과 평균을 구해 아래처럼!
이름 : xxxx   시험지유형 : x
국어 : xxx     영어 : xxx
--------------------------
총점 : xxx     평균 : xxx.x
*/
public class Ex1_성적 {
	public static void main(String[] args) {
		//기본값 설정 	          
		      String line="---------------------------";
		      String name=new String("홍 길 동"); //== String name="홍 길 동";
	           char ty='b';
				int 국어=95, 영어=100;
				//처리 
				int tot=국어+영어;
				double ave=(double)tot/2;// == double ave=tot/2.0;		
				//출력 
				//%s는 주소를 대응시키면 '\0'전까지의 모든 문자열을 출력
				System.out.printf("이름 : %s\t시험지유형 : %c\n",name,ty);
				System.out.printf("국어 : %3d\t영어 : %3d\n",국어,영어);
				System.out.println(line);
				System.out.printf("총점 : %3d\t평균 : %5.1f\n",tot,ave);
	}
}
