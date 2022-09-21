public class Printer {
    // the "delegator"
    private final RealPrinter printer;

    public Printer(RealPrinter printer) {
        this.printer = printer;
    }

    public void print() {
        printer.print();
    }
}
