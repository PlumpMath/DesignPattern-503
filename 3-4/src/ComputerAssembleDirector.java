
public class ComputerAssembleDirector {
      
      private ComputerBuilder cb;
      
      public void setComputerBuilder(ComputerBuilder cb){
            this.cb = cb;
      }
      
      public Computer assemble(){
            cb.buildCpu();
            cb.buildRam();
            cb.buildHarddisk();
            cb.buildMainframe();
            cb.buildMonitor();
            return cb.produceComputer();
      }
      
}
