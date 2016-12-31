
public class client {
      public static void main(String[] args) {
            Component component;
            component = new TextView();
            component.display();
            System.out.println("-------------------------");
            BlackBorderDecorator blackBorderDecorator = new BlackBorderDecorator(component);
            blackBorderDecorator.display();
      }
}
