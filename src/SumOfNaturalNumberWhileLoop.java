import java.util.Scanner;

public class SumOfNaturalNumberWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        System.out.println("Sum from: ");
        int i = scanner.nextInt();
        System.out.println("Sum Upto: ");
        int number = scanner.nextInt();
        while(i<=number){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of all natural number is: " +sum);

    }
}
