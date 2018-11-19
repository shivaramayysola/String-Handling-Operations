
public class B5 extends A5 {
 int a = 30;
    int x = 40;
    static void m1()
    {
            System.out.println("B m1");
    }
    void m2()
    {
            System.out.println(x);
            System.out.println(y);
         
            System.out.println(super.x);
            System.out.println(super.y);
            
      }
        void m4()
        {
                x = 50;
                y = 60;
                
                super.x = 70;
                super.y = 80;
        }
}
