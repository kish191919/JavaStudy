class LogicalOp{
	public static void main(String[] args){
		int num1 = 11;
		int num2 = 22;
		boolean result;

		result = (1 < num1) && (num1 < 100);
		System.out.println(result);

		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
		System.out.println(result);

		result = !(num1 != 0);
		System.out.println(result);
	}
}