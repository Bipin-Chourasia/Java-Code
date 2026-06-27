package New;

public class hexadecimalConversion {
	public static void HexadecimalConversion(int num) {
		String bin = "";
		while(num!=0) {
			int ld =num % 16;
			if(num<10)
			bin = bin + ld;
			else {
				bin = (char)(ld+55)+bin;
			}
			num = num /16;
		}
		
		System.out.println(bin);
	}
	public static void main(String [] args) {
		HexadecimalConversion(15);
	}
}

