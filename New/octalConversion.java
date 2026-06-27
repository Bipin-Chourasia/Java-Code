package New;

public class octalConversion {
	public static void OctalConversion(int num) {
		String bin = "";
		while(num!=0) {
			int ld =num % 8;
			bin = bin + ld;
			num = num /8;
		}
		
		System.out.println(bin);
	}
	public static void main(String [] args) {
		OctalConversion(125);
	}
}

