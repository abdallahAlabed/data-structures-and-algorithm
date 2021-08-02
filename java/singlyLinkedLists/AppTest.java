package singlyLinkedLists;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    // challenge 5
    @Test
    public void testSinglyLinkedList() {
        SinglyLinkedLists list = new SinglyLinkedLists();
        assertNull("instantiate an empty linked list", list.head);

        SinglyLinkedLists list1 = new SinglyLinkedLists();
        list1.insert(1);
        assertEquals("insert into the linked list", 1, list1.head.data);

        SinglyLinkedLists list2 = new SinglyLinkedLists();
        list2.insert(1);
        list2.insert(2);
        list2.insert(3);

        assertEquals("The head property will properly point to the first node in the linked list", 1, list2.head.data);

        SinglyLinkedLists list3 = new SinglyLinkedLists();
        list3.insert(1);
        list3.insert(2);
        list3.insert(3);

        assertEquals("insert multiple nodes into the linked list", 3, list3.tail.data);

        SinglyLinkedLists list4 = new SinglyLinkedLists();
        list4.insert(1);
        list4.insert(2);
        list4.insert(3);

        assertEquals("Will return true when finding a value within the linked list that exists", true,
                list4.includes(3));

        assertEquals("Will return false when searching for a value in the linked list that does not exist", false,
                list4.includes(4));

        String str = "{ 1 } -> { 2 } -> { 3 } -> NULL";
        assertEquals("return a collection of all the values that exist in the linked list", str, list4.toStr());
    }

    // challenge 6
    @Test
    public void testSinglyLinkedLists2() {
        SinglyLinkedLists list = new SinglyLinkedLists();
        list.append(1);
        String str = "{ 1 } -> NULL";
        assertEquals("add a node to the end of the linked list", str, list.toStr());

        ////////////////////////////////////////////////////////////////////////////////////////////////

        list.append(2);
        list.append(3);
        list.append(4);
        String str2 = "{ 1 } -> { 2 } -> { 3 } -> { 4 } -> NULL";
        assertEquals("add multiple nodes to the end of a linked list", str2, list.toStr());

        ////////////////////////////////////////////////////////////////////////////////////////////////
        SinglyLinkedLists list1 = new SinglyLinkedLists();
        list1.append(1);
        list1.append(2);
        list1.append(4);
        list1.insertBefore(4, 3);
        String str3 = "{ 1 } -> { 2 } -> { 3 } -> { 4 } -> NULL";
        assertEquals("insert a node before a node located i the middle of a linked list", str3, list1.toStr());

        ////////////////////////////////////////////////////////////////////////////////////////////////

        list1.insertBefore(1, 0);
        String str4 = "{ 0 } -> { 1 } -> { 2 } -> { 3 } -> { 4 } -> NULL";
        assertEquals("insert a node before the first node of a linked list", str4, list1.toStr());

        ////////////////////////////////////////////////////////////////////////////////////////////////

        SinglyLinkedLists list2 = new SinglyLinkedLists();
        list2.append(1);
        list2.append(2);
        list2.append(4);
        list2.insertAfter(2, 3);
        String str5 = "{ 1 } -> { 2 } -> { 3 } -> { 4 } -> NULL";
        assertEquals("insert after a node in the middle of the linked list", str5, list2.toStr());

        ////////////////////////////////////////////////////////////////////////////////////////////////

        list2.insertAfter(4, 5);
        String str6 = "{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> NULL";
        assertEquals("insert a node after the last node of the linked list", str6, list2.toStr());
    }
}