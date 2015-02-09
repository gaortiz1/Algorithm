/**
 * 
 */
package com.java.algoritmo.queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.java.algoritmo.iterator.ListIterator;
import com.java.algoritmo.node.Node;

/**
 * @author alejandro
 *
 */
public class Queue<T> implements Iterable<T> {

	private int size; // number of elements on queue
	private Node<T> first; // beginning of queue
	private Node<T> last; // end of queue

	/**
	 * Initializes an empty queue.
	 */
	public Queue() {
		first = null;
		last = null;
		size = 0;
	}

	/**
	 * Is this queue empty?
	 * 
	 * @return true if this queue is empty; false otherwise
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * Returns the number of Ts in this queue.
	 * 
	 * @return the number of Ts in this queue
	 */
	public int size() {
		return size;
	}

	/**
	 * Returns the T least recently added to this queue.
	 * 
	 * @return the T least recently added to this queue
	 * @throws java.util.NoSuchElementException
	 *             if this queue is empty
	 */
	public T peek() {	
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		return first.getItem();
	}

	/**
	 * Adds the T to this queue.
	 * 
	 * @param T
	 *            the T to add
	 */
	public void enqueue(final T item) {
		final Node<T> oldlast = last;
		last = new Node<T>();
		last.setItem(item);
		last.setNext(null);
		if (isEmpty())
			first = last;
		else
			oldlast.setNext(last);
		size++;
	}

	/**
	 * Removes and returns the T on this queue that was least recently added.
	 * 
	 * @return the T on this queue that was least recently added
	 * @throws java.util.NoSuchElementException
	 *             if this queue is empty
	 */
	public T dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		final T item = first.getItem();
		first = first.getNext();
		size--;
		if (isEmpty())
			last = null; // to avoid loitering
		return item;
	}

	
	/**
	 * Returns an iterator that iterates over the Ts in this queue in FIFO
	 * order.
	 * 
	 * @return an iterator that iterates over the Ts in this queue in FIFO
	 *         order
	 */
	public Iterator<T> iterator() {
		return new ListIterator<T>(first);
	}
}
