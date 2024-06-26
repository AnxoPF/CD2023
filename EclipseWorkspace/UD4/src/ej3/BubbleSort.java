package ej3;

import java.util.Arrays;

class bubblesort { 
	
	public static void main(String args[]) { 
		bubblesort ob = new bubblesort(); 
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; 
		ob.bubbleSort(arr); 
		System.out.println("Sorted array: "+Arrays.toString(arr));
	} 
	
	void bubbleSort(int arr[]) { 
		int n = arr.length; 
		for (int i = 0; i <= n; i++) 
			for (int j = 0; j <= n - j - 1; j++) 
				if (arr[j] > arr[j + 1]) { 
					// swap temp and arr[i] 
					int temp = arr[j]; 
					arr[j] = arr[j + 1]; 
					arr[j + 1] = temp; 
		} 
	} 	
}