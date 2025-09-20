package computer;

public class Computer {
    private RAMMemory ram;
    private Processor processor;

    public Computer(RAMMemory ram, Processor processor) {
        this.processor = processor;
        this.ram = ram;
    }

    public RAMMemory getRam() {
        return ram;
    }

    public void setRam(RAMMemory ram) {
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void showDetails() {
        System.out.println("======= Detalhes do computador =======");
        System.out.println(
                "Mémoria RAM: "+getRam().getGBs()+"\n"+
                "Tipo de Mémoria RAM: "+getRam().getType()
        );
        System.out.println(
                "Marca do processador: " + getProcessor().getBrand() + "\n" +
                "MHz do processador: " + getProcessor().getHz()
        );
    }
}
