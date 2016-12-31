
public class DesktopBuilder extends ComputerBuilder{

      @Override
      public void buildCpu() {
            computer.setCpu("台式机CPU");
      }

      @Override
      public void buildRam() {
            computer.setRam("台式机RAM");
      }

      @Override
      public void buildHarddisk() {
            computer.setHarddisk("台式机硬盘");
      }

      @Override
      public void buildMainframe() {
            computer.setMainframe("台式机主机");
      }

      @Override
      public void buildMonitor() {
            computer.setMonitor("台式机显示器");
      }
      
}
