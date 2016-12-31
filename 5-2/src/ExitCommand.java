
public class ExitCommand extends Command{
      
      private SystemExitClass seobj;
      
      public ExitCommand() {
            seobj = new SystemExitClass();
      }

      @Override
      public void excute() {
            seobj.exit();
      }

}
