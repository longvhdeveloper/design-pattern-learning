public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(new Monitor());
        computer1.display();

        Computer computer2 = new Computer(new Projector());
        computer2.display();
    }
}
