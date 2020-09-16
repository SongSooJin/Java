package w8;
/*
 * static 메소드는 오직 static 멤버만 접근 가능
 * 객체가 생성되지 않은 상황에서도 static 메소드는 실행될 수 있기 때문에, non-static 멤버 활용 불가
 * non-static 메소드는 static 멤버 사용 가능

 */
public class StaticMethod {

	int n;
	static int m;
	void f1(int x) {n=x;}
	void f2(int x) {m=x;}
	
	//static void s1(int x) {n=x;}// static 메소드는 오직 static멤버만 접근가능
	//static void s2(int x) {f1(3);} //  static 메소드는 오직 static 멤버만 접근 가능
	
	static void s3(int x) {m=x;}
	static void s4(int x) {s3(3);}
}
