/**
 * 
 */
package com.java.algoritmo.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author alejandro
 *
 */
public class ListIterator<T> implements Iterator<T> {
	
	private Node<T> current;

	public ListIterator(Node<T> first) {
		current = first;
	}


	public boolean hasNext() {
		return current != null;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public T next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		final T t = current.getItem();
		current = current.getNext();
		return t;
	}
}
