public class Example_03 {
    int x = 10;
    int y = 20;
    public static void main(String[] args)
    {
            Example_03 e1 = new  Example_03();
            Example_03 e2 = new  Example_03();
            
            e1.x = 50;
            e2.y = 60;
            
            System.out.println(e1.x +"........"+ e1.x);
            System.out.println(e2.x +"........."+ e2.y);
    }
            
}
