import java.util.Scanner;

class Prime {
    void checkPrime(int n) {
        if (n <= 1) { // 0 and 1 are not prime numbers
            System.out.println("\n" + n + " is not a prime number.");
            return;
        }

        for (int i = 2; i * i <= n; i++) { // Loop until sqrt(n)
            if (n % i == 0) {
                System.out.println("\n" + n + " is not a prime number.");
                return;
            }
        }
        System.out.println("\n" + n + " is a prime number.");
    }
}

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number to check: ");
        int n = sc.nextInt();
        
        Prime p = new Prime();
        p.checkPrime(n);
        
        sc.close();
    }
}
