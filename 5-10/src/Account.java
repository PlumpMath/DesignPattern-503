
public abstract class Account {
      public abstract void getUserType() ;
      public abstract void calculateInterest() ;
      
      public void display() {
            System.out.println("显示信息");
      }
      
      public void findUser() {
            System.out.println("查询用户信息");
      }
      
      public void handle(){
            findUser();
            getUserType();
            calculateInterest();
            display();
      }
      
}
