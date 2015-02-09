/**
 * 
 */
package com.java.algoritmo.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.java.algoritmo.iterator.ListIterator;
import com.java.algoritmo.node.Node;

/**
 * @author alejandro
 *
 */
public class Stack<T> implements Iterable<T> {

	private int size; // size of the stack
	private Node<T> first; // top of stack

	/**
	 * Initializes an empty stack.
	 */
	public Stack() {
		first = null;
		size = 0;
	}

	/**
	 * Is this stack empty?
	 * 
	 * @return true if this stack is empty; false otherwise
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * Returns the number of Ts in the stack.
	 * 
	 * @return the number of Ts in the stack
	 */
	public int size() {
		return size;
	}

	/**
	 * Adds the T to this stack.
	 * 
	 * @param T
	 *            the T to add
	 */
	public void push(final T item) {
		final Node<T> oldfirst = first;
		first = new Node<T>();
		first.setItem(item);
		first.setNext(oldfirst);
		size++;
	}

	/**
	 * Removes and returns the T most recently added to this stack.
	 * 
	 * @return the T most recently added
	 * @throws java.util.NoSuchElementException
	 *             if this stack is empty
	 */
	public T pop() {
		if (isEmpty()){
			throw new NoSuchElementException("Stack underflow");
		}
		T T = first.getItem(); // save T to return
		first = first.getNext(); // delete first node
		size--;
		return T; // return the saved T
	}

	/**
	 * Returns (but does not remove) the T most recently added to this stack.
	 * 
	 * @return the T most recently added to this stack
	 * @throws java.util.NoSuchElementException
	 *             if this stack is empty
	 */
	public T peek() {
		if (isEmpty()){
			throw new NoSuchElementException("Stack underflow");
		}
		return first.getItem();
	}

	/**
	 * Returns an iterator to this stack that iterates through the Ts in LIFO
	 * order.
	 * 
	 * @return an iterator to this stack that iterates through the Ts in LIFO
	 *         order.
	 */
	public Iterator<T> iterator() {
		return new ListIterator<T>(first);
	}
}
