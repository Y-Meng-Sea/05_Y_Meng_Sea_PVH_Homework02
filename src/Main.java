import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utility util = new Utility();
        Scanner scanner = new Scanner(System.in);
        int option;
        CheckingAccount checkingAcc = new CheckingAccount();
        SavingAccount savingAccount = new SavingAccount();
        while (true){
            while (true){
                util.menu();
                System.out.print("=> Choose option(1-7) : ");
                String input = scanner.nextLine();
                boolean validOption = input.matches("[1-7]");
                if (validOption){
                    option = Integer.parseInt(input);
                    break;
                }
                System.out.println("Invalid Option");
            }
            if (option == 7){
                break;
            }
            switch (option){
                case 1 :
                    String useroption;
                    while (true){
                        System.out.println("\n>>>>>>>>>>>>>>>>>>>> Create Account <<<<<<<<<<<<<<<<<<<<");
                        System.out.println("1. Checking Account ");
                        System.out.println("2. Saving Account ");
                        System.out.println("3. Back Account ");
                        System.out.println("==============================================================");
                        System.out.print("=> chose an option: ");
                        useroption = scanner.nextLine();
                        if(useroption.matches("^[1-3]$")){
                            break;
                        }
                        System.out.println("invalid option");
                    }
                    if (useroption.equals("1")){
                        System.out.println("Creating Checking account");
                        // ask for name
                        String userName = util.userName();
                        String userAge = util.userAge();
                        String userGender = util.userGender();
                        String userPhoneNum = util.phoneNumber();
                        checkingAcc.setUserName(userName);
                        checkingAcc.setUserAge(userAge);
                        checkingAcc.setUserGender(userGender);
                        checkingAcc.setUserGender(userPhoneNum);
                        System.out.println("Creating account successfully!");
                    } else if (useroption.equals("2")) {
                        System.out.println("Creating Saving account");
                        // ask for name
                        String userName = util.userName();
                        String userAge = util.userAge();
                        String userGender = util.userGender();
                        String userPhoneNum = util.phoneNumber();

                        savingAccount.setUserName(userName);
                        savingAccount.setUserAge(userAge);
                        savingAccount.setUserGender(userGender);
                        savingAccount.setUserGender(userPhoneNum);
                        System.out.println("Creating account successfully!");
                    } else if (useroption.equals("3")) {
                        break;
                    }

                    break;
                case 2:
                    while (true){
                        System.out.println("\n>>>>>>>>>>>>>>>>>>>> Deposit Money <<<<<<<<<<<<<<<<<<<<");
                        System.out.println("1. Checking Account ");
                        System.out.println("2. Saving Account ");
                        System.out.println("3. Back Account ");
                        System.out.println("==============================================================");
                        System.out.print("=> chose an option: ");
                        useroption = scanner.nextLine();
                        if(useroption.matches("^[1-3]$")){
                            break;
                        }
                        System.out.println("invalid option");
                    }
                    if (useroption.equals("1")){
                        String depositAmount;
                        while (true){
                            System.out.print("Enter money to deposit: ");
                            depositAmount = scanner.nextLine();
                            if (depositAmount.matches("^\\d+(\\.\\d+)?$")){
                                break;
                            }
                            System.out.println("Not a number");
                        }
                        double toDouble = Double.parseDouble(depositAmount);
                        checkingAcc.deposit(toDouble);
                        System.out.println("Balance to deposit: " + toDouble);
                        System.out.println("Total balance: " + checkingAcc.getBalance());

                    } else if (useroption.equals("2")) {
                        String depositAmount;
                        while (true){
                            System.out.print("Enter money to deposit: ");
                            depositAmount = scanner.nextLine();
                            if (depositAmount.matches("^\\d+(\\.\\d+)?$")){
                                break;
                            }
                            System.out.println("Not a number");
                        }
                        double toDouble = Double.parseDouble(depositAmount);
                        savingAccount.deposit(toDouble);
                        System.out.println("Balance to deposit: " + toDouble);
                        System.out.println("Total balance: " + savingAccount.getBalance());
                    } else if (useroption.equals("3")) {
                        break;
                    }

                    break;
                case 3:
                    while (true){
                        System.out.println("\n>>>>>>>>>>>>>>>>>>>> Withdraw Money <<<<<<<<<<<<<<<<<<<<");
                        System.out.println("1. Checking Account ");
                        System.out.println("2. Saving Account ");
                        System.out.println("3. Back Account ");
                        System.out.println("==============================================================");
                        System.out.print("=> chose an option: ");
                        useroption = scanner.nextLine();
                        if(useroption.matches("^[1-3]$")){
                            break;
                        }
                        System.out.println("invalid option");
                    }
                    if (useroption.equals("1")){
                        String withdrawAmount;
                        while (true){
                            System.out.print("Enter money to deposit: ");
                            withdrawAmount = scanner.nextLine();
                            if (withdrawAmount.matches("^\\d+(\\.\\d+)?$")){
                                break;
                            }
                            System.out.println("Not a number");
                        }
                        double toDouble = Double.parseDouble(withdrawAmount);
                        checkingAcc.withdraw(toDouble);
                        System.out.println("Balance to withdraw: " + toDouble);
                        System.out.println("Total balance: " + checkingAcc.getBalance());

                    } else if (useroption.equals("2")) {
                        String withdrawAmount;
                        while (true){
                            System.out.print("Enter money to deposit: ");
                            withdrawAmount = scanner.nextLine();
                            if (withdrawAmount.matches("^\\d+(\\.\\d+)?$")){
                                break;
                            }
                            System.out.println("Not a number");
                        }
                        double toDouble = Double.parseDouble(withdrawAmount);
                        savingAccount.withdraw(toDouble);
                        System.out.println("Balance to withdraw: " + toDouble);
                        System.out.println("Total balance: " + savingAccount.getBalance());
                    } else if (useroption.equals("3")) {
                        break;
                    }
                    break;
                case 4:
                    util.bankMenu("Transfer Money");
                    System.out.println("Enter to continue");
                    System.console().readLine();
                    break;
                case 5:
                    util.bankMenu("Display Account Information");
                    System.out.println("Enter to continue");
                    System.console().readLine();
                    break;
                case 6:
                    util.bankMenu("Delete Account");
                    System.out.println("Enter to continue");
                    System.console().readLine();
                    break;
                case 7:
                    System.out.println("Thank you for using");
                    break;
            }
        }

    }
}