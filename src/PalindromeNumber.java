import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int remainder, reverse=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int b = number;
        for( ;number != 0; number=number/10) {
            remainder = number%10;
            reverse = (reverse*10)+remainder;
        }
        if(b==reverse)
            System.out.println("It is Palindrome Number");
        else
            System.out.println("It is not a Palindrome Number");

    }
}
