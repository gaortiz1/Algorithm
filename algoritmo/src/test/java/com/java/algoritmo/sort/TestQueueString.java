/**
 * 
 */
package com.java.algoritmo.sort;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.java.algoritmo.queue.Queue;

/**
 * @author alejandro
 *
 */
@FixMethodOrder(MethodSorters.DEFAULT)
public class TestQueueString {
	
	private static Queue<String> queueStrings = new Queue<String>();
	
	@Test()
	public void test1enqueue(){
		queueStrings.enqueue("a");
		queueStrings.enqueue("b");
		queueStrings.enqueue("c");
		queueStrings.enqueue("d");
		Assert.assertEquals(Integer.parseInt("4"), queueStrings.size());
	}
	
	@Test
	public void test2Peek(){
		Assert.assertEquals("a", queueStrings.peek());
	}
	
	@Test
	public void test3dequeue(){
		Assert.assertEquals("a", queueStrings.dequeue());
	}
}
