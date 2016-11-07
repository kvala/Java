package src;
import static org.junit.Assert.*;

import java.rmi.UnexpectedException;
import java.util.EmptyStackException;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;


public class QueueUsingTwoStacksTest {
	
	@Test
	public void testEnqueue() {
		QueueUsingTwoStacks q = new QueueUsingTwoStacks();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		assertEquals(1, q.dequeue());
		assertEquals(2, q.dequeue());
		assertEquals(3, q.dequeue());
		assertNotEquals(5, q.dequeue());
	}
	
	@Test(expected = EmptyStackException.class)
	public void testDequeue() {
		QueueUsingTwoStacks q = new QueueUsingTwoStacks();
		q.enqueue(1);
		q.enqueue(2);
		assertEquals(1, q.dequeue());
		assertEquals(2, q.dequeue());
		q.enqueue(5);
		assertEquals(5, q.dequeue());
		System.out.println(q.dequeue());
	}
	
	@Test (expected=EmptyStackException.class)
	public void testQueueEmpty(){
		QueueUsingTwoStacks q = new QueueUsingTwoStacks();
		System.out.println(q.dequeue());
	}	
	
	@Test (expected=AssertionError.class)
	public void testIllegalState() {
		QueueUsingTwoStacks q = new QueueUsingTwoStacks();
		q.enqueue(1);
		assertEquals(5, q.dequeue());
	}
	
	@SuppressWarnings("null")
	@Test(expected=NullPointerException.class)
	public void testNullValues() {
		QueueUsingTwoStacks q = new QueueUsingTwoStacks();
		q.enqueue((Integer) null);
		assertEquals(1, q.dequeue());
	}
	
}
