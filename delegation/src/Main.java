public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(new RealPrinter());
        printer.print();
    }
}
