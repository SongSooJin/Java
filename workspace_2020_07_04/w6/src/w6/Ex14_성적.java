package w6;

public class Ex14_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sungjuk p = new Sungjuk(11,"ȫ�浿",95,100);
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
	// �ڹٴ� �Լ����� default �Ű��������� ������ �Ұ�
//	public Sungjuk(int _hno=0,String _name="no_name", int _kor=0, int _eng=0) {} ����!
	public Sungjuk(int _hno,String _name, int _kor, int _eng) {
		hno=_hno;
		name=_name;
		kor=_kor;
		eng=_eng;
//		_hno=_hno; //�Ű�����=�Ű�����
		this._hno=_hno; //�������=�Ű�����
		
	}
	public void disp() {
		System.out.printf("%3d \t %3d \t%3d \t %s\t %3d \t %3d\n",this._hno,_hno,hno,name,kor,eng);
	}
}