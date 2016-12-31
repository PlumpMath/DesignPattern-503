
public class client {

      public static void main(String[] args) {
            Command exitCommand,helpCommand;
            exitCommand = new ExitCommand();
            helpCommand  =new HelpCommand();
            
            FuctionButton fuctionButton = new FuctionButton();  
            fuctionButton.setCommand(exitCommand);
            fuctionButton.click();
            
            FuctionButton fuctionButton2 = new FuctionButton();  
            fuctionButton2.setCommand(helpCommand);
            fuctionButton2.click();
            
      }

}
