import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = ((scanner.nextLine()).charAt(0));
        switch(ch){
            case 'A' :
            case 'a' :
                System.out.println("It is vowel");
                break;
            case 'E' :
            case 'e' :
                System.out.println("It is vowel");
                break;
            case 'I' :
            case 'i' :
                System.out.println("It is vowel");
                break;
            case 'O' :
            case 'o' :
                System.out.println("It is vowel");
                break;
            case 'U' :
            case 'u' :
                System.out.println("It is vowel");
                break;
            default:
                System.out.println("It is consonant");
        }
    }
}
