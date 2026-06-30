package Array;

import java.util.Arrays;
import java.util.Scanner;
public class reverseArray {
	public static void main(String[] arg) {
		int[] arr= {10, 20, 30, 40, 50};
		reverse(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverse(int[] arr) {
		int[] arr2= new int [arr.length];
		int i = arr.length-1;
		// System.out.println(i);
		for(int j=0; j<arr2.length; j++) {
			arr2[j]= arr[i];
			i--;
		}
		System.out.println(Arrays.toString(arr2));
	}

}
