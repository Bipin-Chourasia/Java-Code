package New;

public class Pattern4 {
	public static void star(int n) {
		for(int i=n; i>=1; i--) {
			char ch='a';
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1);j++) {
				System.out.print(ch++ +"");
			}
			System.out.println();
		}
	}
	public static void main(String[] agrs) {
		star(4);
	}

}
