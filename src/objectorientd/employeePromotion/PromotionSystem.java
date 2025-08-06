package objectorientd.employeePromotion;
import java.util.Scanner;
public class PromotionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        int count = 0;

        while (count < 5) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Designation (Junior/Mid/Senior): ");
            String desig = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees[count++] = new Employee(id, name, desig, salary);
        }

        System.out.println("\n--- After Promotion ---");
        for (int i = 0; i < count; i++) {
            employees[i].promote();
            employees[i].showInfo();
        }

        sc.close();
    }
}
