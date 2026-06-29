package New;

public class Pattern_abc {
	public static void abc(int n) {
		for(int i=1; i<=n; i++) {
			char ch=(char)('a'+(i-1)*4);
			for(int j=1; j<=i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}	
	}
	public static void main(String[] agrs) {
		abc(4);
	}

}
