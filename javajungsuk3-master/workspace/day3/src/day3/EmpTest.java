//package day3;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//// �������̽��� ����� �߻�޼ҵ常 ���� �ִ�./ ���������� / �������̽� �ڵ� Public 
//// �������� ���׵� 
//interface Emp {
//	static final String compName = "TopCredu";
//	// �߻�޼ҵ�
//	public abstract void work();
//}
//
//// abstract : � Ŭ������ ��ü������ ������
////abstract class Emp {
////	int empno; // ���� : � Ŭ������ �Ӽ� ,���¸� ��Ÿ��
////
////	void gotoOffice() {
////		System.out.println(empno + "��(��) ����մϴ�.");
////	}
////
////	// �߻�޼ҵ�- �ڽĵ��� ���� �°� ��� 
////	// �߻�޼ҵ尡 �ϳ��� ������ Ŭ�������� �ݵ�� �پ���� (abstract)
////	abstract void work();
////	public String toString() {
////		return "[���:" + empno + "]";
////	}
////}
//
//// class Emp {
////	int empno; // ���� : � Ŭ������ �Ӽ� ,���¸� ��Ÿ��
////
////	Emp(int empno) {
////		this.empno = empno;
////	} // �����ڴ� new�Ҷ� ȣ���
////
////	Emp() {
////	}
////
////	void gotoOffice() {
////		System.out.println(empno + "��(��) ����մϴ�.");
////	}
////
////	public String toString() {
////		return "[���:" + empno + "]";
////	}
////}
//
//class Programmer implements Emp {
//	public void work() {
//		System.out.println(compName + " ���α׷���...Work");
//	}
//}
//
//class Designer implements Emp {
//	public void work() {
//		System.out.println(compName + " �����̳�...Work");
//	}
//}
//
////class Programmer extends Emp {
////	void work() {
////		System.out.println(empno + "��(��) ���α׷���...Work");
////	}
////}
////
////class Designer extends Emp {
////	void work() {
////		System.out.println(empno + "��(��) �����̳�...Work");
////	}
////}
//
//public class EmpTest {
//
//	public static void main(String[] args) {
//
//		Emp e1 = new Programmer();
//
//		Programmer p1 = new Programmer();
//		p1.work();
//
//		Emp d1 = new Designer();
//		((Designer) d1).work();
//
//		// �� (value) ���� Emp�ε� �� ���α׷��� �����̳ʰ� ���ü��ֳ�
//		// �ڽ� Ŭ������ �Ϻ��� �θ� Ŭ������.
//		Map<Integer, Emp> m1 = new HashMap<Integer, Emp>();
//		m1.put(1, new Programmer());
//		m1.put(2, new Designer());
//
//		System.out.println(m1);
//		
//		//  ArrayList  : �迭������ ũ�Ⱑ �������� �þ�� �迭 
//		// List : �������̽� 
//		List<Emp> emps = new ArrayList<Emp>();
//		emps.add(new Programmer());
//		emps.add(new Designer());
//		
//		System.out.println(emps);
//		
//		// �߻� Ŭ������ new�Ҽ� ���� ������ ���ʿ� ������ Ÿ�����δ� �ü��ִ�.
////		Emp e1 = new Programmer();
////
////		// new �ϰ� �Ǹ� ��ü�� �޸� ���� ����� ����.
////		Programmer p1 = new Programmer();
////		// = Emp p1 = new Programmer();
////		// ProgrammerŸ���� ���ƾ��� p1�� Ÿ���� Programmer.
////		// ������ �����ʺ��� Ŀ����
////		p1.gotoOffice();
////		p1.work();
////
////		// ����������� �ڵ�
////		// ��ü ����� ������
////		Emp d1 = new Designer();
////		d1.gotoOffice();
////		((Designer) d1).work();
////
////		// Map => ��Ʈ�� : (Ű, ��)
////		Map<Integer, Emp> m1 = new HashMap<Integer, Emp>();
////		m1.put(1, new Emp(1));
////		m1.put(2, new Emp(2));
////
////		System.out.println(m1.get(1));
//	}
//
//}



