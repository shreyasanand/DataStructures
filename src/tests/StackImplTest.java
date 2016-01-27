package tests;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.EmptyStackException;
import org.junit.Before;
import org.junit.Test;
import datastructures.StackImpl;

/**
 * Test class for StackImpl class.
 * 
 * Test-cases:
 * 01 : Stack is empty on creation.
 * 02 : After n pushes, stack is not empty and it's size is n.
 * 03 : Popping from an empty stack throws an EmptyStackException.
 * 04 : Peeking into an empty stack throws an EmptyStackException.
 * 05 : After pushing elements display stack will display the 
 * 		elements with the last pushed elements on the left-most side
 *		followed by the previously pushed elements with a space as delimiter.
 * 06 : After pushing two elements and popping once, 
 * 		display stack will display the first push element.
 * 07 : After pushing n elements and popping n times the stack size is 0 and 
 * 		it is empty.
 * 08 : Pushing a null into the stack throws a NullPointerException.
 * 
 * @author shreyas
 *
 */
public class StackImplTest {
	
	//
    //
    // CLASS & INSTANCE VARIABLES
    //
    //
	private StackImpl stack;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	//
    //
    // HELPER METHODS
    //
    //
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}
	
	
	//
    //
    // OPERATIONS
    //
    //
	
	/*
	 * Unit test 01 : Stack is empty on creation.
	 */
	@Test
	public void testNewStackIsEmpty() {
		stack = new StackImpl();
		assertTrue(stack.isEmpty());
		assertEquals(stack.size(), 0);
	}
	
	/*
	 * Unit test 02 : After n pushes, stack is not empty and it's size is n.
	 */
	@Test
	public void testNPushesToEmptyStack() {
		stack = new StackImpl();
		int n = 4;
		for(int i=0;i<n;i++) {
			stack.push("A");
		}
		assertFalse(stack.isEmpty());
		assertEquals(stack.size(), n);
	}
	
	/*
	 * Unit test 03 : Popping from an empty stack throws an EmptyStackException
	 */
	@Test(expected=EmptyStackException.class)
	public void testPopFromEmptyStack() {
		stack = new StackImpl();
		assertTrue(stack.isEmpty());
		stack.pop();
	}
	
	/*
	 * Unit test 04 : Peeking into an empty stack throws an EmptyStackException.
	 */
	@Test(expected=EmptyStackException.class)
	public void testPeekIntoEmptyStack() {
		stack = new StackImpl();
		assertTrue(stack.isEmpty());
		stack.peek();
	}
	
	/*
	 * Unit test 05 : After pushing elements display stack will display the elements 
	 * with the last pushed elements on the left-most side followed by the previously pushed
	 * elements with a space as delimiter.
	 */
	@Test
	public void testDisplayStack() {
		stack = new StackImpl();
		stack.push("A");
		stack.push("B");
		stack.displayStack();
		assertEquals("B A ", outContent.toString());
	}
	
	/*
	 * Unit test 06 : After pushing two elements and popping once, 
	 * display stack will display the first push element.
	 */
	@Test
	public void testPushThenPop() {
		stack = new StackImpl();
		stack.push("A");
		stack.push("B");
		stack.pop();
		stack.displayStack();
		assertEquals("A ", outContent.toString());
	}
	
	/*
	 * Unit test 07 : After pushing n elements and popping n times the
	 * stack size is 0 and it is empty.
	 */
	@Test
	public void testPopDownToEmpty() {
		stack = new StackImpl();
		int n = (int)(Math.random() * 9)+1;
		for(int i=0;i<n;i++){
			stack.push("A");
		}
		
		for(int i=0;i<n;i++){
			stack.pop();
		}
		assertEquals(stack.size(), 0);
		assertTrue(stack.isEmpty());
	}
	
	/*
	 * Unit test 08 : Pushing a null into the stack throws a NullPointerException.
	 */
	@Test(expected=NullPointerException.class)
	public void testPushNull() {
		stack = new StackImpl();
		stack.push(null);
	}
}
