
public class client {

    public static void main(String[] args) {
    	try
        {
    		ComputerFactory factory ;
            CPU cpu;
            RAM ram;
        	factory=(PcFactory)XMLUtil.getBean();
        	cpu=factory.createCPU();
        	cpu.create();
        	ram=factory.createRAM();
        	ram.create();
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
    	
    	
    	
    }

}
