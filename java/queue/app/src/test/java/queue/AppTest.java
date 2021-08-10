package queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AppTest {
    @Test
    public void testStackPush() {
        Stack<Integer> st1 = new Stack<>();
        st1.push(10);

        assertEquals(10, st1.top.value, "Can successfully push onto a stack");
    }
    @Test
    public void testStackPush2() {
        Stack<String> st1 = new Stack<>();
        st1.push("a");
        st1.push("b");
        st1.push("c");

        assertEquals("c", st1.top.value, "Can successfully push multiple values onto a stack\n");
        assertEquals("b", st1.top.next.value, "test stack top next value");
    }
    @Test
    public void testStackPop() throws Exception {
        Stack<String> st1 = new Stack<>();
        st1.push("a");
        st1.push("b");
        st1.push("c");

        assertEquals("c", st1.pop(), "Can successfully pop off the stack");
        assertEquals("b", st1.peek(), "Can successfully pop off the stack");
    }
    @Test
    public void testStackPop2() {
        Stack<String> st1 = new Stack<>();
        try {
            st1.push("a");
            st1.push("b");
            st1.push("c");
            st1.pop();
            st1.pop();
            st1.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertNull(st1.top, "Can successfully pop off the stack");
    }
    @Test
    public void testStackPeek() throws Exception {
        Stack<String> st1 = new Stack<>();
        st1.push("a");
        st1.push("b");
        st1.push("c");
        st1.pop();

        assertEquals("b", st1.peek(), "Can successfully peek the next item on the stack");
    }
    @Test
    public void testStackEmpty() throws Exception {
        Stack<String> st1 = new Stack<>();

        assertNull(st1.top, "Can successfully instantiate an empty stack");
    }
    @Test
    public void testStackError() {
        Stack<String> st1 = new Stack<>();
        try {
            assertEquals("stack is empty", st1.peek(), "Calling pop or peek on empty stack raises exception");
            assertEquals("stack is empty", st1.pop(), "Calling pop or peek on empty stack raises exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testQueueEnqueue() {
        Queue<Integer> q1 = new Queue<>();
        q1.enqueue(5);

        assertEquals(5,q1.front.value,"Can successfully enqueue into a queue");
        assertEquals(5,q1.rear.value,"Can successfully enqueue into a queue");
    }
    @Test
    public void testQueueEnqueue2() {
        Queue<Integer> q1 = new Queue<>();
        q1.enqueue(5);
        q1.enqueue(10);
        q1.enqueue(3);

        assertEquals(5,q1.front.value,"Can successfully enqueue multiple values into a queue");
        assertEquals(3,q1.rear.value,"Can successfully enqueue multiple values into a queue");
    }
    @Test
    public void testQueueDequeue() throws Exception {
        Queue<Integer> q1 = new Queue<>();
        q1.enqueue(5);
        q1.enqueue(10);
        q1.enqueue(3);

        assertEquals(5,q1.dequeue(),"Can successfully dequeue out of a queue the expected value");
        assertEquals(10,q1.front.value,"Can successfully dequeue out of a queue the expected value");
    }
    @Test
    public void testQueuePeek() throws Exception {
        Queue<Integer> q1 = new Queue<>();
        q1.enqueue(5);
        q1.enqueue(10);
        q1.enqueue(3);
        q1.dequeue();

        assertEquals(10,q1.peek(),"Can successfully peek into a queue, seeing the expected value");
    }
    @Test
    public void testQueueDequeue2() throws Exception {
        Queue<Integer> q1 = new Queue<>();
        q1.enqueue(5);
        q1.enqueue(10);
        q1.enqueue(3);
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();

        assertNull(q1.front,"Can successfully empty a queue after multiple dequeues");
    }
    @Test
    public void testQueueCreate() {
        Queue<Integer> q1 = new Queue<>();

        assertNull(q1.front,"Can successfully instantiate an empty queue");
        assertNull(q1.rear,"Can successfully instantiate an empty queue");
    }
    @Test
    public void testQueueError() {
        Queue<Integer> q1 = new Queue<>();
        try {
            assertEquals("queue is empty", q1.peek(), "Calling dequeue or peek on empty queue raises exceptiont");
            assertEquals("queue is empty", q1.dequeue(), "Calling dequeue or peek on empty queue raises exceptiont");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // challenge 11
    @Test public void testPseudoQueue() throws Exception {
        PseudoQueue<Integer>  pseudoQueue = new PseudoQueue<>();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(4);
        assertEquals("[4]->[3]->[2]->[1]->NULL",pseudoQueue.toString());
        pseudoQueue.dequeue();
        assertEquals("[4]->[3]->[2]->NULL",pseudoQueue.toString());

    }
    // challenge 12

    @Test
    public void testDequeueBoth() throws Exception {
        AnimalShelter animalShelter = new AnimalShelter();
        Dogs dog1=new Dogs("Rocky");
        Dogs dog2=new Dogs("MILO");
        Cats cat1=new Cats("shemsh");
        Cats cat2=new Cats("kitkit");

        animalShelter.enqueue(cat1);
        animalShelter.enqueue(cat2);
        animalShelter.enqueue(dog1);
        animalShelter.enqueue(dog2);
        animalShelter.dequeue("dog");
        animalShelter.dequeue("cat");
        assertEquals("Dogs{name='MILO'}",animalShelter.dequeue("dog").toString());
        assertEquals("Cats{name='kitkit'}",animalShelter.dequeue("cat").toString());
    }
    @Test
    public void testDequeueNull() throws Exception {
        AnimalShelter animalShelter=new AnimalShelter();
        assertEquals("Sorry We cant have a horse in the Shelter ",animalShelter.dequeue("horse"));
    }
}