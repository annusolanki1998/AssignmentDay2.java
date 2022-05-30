import java.util.Scanner;

public class ReverseWhileLoop {
    public static void main(String[] args) {
        int reminder, reverse=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        while(number!=0)
        {
            reminder=number%10;
            number=number/10;
            reverse=(reverse*10)+reminder;
        }
        System.out.println("Reverse of a given number is:" +reverse);

    }
}
