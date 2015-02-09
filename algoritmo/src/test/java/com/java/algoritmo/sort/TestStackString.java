/**
 * 
 */
package com.java.algoritmo.sort;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.java.algoritmo.stack.Stack;

/**
 * @author alejandro
 *
 */
@FixMethodOrder(MethodSorters.DEFAULT)
public class TestStackString {
	
	private static Stack<String> stackStrings = new Stack<String>();
	
	@Test()
	public void test1Push(){
		stackStrings.push("a");
		stackStrings.push("b");
		stackStrings.push("c");
		stackStrings.push("d");
		Assert.assertEquals(Integer.parseInt("4"), stackStrings.size());
	}
	
	@Test
	public void test2Peek(){
		Assert.assertEquals("d", stackStrings.peek());
	}
	
	@Test
	public void test3Pop(){
		Assert.assertEquals("d", stackStrings.pop());
	}
}
