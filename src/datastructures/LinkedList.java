package datastructures;

import java.util.NoSuchElementException;

/**
 * An implementation of a singly linked list using the ListElement class
 * as elements of the linked list.
 * 
 * @author shreyas
 */
public class LinkedList {
	
	//
    //
    // CLASS & INSTANCE VARIABLES
    //
    //
	private ListElement head;
	private int size;

	
	//
    //
    // OPERATIONS
    //
    //
	/**
	 * Method to insert at the beginning of the list.
	 * 
	 * @param data
	 */
	public void insertFirst(Object data){
		ListElement newElement = new ListElement(data);
		newElement.next = this.head;
		this.size++;
		this.head = newElement;
	}
	
	/**
	 * Method to remove the element at the beginning of the list.
	 * Returns the deleted element.
	 * 
	 * @return {@link ListElement}
	 */
	public ListElement deleteFirst() {
		if(this.size==0){
			throw new NoSuchElementException("The list is empty");
		}
		ListElement temp = this.head;
		this.head = this.head.next;
		this.size--;
		return temp;
	}
	
	/**
	 * Method to return the element at the beginning of the list.
	 * 
	 * @return {@link ListElement}
	 */
	public ListElement getFirst(){
		return this.head;
	}
	
	/**
	 * Method which traverses the list and calls the displayListElement()
	 * of each ListElement.
	 */
	public void printList(){
		ListElement temp = this.head;
		while(temp!=null){
			temp.displayListElement();
			temp=temp.next;
		}
	}
	
	/**
	 * Method which checks if the passed object is present in the list.
	 * Returns true if present else false.
	 * 
	 * @param data
	 * @return boolean
	 */
	public boolean find(Object data){
		ListElement current = this.head;
		while(current!= null && current.data!=data){
			current=current.next;
		}
		return (current!=null);
	}
	
	
	/**
	 * Method to delete a specific element from the list.
	 * 
	 * @param data
	 */
	public void deleteElement(Object data){
		ListElement current = this.head;
		ListElement prev = null;
		
		// If the element to be removed is in the first position
		// and nullify current for it to be garbage collected.
		if(current.data==data){
			this.head = current.next;
			current = null;
		}
		
		// Traverse the list while keeping track of the previous element.
		while(current!=null && current.data!=data){
			prev = current;
			current = current.next;
		}
		
		// If current reached null the given object is not present in the list
		if(current==null){
			System.out.println("The given object is no present in the list");
		}
		
		// Point the previous element to the current element's next
		prev.next = current.next;
		
		// Nullify current for it to be garbage collected.
		current=null;
	}
	
	/**
	 * Method which checks if the head i.e. the first element
	 * is null and returns true indicating list is empty else
	 * true indicating that there is atleast one element in the list.
	 * 
	 * @return boolean
	 */
	public boolean isEmpty(){
		return (this.head==null);
	}
	
	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.insertFirst(new Integer(10));
		test.insertFirst(new Integer(20));
		test.insertFirst(new Integer(30));
		test.printList();
		ListElement pop1 = test.deleteFirst();
		System.out.println("\nList after popping: "+pop1.data);
		test.printList();
	}
	
	//
    //
    // GET & SET METHODS
    //
    //
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
