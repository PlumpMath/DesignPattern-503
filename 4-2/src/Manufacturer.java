
public abstract class Manufacturer {
      protected Appliance appliance;
      
      public void setAppliance(Appliance appliance){
            this.appliance = appliance;
      }
      
      public abstract void produce();
      
}
