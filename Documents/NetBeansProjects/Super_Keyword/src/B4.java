public class B4 extends A4 {
    int x = 30;
    int y = 40;
    
    void m2()
    {
            System.out.println(x);
                System.out.println(y);

    
    }
    public static void main(String[] args)
    {
                B4 b1 = new B4();
                B4 b2 = new B4();
                
                b2.x = 50;
                b2.y = 60;
                
                b1.m1();
                b1.m2();
                
                System.out.println();
                
                b2.m1();
                b2.m2();
                        
            
        }
}
