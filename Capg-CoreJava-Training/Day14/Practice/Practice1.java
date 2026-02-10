package Day14.Practice;

public class Practice1 {

	public static void main(String[] args) {
		
//		Wrapper to primitive (lower size to higher size conversion is possible only, higher to lower is not possible even with type casting also(narrowing)
		Byte b = 100;
		byte b1 = b;
		System.out.println(b1);
		short s1 = b;
		System.out.println(s1);
		
		int i1 = b;
		System.out.println(i1);
		
		long l1 = b;
		System.out.println(l1);
		
		float f1 = b;
		System.out.println(f1);
		
		double d1 = b;
		System.out.println(d1);
		
		
		
		Integer i2 = 120;
		byte b2 = i2.byteValue();
		System.out.println(b2);
		
		long l2 = i2;
		System.out.println(l2);
		System.out.println();
		
		
//		primitive to Wrapper
		byte b3 = 123;
		Byte b4 = b3;
		Short s2 = (short)b3;
		System.out.println(s2);
		Integer i3 = (int)b3;
		Long l3 = (long)b3;
		Float f2 = (float)b3;
		Double d2 = (double)b3;
				
		
		Long l4 = 1234L;
		Byte b5 = l3.byteValue();
		System.out.println(b5);
	}

}
