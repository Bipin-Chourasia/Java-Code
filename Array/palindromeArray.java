package Array;

import java.util.Arrays;
import java.util.Scanner;

public class palindromeArray {
	public static void main(String[] arg) {
		int[] arr= {10, 20, 30, 20, 10};
		System.out.println(isPalindrome(arr));
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static boolean isPalindrome(int[] arr) {
		int i = 0;
		int j= arr.length-1;
		while(i<j) {
			if(arr[i] !=arr[j])
				return false;
			i++; j--;
		}
		return true;
	}


}
