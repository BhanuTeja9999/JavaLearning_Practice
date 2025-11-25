package pack1;
import java.util.Scanner;

public class Task23 {

    boolean greeting(String name) {
        System.out.println("Hey, " + name + "! How do you do?");
        System.out.println(ask());  // Removed unnecessary new Task23()
        return true;
    }

    int ask() {
        System.out.println("What do you want?\nDo you want to check balance?");
        Scanner s = new Scanner(System.in);
        String st = s.next();
        int result = 0;

        if (st.equalsIgnoreCase("yes")) {
            result = money(55, 100);  // Use existing method
        }

        s.close();  // Always close the Scanner
        return result;
    }

    int money(int cash, int online) {
        System.out.println(wait("true"));  // No need to use new Task23()
        return cash + online;
    }

    String wait(String s) {
        if (s.equals("true")) {
            return "Wait..........";
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Welcome.....");
        boolean t = new Task23().greeting("Bhanu");
        System.out.println("Balance: " + t);
    }
}

