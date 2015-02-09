/**
 * 
 */
package com.java.algoritmo.sort;

import org.junit.Assert;
import org.junit.Before;
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
	
	private Stack<String> stackStrings = new Stack<String>();
	
	@Test()
	public void test1Push(){
		this.stackStrings.push("a");
		this.stackStrings.push("a");
		Assert.assertEquals(Integer.parseInt("2"), this.stackStrings.size());
	}
	
	@Test
	public void test2Peek(){
		Assert.assertEquals("a", this.stackStrings.peek());
	}
}
