package de.th.wildau.se2.date20120607;

import java.util.Arrays;

public class QuickSortAlgo {

	public static void main(String[] args) {

		int[] array = SortAlgo.generateArray(5);
		System.out.println("quicksort unsortiert " + Arrays.toString(array));
		System.out.println("quicksort sortiert "
				+ Arrays.toString(quickSort(array, 0, array.length - 1)));
	}

	public static int[] quickSort(int[] field, int min, int max) {
		int i = min, j = max;
		int pivot = field[min + (max - min) / 2];

		while (i <= j) {
			while (field[i] < pivot) {
				i++;
			}
			while (field[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = field[i];
				field[i] = field[j];
				field[j] = temp;
				i++;
				j--;
			}
		}

		if (min < j) {
			quickSort(field, min, j);
		}
		if (i < max) {
			quickSort(field, i, max);
		}
		return field;
	}
}
