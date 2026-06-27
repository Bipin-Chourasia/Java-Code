package New;

public class swapHalf {
	public static int countDigits(int num){
		int count = 0;
		while(num!=0){
			count++;
			num = num/10;
		}
		return count;
	}
	public static int powerDigits(int base, int expo) {
		int res =1;
		while(expo>0) {
			res = res * base;
			expo --;
		}
		return res;
	}
	public static void halfDigit(int num) {
		int count = countDigits(num);
		int expo = count/2;
		int fh = num/powerDigits(10,expo);
		int lh = num%powerDigits(10, expo);
		
		System.out.println(lh+""+fh);
		
	}
	public static void main(String [] args) {
		halfDigit(472138);
	}
	

}
