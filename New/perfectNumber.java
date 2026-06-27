package New;
public class perfectNumber {
	public static boolean PerfectNumber(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {

        if (PerfectNumber(28)) {
            System.out.println("28 is a Perfect Number");
        } else {
            System.out.println("28 is not a Perfect Number");
        }

    }
}
