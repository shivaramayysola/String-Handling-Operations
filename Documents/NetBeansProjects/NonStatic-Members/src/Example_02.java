public class Example_02 {
    static int a = 10;
    static int b = 20;
    
    int x = 30;
    int y = 40;
    
    public static void main(String[] args)
    {
            System.out.println(" a : "+a);
            System.out.println(" b :"+b);
            
            System.out.println(" a : "+Example_02.a);
            System.out.println(" b : "+Example_02.b);
            
            Example_02 e1 = new Example_02();
            
            System.out.println(" x :"+e1.x);
            System.out.println(" y :"+e1.y);
            
            System.out.println(" a : "+e1.a);
            System.out.println(" b : "+e1.b);
            
            //Non static variable x cannot be referenced from a static context
          // System.out.println(" x :"+Example_02.x);
        //    System.out.println(" y :"+Example_02.y);
            
        //Example_02 e2 = null;
        //System.out.println(e2.a);   // Accessing static field a 
        //System.out.println(e2.x);
        
        
            
    }
}
