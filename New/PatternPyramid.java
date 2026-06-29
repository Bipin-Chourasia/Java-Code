package New;

public class PatternPyramid {
	public static void star(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if(i+j>=n+1 && j-i<=n-1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}	
	}
	public static void main(String[] agrs) {
		star(7);
	}
}
