package New;

public class printFactor {
	public static void PrintFactor(int num) {
		
		for(int i =1; i<=num;i++) {
			if(num%i==0){
		System.out.println("the factor is:" + i);
	}
		}
	}
	public static void main(String[] args) {
		PrintFactor(45);
	}

}
 