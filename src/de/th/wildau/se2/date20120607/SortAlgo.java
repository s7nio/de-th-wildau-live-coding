package de.th.wildau.se2.date20120607;

import java.util.Arrays;
import java.util.Random;

public class SortAlgo {

	public static void main(String[] args) {

		int[] array = generateArray(5);
		System.out.println("bubblesort (default) unsortiert " + Arrays.toString(array));
		System.out.println("bubblesort (default) sortiert "
				+ Arrays.toString(bubbleSortDefault(array, 0, array.length)));

		array = generateArray(5);
		System.out.println("bubblesort (optimiert) unsortiert " + Arrays.toString(array));
		System.out.println("bubblesort (optimiert) sortiert "
				+ Arrays.toString(bubbleSortDefault(array, 0, array.length)));

		array = generateArray(5);
		System.out.println("quicksort unsortiert " + Arrays.toString(array));
		System.out.println("quicksort sortiert " + Arrays.toString(quickSort(array)));
	}

	protected static int[] generateArray(int count) {
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = new Random().nextInt(100);
		}
		return result;
	}

	/**
	 * O(n^2)
	 * 
	 * Besseres Interface: bubbleSort(int[] field)
	 * 
	 * @param A
	 *            unsorted array
	 * @param links
	 *            border
	 * @param rechts
	 *            border
	 * @return sorted array
	 */
	public static int[] bubbleSortDefault(int[] A, int links, int rechts) {

		for (int i = links; i < rechts - 1; i++) {
			for (int j = links; j < rechts - 1; j++) {
				if (A[j] > A[j + 1]) {
					int help = A[j];
					A[j] = A[j + 1];
					A[j + 1] = help;
				}
			}
		}
		return A;
	}

	/**
	 * 
	 * 
	 * @param bubble
	 *            unsorted array
	 * @return
	 */
	public static int[] bubbleSortOpti(int[] bubble) {

		int i = 0;
		int temp;
		boolean again = true;
		int foo = 1;

		while (again) {
			again = false;
			for (i = 0; i < bubble.length - foo; i++) {
				if (bubble[i] > bubble[i + 1]) {
					temp = bubble[i];
					bubble[i] = bubble[i + 1];
					bubble[i + 1] = temp;
					again = true;
				}
			}
		}
		return bubble;
	}

	public static int[] insertionSort() {
		// TODO
		return null;
	}

	public static int[] selectionSort() {
		// TODO
		return null;
	}

	public static int[] quickSort(int[] field) {

		return null;
	}
}
