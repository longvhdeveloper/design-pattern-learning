import java.util.Date;

public class Employee {
    private final int id;
    private final String name;
    private final String address;
    private final Date dateOfJoining;

    public Employee(int id, String name, String address, Date dateOfJoining) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }
}
