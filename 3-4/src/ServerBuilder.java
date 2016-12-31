public class ServerBuilder extends ComputerBuilder{

      @Override
      public void buildCpu() {
            computer.setCpu("服务器CPU");
      }

      @Override
      public void buildRam() {
            computer.setRam("服务器RAM");
      }

      @Override
      public void buildHarddisk() {
            computer.setHarddisk("服务器硬盘");
      }

      @Override
      public void buildMainframe() {
            computer.setMainframe("服务器主机");
      }

      @Override
      public void buildMonitor() {
            computer.setMonitor("服务器显示器");
      }
      
}
