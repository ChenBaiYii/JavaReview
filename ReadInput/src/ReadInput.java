import java.awt.*;
import java.util.Scanner;


public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string: ");
        String result = scanner.nextLine();
        System.out.println("you input: " + result);
    }

}
