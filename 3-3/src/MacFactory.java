
public class MacFactory implements ComputerFactory {

    @Override
    public CPU createCPU() {
        return  new MacCPU();
    }

    @Override
    public RAM createRAM() {
        return new MacRAM();
    }

}
