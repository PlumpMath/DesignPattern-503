
public class PcFactory implements ComputerFactory {

    @Override
    public CPU createCPU() {
        System.out.println("CPU over!");
        return new PcCPU();
    }

    @Override
    public RAM createRAM() {
        System.out.println("RAM over!");
        return new MacRAM();
    }

}
