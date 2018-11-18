public class LocalPreference_With_Parameter {
    static int a;
    static void m1(int x)
    {
        a = x;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        System.out.println("main start");
        System.out.println(a);
        m1(50);
        System.out.println(a);
        System.out.println("main end");
    }       
}
