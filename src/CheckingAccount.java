public class CheckingAccount implements Account {
    private String userName;
    private String userAge;
    private String userGender;
    private String userPhoneNumber;

    @Override
    public double deposit(double amount) {
        return 0;
    }

    @Override
    public double withdraw(double amount) {
        return 0;
    }

    @Override
    public double transfer(double amount, Account targetAccount) {
        return 0;
    }

    @Override
    public void displayAccountInfo() {

    }
}
