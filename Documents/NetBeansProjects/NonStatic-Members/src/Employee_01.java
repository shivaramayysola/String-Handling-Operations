public class Employee_01 {
    int eid;
    String empname;
    String company;
    
    @Override
    public String toString()
    {
            return " eid    : " + eid     + " \n " +
                   " ename  : " + empname +" \n " +
                   " company: " + company + " \n ";
    }
    public static void main(String[] args)
    {
            Employee_01 e1 = new Employee_01();
          
            e1.eid = 124;
            
            e1.empname = "Shiva";
            e1.company = "collebra";
            
            System.out.println(e1);
    }
}
