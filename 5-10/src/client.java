
public class client {
      public static void main(String[] args) {
            Account account;
            account= new CurrentAccount();
            account.handle();
            System.out.println("--------------------");
            account = new SavingAccount();
            account.handle();
      }
}
