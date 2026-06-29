package New;

public class PatternTriangle {
	public static void star(int n) {
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	public static void main(String[] agrs) {
		star(4);
	}
}

