
public class HelpCommand extends Command{
      
      private DisplayHelpClass dhObj;
      
      public HelpCommand() {
            dhObj = new DisplayHelpClass();
      }

      @Override
      public void excute() {
            dhObj.display();
      }

}
