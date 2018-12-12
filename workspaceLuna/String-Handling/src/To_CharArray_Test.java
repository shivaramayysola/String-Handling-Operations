/**
 * Converting String to character  array object
 * converting string to byte array object
 * public char[] to CharArray()
 * public byte[] getBytes()
 * @author shiva
 *
 */
import java.util.Arrays;
public class To_CharArray_Test {

		public static void main(String[] args)
		{

				String s1 = "Shiva"
						+ ""
						+ "";
				char[] ch1 = s1.toCharArray();
				byte[] b1 = s1.getBytes();
				
				System.out.println("s1 :"+s1);
				System.out.println("ch1 :"+Arrays.toString(ch1));
				System.out.println("b1 :"+Arrays.toString(b1));
		}
}
