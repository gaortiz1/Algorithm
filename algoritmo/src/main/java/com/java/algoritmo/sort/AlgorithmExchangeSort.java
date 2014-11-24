/**
 * 
 */
package com.java.algoritmo.sort;

/**
 * @author alejandro
 *
 */
public final class AlgorithmExchangeSort {

	private AlgorithmExchangeSort() {
	}

	private static void exchange(final int[] array, final int indexCurrentItem, final int indexLessItem) {
		final int aux = array[indexCurrentItem];
		array[indexCurrentItem] = array[indexLessItem];
		array[indexLessItem] = aux;
	}

	public static int[] sort(final int array[]) {
		for (int indexCurrentItem = 0; indexCurrentItem < array.length - 1; indexCurrentItem++)
			for (int indexNextItem = indexCurrentItem + 1; indexNextItem < array.length; indexNextItem++)
				if (array[indexCurrentItem] > array[indexNextItem]) {
					exchange(array, indexCurrentItem, indexNextItem);
				}
		return array;
	}

}
