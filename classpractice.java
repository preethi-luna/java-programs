import java.util.Scanner;

public class classpractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = sc.nextLine();

        System.out.println("Enter the age:");
        int age = sc.nextInt();

        System.out.println("Enter the CGPA:");
        float cgpa = sc.nextFloat();

        System.out.println("Enter the gender:");
        char gender = sc.next().charAt(0);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Gender: " + gender);

        sc.close();
    }
}