import java.rmi.activation.ActivationGroupDesc.CommandEnvironment;

public class FuctionButton {
      private Command command;
      
      public void setCommand(Command command){
            this.command = command;
      }
      
      public void click(){
            command.excute();
      }
}
