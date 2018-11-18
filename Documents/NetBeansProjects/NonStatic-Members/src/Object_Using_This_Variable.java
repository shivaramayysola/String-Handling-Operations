public class Object_Using_This_Variable {
    int x = 10;
    int y = 20;
    
    void m1(Object_Using_This_Variable o)
    {
            System.out.println("passed object original values");
            System.out.println(x +"......."+ y);
    
               x = 5;
               y = 6;
               
               System.out.println("object values after modification");
               System.out.println(x + "....." + y);
                       
    }        
            public static void main(String[] args)
            {
                    Object_Using_This_Variable o1 = new Object_Using_This_Variable();
                    Object_Using_This_Variable o2 = new Object_Using_This_Variable();
                         
                    System.out.println("o1 object values before calling m2() method");
                    System.out.println(o1.x +"......"+ o1.y);
                    
                    o1.m1(o2);
                    
                    System.out.println("o2 object values after calling m2() method");
                    System.out.println(o1.x +"......."+ o1.y);
               }
    
}
