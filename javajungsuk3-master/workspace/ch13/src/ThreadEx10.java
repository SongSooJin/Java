// class ThreadEx10 implements Runnable  {
//	static boolean autoSave = false;
//
//	public static void main(String[] args) {
//		Thread t = new Thread(new ThreadEx10());
//		t.setDaemon(true);		// �� �κ��� ������ ������� �ʴ´�.
//		t.start();
//
//		for(int i=1; i <= 15; i++) {
//			try{
//				Thread.sleep(1000);
//			} catch(InterruptedException e) {}
//			System.out.println(i);
//			
//			if(i==5)
//				autoSave = true;
//		}
//
//		System.out.println("���α׷��� �����մϴ�.");
//	}
//
//	@Override
//	public void run() {
//		while(true) { // ���ѷ���
//			try { 
//				Thread.sleep(3 * 1000);	// 3�ʸ���
//			} catch(InterruptedException e) {}	
//
//
//			// autoSave�� ���� true�̸� autoSave()�� ȣ���Ѵ�.
//			// �����峢�� �������� ��ȭ�� �ȵ�
//			//
//			if(ThreadEx10.autoSave) {
//				autoSave();
//				// break ������ while���� �����ϴ� ������ �ʿ���� ������
//				// ���󽺷��� �����ϱ� �����̴�. ���󽺷���� �Ϲ� �����尡
//				// ����Ǹ� �����ǹ̰� ���� ������ �ڵ����� ����˴ϴ�.
//				
//			}
//		}
//	}
//
//	public void autoSave() {
//		System.out.println("�۾������� �ڵ�����Ǿ����ϴ�.");
//	}
//}
