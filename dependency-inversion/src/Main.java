public class Main {
    public static void main(String[] args) {
        final PasswordReminder passwordReminder = new PasswordReminder(new MySqlConnection());
        passwordReminder.remainder();
    }
}
