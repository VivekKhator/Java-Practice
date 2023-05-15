package Input;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        /* Method-1 */
        Scanner sc = new Scanner(System.in);

        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.println("Short: ");
        short s = sc.nextShort();
        System.out.println("Percentages: ");
        float percentage = sc.nextFloat();
        System.out.println("mobile No: ");
        Long mobileNo = sc.nextLong();
        System.out.println("name: ");
        String name = sc.nextLine();
        System.out.println("Description: ");
        String description = sc.nextLine();

        System.out.println("Number: "+number);
        System.out.println("Short: "+s);
        System.out.println("Percentages: "+percentage);
        System.out.println("mobile No: "+mobileNo);
        System.out.println("name: "+name);
        System.out.println("Description: "+description);
    }
}
