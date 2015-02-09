/**
 * 
 */
package com.java.algoritmo.bag;

import java.util.Iterator;

import com.java.algoritmo.iterator.ListIterator;
import com.java.algoritmo.node.Node;

/**
 * @author alejandro
 *
 */
public class Bag<T> implements Iterable<T> {
	
	private int size;               // number of elements in bag
    private Node<T> first;    // beginning of bag
    
    /**
     * Initializes an empty bag.
     */
    public Bag() {
        first = null;
        size = 0;
    }

    /**
     * Is this bag empty?
     * @return true if this bag is empty; false otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of Ts in this bag.
     * @return the number of Ts in this bag
     */
    public int size() {
        return size;
    }

    /**
     * Adds the T to this bag.
     * @param T the T to add to this bag
     */
    public void add(T item) {
        Node<T> oldfirst = first;
        first = new Node<T>();
        first.setItem(item);
        first.setNext(oldfirst);
        size++;
    }
	
    /* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<T> iterator() {
		return new ListIterator<T>(first);  
	}

}
