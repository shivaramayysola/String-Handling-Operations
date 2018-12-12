import java.util.*;
public class Checking_StringEmpty_Test {
	public static void main(String[] main)
	{

		String s1 = "";
		String s2 = "";
		String s3 = "a";
		String s4 = new String();
		String s5 = new String("");
		String s6 = new String(" ");
		String s7 = new String("a");
	
		System.out.println("is S1 empty : "+s1.isEmpty());
		System.out.println("is S2 empty : "+s2.isEmpty());
		System.out.println("is S3 empty : "+s3.isEmpty());
		System.out.println("is S4 empty : "+s4.isEmpty());
		System.out.println("is S5 empty : "+s5.isEmpty());
		System.out.println("is S6 empty : "+s6.isEmpty());
		System.out.println("is S7 empty : "+s7.isEmpty());
	
		//System s8 = null;
	//	System.out.println("is S8 empty : "+s8.isEmpty());
		
	//	String s9;
		//System.out.println("is S9 empty : "+s9.isEmpty());
		
		Scanner scn = new Scanner(System.in);
		System.out.println("\n Enter String1 : ");
		System.out.println(scn.nextLine().isEmpty());
	
		System.out.println("\n Enter String2 : ");
		System.out.println(scn.nextLine().isEmpty());
	
		System.out.println("\n Enter String3 : ");
		System.out.println(scn.nextLine().isEmpty());
	
	
	}
	
}
