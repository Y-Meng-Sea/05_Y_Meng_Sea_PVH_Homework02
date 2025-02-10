public class CheckingAccount implements Account {
    private String userName = null;
    private String userAge = null;
    private String userGender = null;
    private String userPhoneNumber = null;
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
            System.out.println("Transfer successfully");
        }
    }

    @Override
    public void transfer(double amount, Account targetAccount) {
        if(amount > balance){
            System.out.println("Cannot Transfer.");
        }else {
            this.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Tranfer successfully");
            System.out.println("Total balance: " + balance);
        }
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Checking Account Info:");
        System.out.println("Name: " + this.userName);
        System.out.println("Age: " + this.userAge);
        System.out.println("Gender: " + this.userGender);
        System.out.println("Phone: " + this.userPhoneNumber);
        System.out.println("Balance: " + this.balance);
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
