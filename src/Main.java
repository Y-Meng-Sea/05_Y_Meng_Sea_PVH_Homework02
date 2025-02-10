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
                        System.out.println("\t\t\t\t Checking Account ");
                        System.out.println("Received    : \t\t\t" + "$ "+toDouble);
                        System.out.println("Total amount: \t\t\t" + "$ "+checkingAcc.getBalance());
                        System.out.println("==============================================================");
                        System.out.println("\n Deposit Successful");

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
                        System.out.println("\t\t\t\t Checking Account ");
                        System.out.println("Received    : \t\t\t" + "$ "+toDouble);
                        System.out.println("Total amount: \t\t\t" + "$ "+savingAccount.getBalance());
                        System.out.println("==============================================================");
                        System.out.println("\n Deposit Successful");
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
                            System.out.print("Enter money to withdrew: ");
                            withdrawAmount = scanner.nextLine();
                            if (withdrawAmount.matches("^\\d+(\\.\\d+)?$")){
                                break;
                            }
                            System.out.println("Not a number");
                        }
                        double toDouble = Double.parseDouble(withdrawAmount);
                        checkingAcc.withdraw(toDouble);
                        System.out.println("\t\t\t\t Checking Account ");
                        System.out.println("Withdrew    : \t\t\t" + "$ "+toDouble);
                        System.out.println("Total amount: \t\t\t" + "$ "+checkingAcc.getBalance());
                        System.out.println("==============================================================");
                        System.out.println("\n Withdrew Successful");

                    } else if (useroption.equals("2")) {
                        String withdrawAmount;
                        while (true){
                            System.out.print("Enter money to withdrew: ");
                            withdrawAmount = scanner.nextLine();
                            if (withdrawAmount.matches("^\\d+(\\.\\d+)?$")){
                                break;
                            }
                            System.out.println("Not a number");
                        }
                        double toDouble = Double.parseDouble(withdrawAmount);
                        savingAccount.withdraw(toDouble);
                        System.out.println("\t\t\t\t Saving Account ");
                        System.out.println("Withdrew    : \t\t\t" + "$ "+toDouble);
                        System.out.println("Total amount: \t\t\t" + "$ "+savingAccount.getBalance());
                        System.out.println("==============================================================");
                        System.out.println("\n Withdrew Successful");
                    } else if (useroption.equals("3")) {
                        break;
                    }
                    break;
                case 4:
                    while (true){
                        System.out.println("\n>>>>>>>>>>>>>>>>>>>> Transfer Money <<<<<<<<<<<<<<<<<<<<");
                        System.out.println("1. Checking Account -> Saving Account");
                        System.out.println("2. Saving Account -> Checking Account");
                        System.out.println("3. Back ");
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
                            System.out.print("Enter money to withdrew: ");
                            withdrawAmount = scanner.nextLine();
                            if (withdrawAmount.matches("^\\d+(\\.\\d+)?$")){
                                break;
                            }
                            System.out.println("Not a number");
                        }
                        double toDouble = Double.parseDouble(withdrawAmount);
                        checkingAcc.transfer(toDouble,savingAccount);
                        System.out.println(">>>>>>>>>>>>>>>>>>>>   Transfer Moneys   <<<<<<<<<<<<<<<<<<<<\n");
                        System.out.println("Transferred :                          :"+"$ "+toDouble);
                        System.out.println("From        :Checking Account with Name: " + checkingAcc.getUserName());
                        System.out.println("To          :Saving Account with Name  : "+ savingAccount.getUserName());
                        System.out.println("Total Remain:                          : "+"$ "+checkingAcc.getBalance());

                    } else if (useroption.equals("2")) {
                        String withdrawAmount;
                        while (true){
                            System.out.print("Enter money to withdrew: ");
                            withdrawAmount = scanner.nextLine();
                            if (withdrawAmount.matches("^\\d+(\\.\\d+)?$")){
                                break;
                            }
                            System.out.println("Not a number");
                        }
                        double toDouble = Double.parseDouble(withdrawAmount);
                        savingAccount.transfer(toDouble,checkingAcc);
                        System.out.println(">>>>>>>>>>>>>>>>>>>>   Transfer Moneys   <<<<<<<<<<<<<<<<<<<<\n");
                        System.out.println("Transferred :                          :"+"$ "+toDouble);
                        System.out.println("From        :Saving Account with Name  : "+ savingAccount.getUserName());
                        System.out.println("To          :Checking Account with Name: " + checkingAcc.getUserName());
                        System.out.println("Total Remain:                          : "+"$ "+savingAccount.getBalance());
                    } else if (useroption.equals("3")) {
                        break;
                    }
                    break;
                case 5:
                    while (true) {
                        System.out.println("\n>>>>>>>>>>>>>>>>>>>> Display Account Info <<<<<<<<<<<<<<<<<<<<");
                        System.out.println("1. Checking Account ");
                        System.out.println("2. Saving Account ");
                        System.out.println("3. Back ");
                        System.out.print("=> Choose an option: ");
                        useroption = scanner.nextLine();
                        if(useroption.matches("^[1-3]$")) {
                            if (useroption.equals("3")) break;
                            if (useroption.equals("1")) {
                                System.out.println("Checking Account Info:");
                                System.out.println("Name: " + checkingAcc.getUserName());
                                System.out.println("Age: " + checkingAcc.getUserAge());
                                System.out.println("Gender: " + checkingAcc.getUserGender());
                                System.out.println("Phone: " + checkingAcc.getUserPhoneNumber());
                                System.out.println("Balance: " + checkingAcc.getBalance());
                            } else {
                                System.out.println("Saving Account Info:");
                                System.out.println("Name: " + savingAccount.getUserName());
                                System.out.println("Age: " + savingAccount.getUserAge());
                                System.out.println("Gender: " + savingAccount.getUserGender());
                                System.out.println("Phone: " + savingAccount.getUserPhoneNumber());
                                System.out.println("Balance: " + savingAccount.getBalance());
                            }
                        } else {
                            System.out.println("Invalid option");
                        }
                    }
                    break;
                case 6:
                    while (true) {
                        System.out.println("\n>>>>>>>>>>>>>>>>>>>> Delete Account <<<<<<<<<<<<<<<<<<<<");
                        System.out.println("1. Checking Account ");
                        System.out.println("2. Saving Account ");
                        System.out.println("3. Back ");
                        System.out.print("=> Choose an option: ");
                        useroption = scanner.nextLine();
                        if(useroption.matches("^[1-3]$")) {
                            if (useroption.equals("3")) break;
                            if (useroption.equals("1")) {
                                checkingAcc.setUserName(null);
                                checkingAcc.setUserAge(null);
                                checkingAcc.setUserGender(null);
                                checkingAcc.setUserPhoneNumber(null);
                                checkingAcc.setBalance(0);
                                System.out.println("Checking account deleted.");
                            } else {
                                savingAccount.setUserName(null);
                                savingAccount.setUserAge(null);
                                savingAccount.setUserGender(null);
                                savingAccount.setUserPhoneNumber(null);
                                savingAccount.setBalance(0);
                                System.out.println("Saving account deleted.");
                            }
                        } else {
                            System.out.println("Invalid option");
                        }
                    }
                    break;
                case 7:
                    System.out.println("Thank you for using");
                    break;
            }
        }

    }
}