import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utility util = new Utility();
        int option;
        while (true){
            while (true){
                util.menu();
                System.out.print("=> Choose option(1-7) : ");
                Scanner scanner = new Scanner(System.in);
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
                    util.bankMenu("Creating Account");
                    System.out.println("Enter to continue");
                    System.console().readLine();
                    break;
                case 2:
                    util.bankMenu("Deposit Money");
                    System.out.println("Enter to continue");
                    System.console().readLine();
                    break;
                case 3:
                    util.bankMenu("Withdraw Money");
                    System.out.println("Enter to continue");
                    System.console().readLine();
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