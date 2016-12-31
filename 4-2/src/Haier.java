
public class Haier extends Manufacturer {

      @Override
      public void produce() {
            System.out.print("生产海尔电器——");
            appliance.assemble();
      }
      
}
