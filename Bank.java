//wap in java to implement user menu driven student payment system
import java.util.*;
class University {
    String University_name = "Adamas University";
}
class Dept extends University {
    String Dept_ID = "CSE";
}
class Student extends Dept {
    Scanner sc = new Scanner(System.in);
    String Stu_ID = "UG/02/BTCSE/2023/132";
    String name = "Bipin Chourasia";
    String pass = "Bipin@1234";
    int semester = 4;
    double semester_fees_due_records[]={0,0,0,90000,90000,90000,90000,90000};
    double feesDue =semester_fees_due_records[semester-1];
    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + Stu_ID);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
        System.out.println("Fees Due: " + feesDue);
    }
    // Method to process the fee payment
    public void payFees() {
        if (feesDue <= 0) {
            System.out.println("No dues.");
        } else {
            System.out.print("Enter amount to pay: ");
            double amount = sc.nextDouble();
            if(amount <= feesDue) {
                feesDue -= amount;
                System.out.println("Payment of " + amount + " successful!");
                System.out.println("Remaining Fees Due: " + feesDue);
            } else {
                System.out.println("Excess Amount.");
            }
        }
    }
    // Method for login
    public boolean validateLogin(String inputStuID, String inputPass) {
        return inputStuID.equals(Stu_ID) && inputPass.equals(pass);
    }
}
public class Bank extends Student {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bank bank = new Bank();
        // Student login section
        String inputStuID, inputPass;
        boolean loggedIn = false;
        System.out.println("Welcome to Payment Gateway of " + bank.University_name);
        while (!loggedIn) {
            System.out.print("Enter Student ID: ");
            inputStuID = in.next();
            System.out.print("Enter Password: ");
            inputPass = in.next();
            // Validate login credentials
            if (bank.validateLogin(inputStuID, inputPass)) {
                System.out.println("Login successful!");
                loggedIn = true;
            } else {
                System.out.println("Invalid Student ID or Password. Please try again.");
            }
        }
        // Menu system after successful login
        int choice;
        do {
            System.out.println("\n---- Menu ----");
            System.out.println("1. View Student Details");
            System.out.println("2. Pay Fees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    // Display student details
                    bank.displayStudentDetails();
                    break;
                case 2:
                    // Pay fees
                    bank.payFees();
                    break;
                case 3:
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        in.close();
    }
}