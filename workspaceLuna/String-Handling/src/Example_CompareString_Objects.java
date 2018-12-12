
public class Example_CompareString_Objects {
		int x;
		Example_CompareString_Objects(int x)
		{
				this.x = x;
				
		}
		public boolean equals(Object obj)
		{
				if(obj instanceof Example_CompareString_Objects)
				{
						Example_CompareString_Objects e = 	(Example_CompareString_Objects)obj;
						return(this.x == e.x);
						
						
				}
				return false;
		}
}
class Sample1{}
