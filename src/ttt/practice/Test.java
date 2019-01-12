package ttt.practice;

public class Test {
	public int num = 0;

	public static void main(String[] args) {
		// callByTest();
		strTest();
	}

	private static void strTest() {
//		char c = 'A';
//		char c = 65;
//		char c = '\uD55C';
		char c = '부';
		byte b = 'B';
		
		System.out.println(c + ", " + (int)c + ", " + Integer.toHexString((int)c));
		System.out.println(b);
		System.out.println((char)c   + " : " +  (char)b);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println("AB한".getBytes().length);
		System.out.println("한글".getBytes().length);
		
		double d = 3.14;
		float f = 3.14f;
		double x = 0.1 + 0.2;
		System.out.println((double)x);
		System.out.println(String.format("%.50f", (0.1 + 0.2)));
	}

	private static void callByTest() {
		Test t1 = new Test();
		t1.num = 100;

		changeReference(t1);

		System.out.println("-->> " + t1.num);
	}

	public static void changeValue(String s) {
		s = "CHANGE";
	}

	public static void changeReference(Test t) {
		t.num = 300;
	}
}
