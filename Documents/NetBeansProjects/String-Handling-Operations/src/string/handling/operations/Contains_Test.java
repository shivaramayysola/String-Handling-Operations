/**
 * Searching for the sub string anywhere in the current string
 *public boolean contains(String s)
 * @author shiva
 *
 */
public class Contains_Test {
	public static void main(String[] args)
	{

			String s1 = "JavaJamesGosling";
		//	System.out.println(s1.contains('a'));
			System.out.println(s1.contains("a"));
			System.out.println();
			
			System.out.println(s1.contains("A"));
			System.out.println();
			
			System.out.println(s1.contains("James"));
			System.out.println();
			
			System.out.println(s1.contains("james"));
			System.out.println();
			
			System.out.println(s1.equals("James"));
			System.out.println();
			
			System.out.println(s1.contains("James"));
			System.out.println();
			
			System.out.println(s1.equals("JavaJames"));
			System.out.println();
			
			System.out.println(s1.contains("JavaJames"));
			System.out.println();
	}
}
