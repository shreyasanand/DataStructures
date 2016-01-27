package datastructures;

import java.util.EmptyStackException;

/**
 * An implementation of the Stack interface as a wrapper around the LinkedList
 * class. All stack methods delegate to the methods in LinkedList.
 * 
 * @author shreyas
 *
 */
public class StackImpl implements Stack {

	//
    //
    // CLASS & INSTANCE VARIABLES
    //
    //
	private LinkedList list = new LinkedList();
	
	
	//
    //
    // OPERATIONS
    //
    //
	public void push(Object item) {
		if(item==null) {
			throw new NullPointerException("Cannot push null");
		}
		this.list.insertFirst(item);
	}

	public Object pop() {
		if(this.list.getSize()==0){
			throw new EmptyStackException();
		}
		return this.list.deleteFirst();
	}

	public Object peek() {
		if(this.list.getSize()==0){
			throw new EmptyStackException();
		}
		return this.list.getFirst();
	}

	public int size() {
		return this.list.getSize();
	}

	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	public void displayStack() {
		this.list.printList();
	}
	
	public static void main(String[] args) {
		StackImpl s = new StackImpl();
		s.push(new String("A"));
		s.push(new String("B"));
		s.push(new String("C"));
		s.push(new String("D"));
		s.displayStack();
		s.pop();
		s.displayStack();
	}

}
