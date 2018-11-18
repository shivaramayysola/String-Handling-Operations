public class Example_This {
    int x = 10;
    int y = 20;
    
    void setXY()
    {   
            this.x = 10;
            this.y = 20;
    }       
            void printXY()
            {
                    System.out.println(" x  : "+this.x);
                    System.out.println(" y : "+this.y);
            }
    void m1()
    {
            this.setXY();
            this.printXY();
            
    }
            public static void main(String[] args)
            {   
                Example_This e1 = new Example_This();
                e1.m1();
            }
    
}
