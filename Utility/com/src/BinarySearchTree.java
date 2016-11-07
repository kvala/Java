package src;
class Node
{
	Node left, right;
	int data;
	public Node(int data)
	{
		this.left = null;
		this.right =  null;
		this.data = data;
	}
	public Node getLeft()
	{
		return this.left;
	}
	public Node getRight()
	{
		return this.right;
	}
	public int getValue()
	{
		return this.data;
	}
}
public class BinarySearchTree {
	
	public static boolean binarySearch(Node root, int n)
	{
		if(root != null)
		{
			if(root.getValue() == n)
				return true;
			if(n < root.getValue())
				return binarySearch(root.getLeft(), n);
			else
				return binarySearch(root.getRight(), n);
		}
		return false;
	}
	public static void main(String[] args) {
		
		Node root = new Node(10);
		Node n1 = new Node(5);
		Node n2 = new Node(15);
		Node n3 = new Node(3);
		Node n4 = new Node(8);
		Node n5 = new Node(12);
		Node n6 = new Node(18);
		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.left = n5;
		n2.right = n6;
		System.out.println(binarySearch(root, 10));
	}
}
