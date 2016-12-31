
public class client {

      public static void main(String[] args) {
            EmployeeList list = new EmployeeList();
            Employee fte1,fte2,fte3,pte1,pte2;
            fte1 = new FulltimeEmployee("章子怡", 4000.00, 45);
            fte2 = new FulltimeEmployee("汪峰", 2000.00, 25);
            fte3 = new FulltimeEmployee("刘翔", 2400.00, 15);
            pte1 = new ParttimeEmployee("李晨",3600 , 50);
            pte2 = new ParttimeEmployee("范冰", 4500,26 );
            
            list.addEmployee(fte1);
            list.addEmployee(fte2);
            list.addEmployee(fte3);
            list.addEmployee(pte1);
            list.addEmployee(pte2);
            
            Department fa,hr;
            fa = new FADepartment();
            hr = new HRDepartment();
            
            System.out.println("财务处理数据：");
            list.accept(fa);
            
            System.out.println("-----------------");
            System.out.println("人力资源处理数据：");
            list.accept(hr);
      }

}
