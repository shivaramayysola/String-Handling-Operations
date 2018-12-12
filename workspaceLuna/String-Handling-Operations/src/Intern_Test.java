/**
 * public String Intern()
 * @author shiva
 *
 */
public class Intern_Test {
	public static void main(String[] args)
	{
			String s1 = "Shiva";
			String s2 = s1.intern();
			System.out.println(s1==s2);
			System.out.println();
			
			String s3 = new String("Ram");
			String s4 = s3.intern();
			String s5 = "Ram";
			System.out.println(s3==s4);
			System.out.println(s3==s5);
			System.out.println();
			
			String s6 = s1.trim();
			String s7 = s6.intern();
			System.out.println(s6==s7);
			
			String s8 = "ShivaRam";
			String s9 = s6.concat(s5);
			String s10 = s9.intern();
			System.out.println(s8==s10);
			
	}
}
