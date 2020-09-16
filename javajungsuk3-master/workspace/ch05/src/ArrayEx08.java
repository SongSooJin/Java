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
//			 // TODO: 이미 구한 숫자라면 버리고 새숫자를 구해서 넣도록 한다.
//			 lottoNumbers[i] = num;
//		}
//		
//		// sort 메소드는 배열참조를 통해 힙메모리에 있는 배열객체를 대상으로 정렬작업을 진행하고 해당객체에 결과를 덮어 쓴다.
//		Arrays.sort(lottoNumbers);
//		
//		System.out.println(Arrays.toString(lottoNumbers));
//	
//	}
//
//	private static void example() {
//		// TODO Auto-generated method stub
//
//		// 45개의 정수값을 저장하기 위한 배열 생성.
//		int[] ball = new int[45];
//
//		// 배열의 각 요소에 1~45의 값을 저장한다.
//		for (int i = 0; i < ball.length; i++)
//			ball[i] = i + 1; // ball[0]에 1이 저장된다.
//
//		int temp = 0; // 두 값을 바꾸는데 사용할 임시변수
//		int j = 0; // 임의의 값을 얻어서 저장할 변수
//
//		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
//		// 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
//		for (int i = 0; i < 6; i++) {
//			j = (int) (Math.random() * 45); // 0~44범위의 임의의 값을 얻는다.
//			temp = ball[i];
//			ball[i] = ball[j];
//			ball[j] = temp;
//		}
//
//		// 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
//		for (int i = 0; i < 6; i++)
//			System.out.printf("ball[%d]=%d%n", i, ball[i]);
//	}
//}
