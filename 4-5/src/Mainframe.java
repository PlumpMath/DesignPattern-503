
public class Mainframe {
    private Memory memory;
    private CPU cpu;
    private OS  os;
    private HardDisk harddisk;
    
    public Mainframe(){
        memory = new Memory();
        cpu = new CPU();
        harddisk = new HardDisk();
        os = new OS();
    }
    
    public void on(){
        try{
            memory.check();
            cpu.run();
            harddisk.read();
            os.load();
        }catch(Exception e){
        }
    }

}
