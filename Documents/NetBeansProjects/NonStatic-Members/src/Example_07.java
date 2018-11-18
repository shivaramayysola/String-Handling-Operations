public class Example_07 {
    int x = 10;
    int y = 20;
    
    void m1()
    {
        System.out.println("m1");
    }
    void printxy()
    {
            System.out.println(x);
            System.out.println(y);
            
            m1();
    }
    public static void main(String[] args)
   {
        Example_07 e1 = new Example_07();
        e1.m1();
        e1.printxy();
       }
 }
