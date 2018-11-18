public class LocalPreference_With_Parameter_02 {
    static int a;
    static void m1(int a)
    {
            LocalPreference_With_Parameter_02.a = a;
            System.out.println(a);
    }
    public static void main(String[] args)
    {
            System.out.println(a);
            m1(20);
            System.out.println(a);
        }
}
