
abstract class ComputerBuilder {
      protected Computer computer =  new Computer();
      
      public abstract void buildCpu();
      public abstract void buildRam();
      public abstract void buildHarddisk();
      public abstract void buildMainframe();
      public abstract void buildMonitor();
      public Computer produceComputer(){
            return computer;
      }
      
}
