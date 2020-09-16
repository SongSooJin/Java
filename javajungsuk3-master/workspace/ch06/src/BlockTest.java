////6-27
//import java.util.Arrays;
//
//class BlockTest {
//
//	static String a = "";
//	
//	static {
//		System.out.println("1 : static { }");
//		a = "Hi";
//	}
// 
//	String b = "";
//	
//	{
//		System.out.println("2 : { }");
//	}
//	
//	int[] nums ;
//	{
////		nums = new int[10];
////		for (int i = 0; i < nums.length; i++) {
////			nums[i] = i * i;
////		}
//	}
//
//	
//	
//	public BlockTest() {     
//		System.out.println("3 : »ý¼ºÀÚ");
//		
//		nums = new int[10];
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = i * i;
//		}
//	}
//
//	public static void main(String args[]) {
//	//	System.out.println("BlockTest bt = new BlockTest(); ");
//		BlockTest bt = new BlockTest();
//		System.out.println();
//		
//	//	System.out.println("BlockTest bt2 = new BlockTest(); ");
//		BlockTest bt2 = new BlockTest();
//		
//		System.out.println(Arrays.toString(bt2.nums));
//	}
//}
