package New;

public class Pattern6 {
	public static void star(int num) {
		int mid = num/2+1;
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				if(i == mid && j == mid) {
					System.out.print("#");
				}
				else if (i== mid || j==mid) {
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				} 
			}
			System.out.println();
		}	
	}
	public static void main(String[] agrs) {
		star(5);
	}

}

