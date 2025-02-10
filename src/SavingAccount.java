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
        double minBalance =0.2;
        if (balance - amount <minBalance) {
            System.out.println("Cannot withdraw. it must be 20% remaining in saving account");
        } else {
            balance -= amount;
        }
    }


    @Override
    public void transfer(double amount, Account targetAccount) {
        double minBalance = 0.2;
        if(balance - amount < minBalance){
            System.out.println("Cannot transfer. it must be 20% remaining in saving account");
        }else {
            this.withdraw(amount);
            targetAccount.deposit(amount);
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
