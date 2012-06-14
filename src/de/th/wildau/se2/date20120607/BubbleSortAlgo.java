package de.th.wildau.se2.date20120607;

import java.util.Arrays;

public class BubbleSortAlgo {

	public static void main(String[] args) {

		int[] array = SortAlgo.generateArray(5);
		System.out.println("bubblesort (default) unsortiert " + Arrays.toString(array));
		System.out.println("bubblesort (default) sortiert "
				+ Arrays.toString(bubbleSortDefault(array, 0, array.length)));

		array = SortAlgo.generateArray(5);
		System.out.println("bubblesort (optimiert) unsortiert " + Arrays.toString(array));
		System.out.println("bubblesort (optimiert) sortiert "
				+ Arrays.toString(bubbleSortDefault(array, 0, array.length)));
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
	 * FIXME Max
	 * 
	 * @param bubble
	 *            unsorted array
	 * @return
	 */
	public static int[] bubbleSortOpti(int[] bubble) {

		int i = 0;
		int j = 1;
		int temp;
		boolean again = true;

		while (again) {
			again = false;
			for (i = 0; i < bubble.length - 1; i++) {
				if (bubble[i] > bubble[j]) {
					temp = bubble[i];
					bubble[i] = bubble[j];
					bubble[j] = temp;
					again = true;
					j++;
				}
			}
		}
		return bubble;
	}
}
