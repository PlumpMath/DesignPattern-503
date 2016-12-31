
public class client {
      public static void main(String[] args) {
            Appliance appliance;
            Manufacturer manufacturer;
            
            appliance= (Appliance)XMLUtil.getBean("appliance");
            manufacturer = (Manufacturer)XMLUtil.getBean("manufacturer");
            
            manufacturer.setAppliance(appliance);
            manufacturer.produce();
      }
}
