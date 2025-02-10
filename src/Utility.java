import java.util.Scanner;

public class Utility {
    static boolean validString(String input){
        return input.matches("^(?!\\s*$)[A-Za-z\\s]+$");
    }

    Scanner scanner = new Scanner(System.in);
    public void menu(){
        System.out.println("================== Online Bank System ==================");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Transfer Money");
        System.out.println("5. Display Account Information");
        System.out.println("6. Delete Account");
        System.out.println("7. Exit");
        System.out.println("-----------------------------------------");
    }

    public String userName(){
        String userName;
        while (true){
            System.out.print("Enter User Name: ");
            userName = scanner.nextLine();
            if (validString(userName)){
                break ;
            }
            System.out.println("Name is allowed only A-Z and a-z !");
        }
        return userName;
    }

    public String userAge(){
        String userBirthdate;
        while (true){
            System.out.print("Year of Birth(dd-mm-yyyy): ");
            userBirthdate = scanner.nextLine();
            if (userBirthdate.matches("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$")){
                break;
            }
            System.out.println("Wrong format date!!");
        }
        return userBirthdate;
    }

    public String userGender(){
        String gender;
        while (true){
            System.out.print("Enter your gender(Male/Female): ");
            gender = scanner.nextLine();
            if(gender.toLowerCase().equals("female") || gender.toLowerCase().equals("male")){
                break;
            }
            System.out.println("We do not support Non-binary gender");
        }
        return gender;
    }

    public String phoneNumber(){
        String phoneNumber;
        while (true){
            System.out.print("Phone Number(9 digit): ");
            phoneNumber = scanner.nextLine();
            if (phoneNumber.matches("^[0-9]{8,11}$")){
                break;
            }
            System.out.println("Invalid phone number");
        }
        return phoneNumber;
    }
}
