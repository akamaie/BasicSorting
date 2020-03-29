import java.util.Arrays;

public class Main {
	
	//method to find the smallest element
	public static int smallest(int[] array) {
		int n = array[0];
		for(int i = 1; i < array.length; i++) {
				if(n > array[i]) {
					n = array[i];
				} 
		}
		return n;
	}
	
	//method to find the index of smallest element
	public static int indexOfTheSmallest(int[] array) {
		int count = 0;
		int i = 0;
		while(array[i] != smallest(array)) {
			count++;
			i++;
			
		}
		return count;
	}
	
	//method to find the index of the smallest element starting from a certain point
	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		int n = array[index];
		for(int i = index; i < array.length; i++) {
			if(n > array[i]) {
				n = array[i];
			}
		}
		
		int count = 0;
		int j = 0;
		while(array[j] != n) {
			count++;
			j++;
		}
		return count;
		
	}
	
	//method to swap two given elements in an array
	public static void swap(int[] array, int index1, int index2) {
		int n = array[index1];
		array[index1] = array[index2];
		array[index2] = n;
	}
	
	//Basic sorting(selection sort) using the created methods
	public static void sort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			swap(array, i, indexOfTheSmallestStartingFrom(array, i) );
			System.out.println(Arrays.toString(array));

		}
	}
	
	
	public static void main(String args[]) {
		
		int[] values = {8, 3, 7, 9, 1, 2, 4};
		System.out.println(Arrays.toString(values));
		sort(values);
		  
	}
}
