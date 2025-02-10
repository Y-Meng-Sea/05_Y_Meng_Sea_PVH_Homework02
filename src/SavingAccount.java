public class SavingAccount implements Account {
    private String userName;
    private String userAge;
    private String userGender;
    private String userPhoneNumber;
    private double balance = 0;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Cannot withdraw.");
        } else {
            balance -= amount;
        }
    }


    @Override
    public void transfer(double amount, Account targetAccount) {
        if(amount > balance){
            System.out.println("Cannot Transfer.");
        }else {
            this.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Transfer successfully");
            System.out.println("Total balance remaining: " + this.balance);
        }
    }

    @Override
    public void displayAccountInfo() {

    }

    // setter and getter method

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
