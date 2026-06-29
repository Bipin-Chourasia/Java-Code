package New;

public class Pattern2 {
	public static void star(int n) {
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				if(r==1 || c==1 || c==n || r==n)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}	
	}
	public static void main(String[] agrs) {
		star(4);
	}
}

