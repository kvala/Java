package src;
class LinkedList
{
    Node head; 
 
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    void printNthNodeFromLast(int n)
    {
        Node main = head;
        Node ref = head;
 
        int count = 0;
        if (head != null)
        {
            while (count < n)
            {
                if (ref == null)
                {
                    System.out.println(n + " is greater than the no of nodes in the list");
                    return;
                }
                ref = ref.next;
                count++;
            }
            while (ref != null)
            {
                main = main.next;
                ref = ref.next;
            }
            System.out.println(n + "th element from last is " + main.data);
        }
    }
 
    public void insert(int data)
    {
    	Node node = new Node(data);
    	node.next = head;
    	head = node;
    }
    
    public void print()
    {
    	Node curr = head;
    	while(curr != null)
    	{
    		System.out.print(curr.data + " -> ");
    		curr = curr.next;
    	}
    	System.out.println("null");
    }
 
    public static void main(String [] args)
    {
        LinkedList llist = new LinkedList();
        llist.insert(20);
        llist.insert(4);
        llist.insert(15);
        llist.insert(35);
        System.out.print("Here is the list: ");
        llist.print();    
        llist.printNthNodeFromLast(4);
    }
} 