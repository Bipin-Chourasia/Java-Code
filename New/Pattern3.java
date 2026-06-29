package New;

public class Pattern3 {
	public static void star(int n) {
		for(int i=1; i<=2*n-1; i++) {
			int num;
			if(i<=n)
				num=i;
			else
				num=2*n-i;
			for(int j=1; j<=num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
}

	public static void main(String[] agrs) {
		star(4);
	}
}
