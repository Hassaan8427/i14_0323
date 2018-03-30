package ConversionsCiphersLinkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoublyLinkedListTest {

	@Test
	public void test() {
		DoublyLinkedList myList=new DoublyLinkedList();
		
		myList.insertHead(13);
		myList.insertHead(7);
		myList.insertHead(10);
		myList.display(); // <-- 10(head) <--> 7 <--> 13(tail) -->

		myList.insertTail(11);
		myList.display(); // <-- 10(head) <--> 7 <--> 13 <--> 11(tail) -->

		myList.deleteTail();
		myList.display(); // <-- 10(head) <--> 7 <--> 13(tail) -->
		myList.delete(13);
		myList.insertTail(12);
		myList.delete(7);
		myList.display(); // <-- 10(head) <--> 13(tail) -->
		myList.delete(10);
		
		myList.insertOrdered(23);
		myList.insertOrdered(67);
		myList.insertOrdered(3);
		myList.display();
		
		myList.insertHead(0);
		myList.deleteHead();
	}

}
