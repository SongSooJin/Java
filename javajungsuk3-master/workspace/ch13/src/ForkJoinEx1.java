//import java.util.concurrent.*;
//
//class ForkJoinEx1 {
//	static final ForkJoinPool pool = new ForkJoinPool();  // 쓰레드풀을 생성
//
//	public static void main(String[] args) {
//		long from = 1L;
//		long to   = 100_000_000L;
//
//		SumTask task = new SumTask(from, to);
//
//		long start = System.currentTimeMillis(); // 시작시간 초기화
//		Long result = pool.invoke(task);
//
//		System.out.println("Elapsed time(4 Core):"+(System.currentTimeMillis()-start));
//		System.out.printf("sum of %d~%d=%d%n", from, to, result);
//		System.out.println();
//
//		result = 0L;
//		start = System.currentTimeMillis(); // 시작시간 초기화
//		for(long i=from;i<=to;i++)
//			result += i;
//
//		System.out.println("Elapsed time(1 Core):"+(System.currentTimeMillis()-start));
//		System.out.printf("sum of %d~%d=%d%n", from, to, result);
//	} // main의 끝
//}
//
//class SumTask extends RecursiveTask<Long> {
//	long from;
//	long to;
//
//	SumTask(long from, long to) {
//		this.from = from;
//		this.to    = to;
//	}
//
//	public Long compute() {
//		long size = to - from; // form <= size <= to 
//
//		// if(5000 <= size)
//		if(size <= 5)     // 더할 숫자가 5개 이하면
//			return sum(); // 숫자의 합을 반환
//
//		long half = (from+to)/2;
//
//		// 범위를 반으로 나눠서 두 개의 작업을 생성
//		SumTask leftSum  = new SumTask(from, half);
//		SumTask rightSum = new SumTask(half+1, to);
//
//		leftSum.fork();
//		// 해당 작업을 스레드 폴의 작업 큐에 넣는다. 비기동 메소드
//		
//		return rightSum.compute() + leftSum.join();
//		// 해당 작업의 수행이 끝날 때까지 기다렸다가 수행이 끝나면 그 결과를 반환한다.
//	}
//
//	long sum() { // from~to의 모든 숫자를 더한 결과를 반환
//		long tmp = 0L; 
//
//		for(long i=from;i<=to;i++)
//			tmp += i;
//
//		return tmp;
//	}
//}
