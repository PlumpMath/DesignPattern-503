
class NotebookBuilder extends ComputerBuilder{
      
      @Override
      public void buildCpu(){
            computer.setCpu("笔记本CPU");
      }
      
      @Override
      public void buildRam(){
            computer.setRam("笔记本RAM");
      }
      
      @Override
      public void buildHarddisk(){
            computer.setHarddisk("笔记本硬盘");
      }
      
      @Override
      public void buildMainframe() {
            computer.setMainframe("笔记本主机");
      }
      
      @Override
      public void buildMonitor(){
            computer.setMonitor("笔记本显示器");
      }
      
}
