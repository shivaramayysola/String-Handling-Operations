/**
 * 
 *Public int length()
 */
import java.util.Scanner;
public class Finding_LegthOfString_Test {
	public static void main(String[] args)
	{
			String s1 = "";
			String s2 = " ";
			String s3 = "ab";
			String s4 = new String();
			String s5 = new String("");
			String s6 = new String(" ");
			String s7 = new String("ab");
			
			System.out.println("s1 length :"+s1.length());
			System.out.println("s2 length :"+s2.length());
			System.out.println("s3 length :"+s3.length());
			System.out.println("s4 length :"+s4.length());
			System.out.println("s5 length :"+s5.length());
			System.out.println("s6 length :"+s6.length());
			System.out.println("s7 length :"+s7.length());
			
			//System s8 = null;
			//	System.out.println("is S8 length : "+s8.length());
				
			//	String s9;
				//System.out.println("is S9 length : "+s9.length());
				
				Scanner scn = new Scanner(System.in);
				System.out.println("\n Enter String1 : ");
				System.out.println(" You entered " +scn.nextLine().length()+ "characters");
			
				System.out.println("\n Enter String2 : ");
				System.out.println("You entered" +scn.nextLine().length()+ "characters");
			
				System.out.println("\n Enter String3 : ");
				System.out.println("You entered " +scn.nextLine().length()+ "characters");
	}
	static String s10;
}
