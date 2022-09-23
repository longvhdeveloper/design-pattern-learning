public class Client {
    private Service service;

    public Client(Service service) {
        this.service = service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void process(final String message) {
        service.write(message);
    }
}
