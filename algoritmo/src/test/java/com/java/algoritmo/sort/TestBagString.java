/**
 * 
 */
package com.java.algoritmo.sort;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.java.algoritmo.bag.Bag;

/**
 * @author alejandro
 *
 */
@FixMethodOrder(MethodSorters.DEFAULT)
public class TestBagString {
	
	private static Bag<String> bagStrings = new Bag<String>();
	
	@Test()
	public void test1Push(){
		bagStrings.add("a");
		bagStrings.add("b");
		bagStrings.add("c");
		bagStrings.add("d");
		Assert.assertEquals(Integer.parseInt("4"), bagStrings.size());
	}
}
