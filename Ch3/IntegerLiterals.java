class IntegerLiterals{
	public static void main(String[] args){
		int num1 = 123;
		int num2 = 0123;
		int num3 = 0x123;

		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
		System.out.println("num3 :" + num3);

		System.out.println("11 +22 +33 :" + (11 +22 +33));
		System.out.println("011 +022 +033 :" + (011 +022 +033));
		System.out.println("0x11 +0x22 +0x33 :" + (0x11 +0x22 +0x33));
		System.out.println(3147483647L + 3147483648l);
		System.out.println(31_32_11 + 11_11_11);
		
		System.out.println(3.0004999 + 2.0004999);
		System.out.println(3.0004999f + 2.0004999f);
		System.out.println(3.0004999d + 2.0004999d);
	}
}