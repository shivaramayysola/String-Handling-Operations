/**
 * 
 * 
 */

import java.util.StringTokenizer;
public class StringTokenizer_Test {
	public static void main(String[] args)
	{
			StringTokenizer st = new StringTokenizer("James Java");
			System.out.println("Number of Tokens :"+st.countTokens());
			while(st.hasMoreTokens())
			{
				String token = st.nextToken();
				System.out.println(token);
			}
	}
}
