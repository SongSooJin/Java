package w8;
/*
 * static �޼ҵ�� ���� static ����� ���� ����
 * ��ü�� �������� ���� ��Ȳ������ static �޼ҵ�� ����� �� �ֱ� ������, non-static ��� Ȱ�� �Ұ�
 * non-static �޼ҵ�� static ��� ��� ����

 */
public class StaticMethod {

	int n;
	static int m;
	void f1(int x) {n=x;}
	void f2(int x) {m=x;}
	
	//static void s1(int x) {n=x;}// static �޼ҵ�� ���� static����� ���ٰ���
	//static void s2(int x) {f1(3);} //  static �޼ҵ�� ���� static ����� ���� ����
	
	static void s3(int x) {m=x;}
	static void s4(int x) {s3(3);}
}
