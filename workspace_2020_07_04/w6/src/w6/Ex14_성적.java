package w6;

public class Ex14_성적 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sungjuk p = new Sungjuk(11,"홍길동",95,100);
		Sungjuk q = new Sungjuk();
		System.out.println("p--");
		p.disp();
		System.out.println("q--");
		q.disp();
	}

}


class Sungjuk {
	private int _hno;
	private int hno;
	private String name;
	private int kor;
	private int eng;
	public Sungjuk() {}
	// 자바는 함수에서 default 매개변수값의 설정은 불가
//	public Sungjuk(int _hno=0,String _name="no_name", int _kor=0, int _eng=0) {} 에러!
	public Sungjuk(int _hno,String _name, int _kor, int _eng) {
		hno=_hno;
		name=_name;
		kor=_kor;
		eng=_eng;
//		_hno=_hno; //매개변수=매개변수
		this._hno=_hno; //멤버변수=매개변수
		
	}
	public void disp() {
		System.out.printf("%3d \t %3d \t%3d \t %s\t %3d \t %3d\n",this._hno,_hno,hno,name,kor,eng);
	}
}