package src;
import java.util.Stack;


public class QueueUsingTwoStacks {
	
	private Stack<Integer> s1 = new Stack<Integer>();
	private Stack<Integer> s2 = new Stack<Integer>();
	
	public int dequeue()
	{
		if(s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
		}
		return (Integer) s2.pop();
	}
	
	public void enqueue(int n)
	{
		s1.push(n);
	}

	public static void main(String[] args) {
		
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		int[] array = {1,2,3,4,5,6,7,8,9};
		queue.enqueue(array[0]);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
}
