/**
 * 
 */
package com.java.algoritmo.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.java.algoritmo.node.Node;

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
