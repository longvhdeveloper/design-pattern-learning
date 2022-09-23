public class PasswordReminder {
    private final DbConnection dbConnection;

    public PasswordReminder(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void remainder() {
        dbConnection.connect();
    }
}
