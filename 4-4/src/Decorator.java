
public class Decorator implements Component{

      private Component component;
      public Decorator(Component component) {
            this.component = component;
      }
      
      public void display() {
            component.display();
      }

}
