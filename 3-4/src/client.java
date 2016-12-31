
public class client {

      public static void main(String[] args) {
            ComputerBuilder cb = (ComputerBuilder)XMLUtil.getBean();
            ComputerAssembleDirector director = new ComputerAssembleDirector();
            director.setComputerBuilder(cb);
            Computer computer = director.assemble();
            
            System.out.println("Computer组成：");
            System.out.println(computer.getCpu());
            System.out.println(computer.getRam());
            System.out.println(computer.getHarddisk());
            System.out.println(computer.getMainframe());
            System.out.println(computer.getMonitor());
      }
}
