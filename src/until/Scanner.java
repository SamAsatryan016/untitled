package until;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("1");

        int number1 = scanner.nextInt();

        System.out.println("2");

        int number2 = scanner.nextInt();

        int result = number1 + number2;

        System.out.println("havasar e " + result);

    }
}

