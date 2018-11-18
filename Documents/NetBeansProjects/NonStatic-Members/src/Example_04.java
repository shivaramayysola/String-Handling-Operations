public class Example_04 {
    static int a = 10;
    static int b = 20;
    
    int x = 30;
    int y = 40;
    
    public static void main(String[] args)
    {
        Example_04 e1 = new Example_04();
        Example_04 e2 = new Example_04();
        
        Example_04 e3 = null;
        
        System.out.println("main start");
        
        System.out.println(a);
        System.out.println(b);
       
        e1.a = 50;
        e1.b = 60;
        
        System.out.println(e1.a);
        System.out.println(e1.b);
        
        e1.x = 70;
        e1.y = 80;
        
        System.out.println(e1.x);
        System.out.println(e1.y);
        
        System.out.println(Example_04.a);
        System.out.println(Example_04.b);
        
        System.out.println("main end");
    }
}
