////5-8
//import java.util.Arrays;
//import java.util.Random;
//
//class ArrayEx08 {
//
//	static Random rnd = new Random();
//
//	public static void main(String[] args) {
//		// example();
//
//		int[] lottoNumbers = new int[6];
//		int num = 0;
//
//		for (int i = 0; i < lottoNumbers.length; i++) {
//			 num = rnd.nextInt(45); // (int) (Math.random() * 45)+1;
//			 
//			 // TODO: �̹� ���� ���ڶ�� ������ �����ڸ� ���ؼ� �ֵ��� �Ѵ�.
//			 lottoNumbers[i] = num;
//		}
//		
//		// sort �޼ҵ�� �迭������ ���� ���޸𸮿� �ִ� �迭��ü�� ������� �����۾��� �����ϰ� �ش簴ü�� ����� ���� ����.
//		Arrays.sort(lottoNumbers);
//		
//		System.out.println(Arrays.toString(lottoNumbers));
//	
//	}
//
//	private static void example() {
//		// TODO Auto-generated method stub
//
//		// 45���� �������� �����ϱ� ���� �迭 ����.
//		int[] ball = new int[45];
//
//		// �迭�� �� ��ҿ� 1~45�� ���� �����Ѵ�.
//		for (int i = 0; i < ball.length; i++)
//			ball[i] = i + 1; // ball[0]�� 1�� ����ȴ�.
//
//		int temp = 0; // �� ���� �ٲٴµ� ����� �ӽú���
//		int j = 0; // ������ ���� �� ������ ����
//
//		// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
//		// 0��° ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
//		for (int i = 0; i < 6; i++) {
//			j = (int) (Math.random() * 45); // 0~44������ ������ ���� ��´�.
//			temp = ball[i];
//			ball[i] = ball[j];
//			ball[j] = temp;
//		}
//
//		// �迭 ball�� �տ��� ���� 6���� ��Ҹ� ����Ѵ�.
//		for (int i = 0; i < 6; i++)
//			System.out.printf("ball[%d]=%d%n", i, ball[i]);
//	}
//}
