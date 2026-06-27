package New;

public class binaryConversion {
	public static void BinaryConversion(int num) {
		String bin = "";
		while(num!=0) {
			int ld =num % 2;
			bin = bin + ld;
			num = num /2;
		}
		
		System.out.println(bin);
	}
	public static void main(String [] args) {
		BinaryConversion(5);
	}
}
