import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int remainder, reverse=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        for( ;number != 0; number=number/10) {
            remainder = number%10;
            reverse = (reverse*10)+remainder;
        }
        System.out.println("Reverse of given number is: " +reverse);

    }
}
