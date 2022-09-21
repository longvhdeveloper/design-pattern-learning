public class Computer {
    private final DisplayModule displayModule;

    public Computer(DisplayModule displayModule) {
        this.displayModule = displayModule;
    }

    public void display() {
        this.displayModule.display();
    }
}
