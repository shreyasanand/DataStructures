#DataStructures

Java implementation of some common data structures
    - Linked list
    - Stack
    
#Class diagram

![alt tag](https://raw.github.com/shreyasanand/DataStructures/master/Class-Diagram.PNG)

#Unit testing

    - StackImplTest
        * 01 : Stack is empty on creation.
        * 02 : After n pushes, stack is not empty and it's size is n.
        * 03 : Popping from an empty stack throws an EmptyStackException.
        * 04 : Peeking into an empty stack throws an EmptyStackException.
        * 05 : After pushing elements display stack will display the 
               elements with the last pushed elements on the left-most side
 		       followed by the previously pushed elements with a space as delimiter.
        * 06 : After pushing two elements and popping once, 
               display stack will display the first push element.
        * 07 : After pushing n elements and popping n times the stack size is 0 and 
               it is empty.
        * 08 : Pushing a null into the stack throws a NullPointerException.