public class MySqlConnection implements DbConnection{
    @Override
    public void connect() {
        System.out.println("Connect MySQL Database");
    }
}
