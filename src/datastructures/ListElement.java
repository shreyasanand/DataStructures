package datastructures;

public class ListElement {

	//
    //
    // CLASS & INSTANCE VARIABLES
    //
    //
	Object data;
	ListElement next;
	
	//
    //
    // CONSTRUCTORS & HELPER METHODS
    //
    //
	public ListElement(Object data) {
		this.data = data;
	}
	
	public void displayListElement(){
		System.out.print(data);
		System.out.print(" ");
	}
}
