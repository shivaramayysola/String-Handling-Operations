public class Example_09 {
    int x = 10;
    int y = 20;
    
    
    void printxy()
    {
            System.out.println(x);
            System.out.println(y);
            
         
    }
    public static void main(String[] args)
   {
        Example_09 e1 = new Example_09();
        Example_09 e2 = new Example_09();
        e1.printxy();
        e2.printxy();
       }
 }
