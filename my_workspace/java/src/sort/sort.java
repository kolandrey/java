package sort;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		int damp;
		int[] array = { 5, 3, 1, 9, 4, 8, 56, 3, 6, 32 };
		System.out.println(Arrays.toString(array));
		for (int j = 0; j <array.length-1; j++)
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] > array[i + 1]) {
				damp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = damp;
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
