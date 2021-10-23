class BitOpMeans{

	public static void main(String[] args){
		byte n1 = 13;
		byte n2 = 7;
		byte n3 = (byte)(n1 & n2);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

		byte n4 = (byte)(n1 | n2);
		System.out.println(n4);		 // 15

		byte n5 = (byte)(n1 ^ n2);
		System.out.println(n5);	    // 10

		byte n6 = (byte)(~n1);   
 		System.out.println(n6);	    // 2		

			}

}