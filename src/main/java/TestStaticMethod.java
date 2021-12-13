import java.util.Scanner;

public class TestStaticMethod {
    static String input;

    public static void main(String[] args) {
        scanInput();
        System.out.println(input + " printed by main");

        changeInput();
        System.out.println("input " + input);
    }

    public static void scanInput () {
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        System.out.println(input);
    }

    public static void changeInput() {
        input = "changed";
    }

}
