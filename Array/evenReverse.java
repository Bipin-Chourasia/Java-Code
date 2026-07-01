package Array;

import java.util.Arrays;
import java.util.Scanner;

public class evenReverse {
	public static void evenIndexReverse(int[] arr) {
	
	int start = 0;
	int end;
	if (arr.length % 2 == 0){
		end =arr.length - 2;
	}else {
			end = arr.length - 1;
		}
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start+=2;
			end-=2;
			}
		System.out.println(Arrays.toString(arr));
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size=s.nextInt();
		int [] arr= new int [size];
		System.out.println("Enter the array elements: ");
		for(int i=0; i<size; i++) {
			
			arr[i]=s.nextInt();
			
		}
		evenIndexReverse(arr);
	}
}
