package DZ5.MVP;

import java.util.Scanner;

public class UserView {
    private Scanner sc;

    public UserView() {
        this.sc = new Scanner(System.in);
    }

    public String askNewAcc() {
        System.out.print("Press y, if u new user. Press anything else if u already have an acc: , or print stop to stop: ");
        return sc.nextLine();

    }

    public void successfulEnter() {
        System.out.println("U entered");
    }

    public void failedEnter() {
        System.out.println("Wrong login or password");
    }

    public String enter() {
        String result;
        System.out.print("Enter login: ");
        result = sc.nextLine() + " ";
        System.out.println();
        System.out.print("Enter password: ");
        result += sc.nextLine();
        System.out.println();
        return result;
    }

    public String[] register() {
        String result[] = new String[3];
        System.out.print("Enter u name: ");
        //result = sc.nextLine() + " ";
        result[0] = sc.nextLine();
        System.out.print("Login: ");
        //result = sc.nextLine() + " ";
        result[1] = sc.nextLine();
        System.out.print("Enter password: ");
        //result += sc.nextLine();
        result[2] = sc.nextLine();
        return result;

    }
}
