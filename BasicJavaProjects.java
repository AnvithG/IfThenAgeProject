import java.util.Scanner;
public class BasicJavaProjects {
    public static void main(String[] args) {
        // 60 above senior citizen
        //40 above adult
        //11 above teen age
        int age1;
        System.out.println("Enter your age sir/ma'am :  ");
        Scanner sc = new Scanner(System.in);
        age1 = sc.nextInt();
        if (age1 > 60) {
            System.out.println("you are a senior citizen");
        } else if (age1 > 40) {
            System.out.println("you are an adult");
        } else if (age1 > 11) {

            System.out.println("you are a teen");
        } else {
            System.out.println("you belong to none of the above category");
        }
    }
}

//if (condition1) {
// block of code to be executed if condition1 is true
//      } else if (condition2) {
// block of code to be executed if the condition1 is false and condition2 is true
//    } else {
// block of code to be executed if the condition1 is false and condition2 is false
//  }

