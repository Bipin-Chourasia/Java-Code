package New;

public class PatternRectangle {
	public static void star(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*n-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	public static void main(String[] agrs) {
		star(4);
	}

}
