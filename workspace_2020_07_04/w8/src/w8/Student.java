package w8;

public class Student {
	private int hno;
	private String name;
	public int getHno() {return hno;}
	public String getName() {return name;}
	public Student() {System.out.println("�θ� �μ����� ������");}
	public Student(int hno, String name) {
		this.hno = hno;
		this.name = name;
	}
}

class Sungjuk extends Student {
	private int kor;
	private int eng;
	private int tot;
	private float ave;
	private char grade;
	private int rn;
	public int getRn() { return rn;}
	public void setRn(int soon){ rn=soon;}
	public int getTot() { return tot;}
	public Sungjuk() {}
	public Sungjuk(int hno, String name, int kor, int eng) {
		super(hno,name); // �θ��μ��ִ� ������ ����� ȣ��
		this.kor = kor;
		this.eng = eng;
	}
	
	public void disp1() {
		// �Է��ڷ� ���
		System.out.printf("%3d\t %s\t %3d\t %3d\t",getHno(),getName(),kor,eng);
	} 
	public void disp2() {
		// �Է��ڷ� ���
		System.out.printf("%3d\t %5.1f\t %3c\t %3d\n",tot,ave,grade,rn);
	} 
	
	public void calc() {
		tot = kor + eng;
		ave=(float)tot/2;
		switch((int)ave/10) {
			case 10:
			case 9:grade='A';break;
			case 8:grade='B';break;
			case 7:grade='C';break;
			case 6:grade='D';break;
			default:grade='F';break;
		}//switch
	}
}
