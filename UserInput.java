import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type any number");
        int a = sc.nextInt();
        System.out.println("Please type any number to add the above number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of these numbers is : " + sum);
    }
}
