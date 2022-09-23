public class SecondService implements Service{
    @Override
    public void write(String message) {
        System.out.printf("Second Service: %s%n", message);
    }
}
