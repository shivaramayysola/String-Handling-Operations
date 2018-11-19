public class B extends A {
            int y;
            B(){
                    y = x + 4;
                    //super();
                }
            public static void main(String[] args)
            {
                System.out.println("Main");
                    B b1 = new B();
            }
            
}
