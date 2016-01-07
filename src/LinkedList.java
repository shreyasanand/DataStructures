
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
	public ListElement deleteFirst(){
		ListElement temp = this.head;
		this.head = this.head.next;
		return temp;
	}
	
	/**
	 * Method to return the element at the beginning of the list.
	 * @return
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
