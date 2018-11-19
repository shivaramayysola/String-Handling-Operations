public class Test {
    public static void main(String[] args)
    {
            B_01 b1= new B_01();
            A_01 a1 = b1;
            System.out.println(b1.x);
            System.out.println(b1.y);
             System.out.println(a1.x);
           // System.out.println(a1.y);
           b1.m1();
           b1.m2();
           b1.toString();
    }
}
