public class Example_String {
	public static void main(String[] args)
	{
		String e1 = new String();
		System.out.println(e1);
			
		String s2 = "abc";
		
		// String copy
		String s3 = new String(s2);
		
		//Creating string with direct string literal
		String s4 = new String("bbc");
		
		//String Assignment
		String s5 = s4;
		
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+ s3);
		System.out.println("s4 : "+ s4);
		System.out.println(s2==s3);
		System.out.println(s4==s5);
		
		//String(char[] ch)
		char[] ch = {'a','b','c','d','e','f'};
		String s6 = new String(ch);
		System.out.println("s6 : "+ s6);
	
		//String(char[] ch,int offset,int count)
		char[] ch1  = {'a','b','c','d','e','f'};
		String s7  = new String(ch1,2,3);
		System.out.println("s7 : "+s7);
		
		//String(byte[] b)
		byte[] b = {97,98,99};
		String s8 = new String(b);
		System.out.println(s8);
		
		
		//String(byte[] b, int offset,int count)
		byte[] b1 = {97,98,99};
		String s9 = new String(b1,1,1);
		System.out.println("s9 : " +s9);
		
		//String s10 = new String(ch1,-2,4);
		//System.out.println("s10 : "+ s10);
	/**	Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -2
		at Example_String.main(Example_String.java:45) */
		
		String s11  = new String(ch1,2,4);
		System.out.println("s11  : "+ s11);
		System.out.println("s11 length : "+ s11.length());
		System.out.println();
	
		
		String s12  = new String(ch1,6,0);
		System.out.println("s12  : "+ s12);
		System.out.println("s12 length : "+ s12.length());
		System.out.println();
	
		String s13  = new String(ch1,2,0);
		System.out.println("s13  : "+ s13);
		System.out.println("s13 length : "+ s13.length());
		System.out.println();
	
		
		String s17  = new String(ch1,2,1);
		System.out.println("s17  : "+ s17);
		System.out.println("s17 length : "+ s17.length());
		System.out.println();
		
		
		String s18  = new String(ch1,0,2);
		System.out.println("s18  : "+ s18);
		System.out.println("s18 length : "+ s18.length());
		System.out.println();
		
		//ambigious error 
		//String s19 = new String(null);
	
	
	}
}
