package datastructures;

/**
 * A simple stack interface
 * 
 * @author shreyas
 *
 */
public interface Stack {

	/**
	 * Method to add the passed item to the top of the stack
	 * 
	 * @param item
	 */
	void push(Object item);
	
	/**
	 * Method to remove the element at the top of the stack
	 * and return it.
	 * @return Object
	 */
	Object pop();
	
	/**
	 * Method to return the element at the top of the stack.
	 * @return Object
	 */
	Object peek();
	
	/**
	 * Method to return the number of elements currently in the stack.
	 * @return int
	 */
	int size();
	
	/**
	 * Method to check if the stack is empty or not.
	 * @return boolean
	 */
	boolean isEmpty();
	
	/**
	 * Method to display the contents of the stack.
	 */
	void displayStack();

}
