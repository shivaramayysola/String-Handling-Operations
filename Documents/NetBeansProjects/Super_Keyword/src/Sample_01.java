public class Sample_01 extends Example_01 {
            Sample_01()
            {
                    System.out.println("Sample zero - param");
            }
            Sample_01(int a)
            {
                    super(50);
                    System.out.println("Sample int param");
            }
            public static void main(String[] args)
                    
            {
                    Sample_01 s1 = new Sample_01();
                    Sample_01 s2 = new Sample_01();
            }
}
