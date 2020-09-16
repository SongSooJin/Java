//import java.math.*;
//import static java.math.BigDecimal.*;
//import static java.math.RoundingMode.*;
//
//class BigDecimalEx {
//	public static void main(String[] args) throws Exception {
//		
//		double $a = 0.03;
//		double b = 0.04;
//		double c = b - $a;
//		System.out.println(c);
//		
//		// #1 ���� �����ؼ� ������ ����� ���� ������ �Ŀ� ������� ���� ���´�.
//		
//		// #2 Ŀ�ٶ� ���� ��Ȯ�� ����� �����ϴ� Ŭ������ ����Ѵ�.
//		BigDecimal _a = new BigDecimal("0.03");
//		BigDecimal _b = new BigDecimal("0.04");
//		BigDecimal _c = _b.subtract(_a);
//		System.out.println(_c);
//		
//		System.out.println(" ");
//		System.out.println(1 + 2);
//		System.out.println(0.1 + 2.0);
//		System.out.println(1 - 2.0);
//		System.out.println(1.0 + 0.2);
//		
//		BigDecimal bd1 = new BigDecimal("123.456"); 
//		BigDecimal bd2 = new BigDecimal("1.0"); 
//
//		System.out.print("bd1="+bd1);
//		System.out.print(",\tvalue="+bd1.unscaledValue());
//		System.out.print(",\tscale="+bd1.scale());		 
//		System.out.print(",\tprecision="+bd1.precision());
//		System.out.println();
//
//		System.out.print("bd2="+bd2);
//		System.out.print(",\tvalue="+bd2.unscaledValue());
//		System.out.print(",\tscale="+bd2.scale());		 
//		System.out.print(",\tprecision="+bd2.precision());
//		System.out.println();
//
//		
//		BigDecimal bd3 = bd1.multiply(bd2);
//		System.out.print("bd3="+bd3);
//		System.out.print(",\tvalue="+bd3.unscaledValue());
//		System.out.print(",\tscale="+bd3.scale());		 
//		System.out.print(",\tprecision="+bd3.precision());
//		System.out.println();
//
//		System.out.println(bd1.divide(bd2, 2, HALF_UP)); // 123.46
//		System.out.println(bd1.setScale(2, HALF_UP));    // 123.46
//		System.out.println(bd1.divide(bd2, new MathContext(2, HALF_UP)));
//	}
//}
