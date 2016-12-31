
public class client {
      public static void main(String[] args) {
                  String statement = "0 or 1 and 1 or 0";
                  Context ctxContext  = new Context();
                  ctxContext.parse(statement);
                  int result = ctxContext.excute();
                  System.out.println(statement + "="+result);
      }
}
