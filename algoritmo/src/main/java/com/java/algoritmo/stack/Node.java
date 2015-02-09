/**
 * 
 */
package com.java.algoritmo.stack;


/**
 * @author alejandro
 *
 */
public class Node<T> {
	
	private T item;
	private Node<T> next;
	
	/**
	 * @return the item
	 */
	public T getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(T item) {
		this.item = item;
	}
	/**
	 * @return the next
	 */
	public Node<T> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
}
