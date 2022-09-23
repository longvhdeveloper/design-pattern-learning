public class Main {
    public static void main(String[] args) {
        Client client = new Client(new FirstService());
        client.process("hello world");

        client.setService(new SecondService());
        client.process("good bye");
    }
}
