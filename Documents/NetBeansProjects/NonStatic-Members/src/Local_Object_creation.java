public class Local_Object_creation {
    int x = 10;
    int y =20;
    
    void m1()
    {
            Local_Object_creation loc1 = new Local_Object_creation();
            loc1.x = 50;
            loc1.y = 60;
    }
    public static void main(String[] args)
    {
            Local_Object_creation loc2 = new Local_Object_creation();
            System.out.println(loc2.x +"..........."+ loc2.y);
            loc2.m1();
            System.out.println(loc2.x +"............"+ loc2.y);
            
    }
    
}
