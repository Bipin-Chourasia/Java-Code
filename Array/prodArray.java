package Array;

import java.util.Scanner;
public class prodArray {
	public static void main(String[] args) {
		int arr[]= {10, 20, 30, 40};
		int res= prodArray(arr);
		System.out.println(res);
	}
	public static int prodArray(int[] arr) {
		if (arr.length<=1)
			return 0;
		
		int prod=1;
		for(int i=1; i<arr.length; i+=2)
			if(i%2!=0)
				prod*=arr[i];
				
		
		return prod;
	}
}
