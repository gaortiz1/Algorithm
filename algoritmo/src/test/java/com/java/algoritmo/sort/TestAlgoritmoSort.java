/**
 * 
 */
package com.java.algoritmo.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author alejandro
 *
 */
public class TestAlgoritmoSort {

	int[] numerosOrdenados = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	int[] numerosDesordenados = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

	@Test
	public void ordenaIntercambio() {
		Assert.assertArrayEquals(numerosOrdenados, AlgorithmExchangeSort.sort(numerosDesordenados));
	}

}
