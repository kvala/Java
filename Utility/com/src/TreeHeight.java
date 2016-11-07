package src;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class TreeHeight {
	
	public int treeHeight(TreeNode root){
		if(root==null)return 0;
		return (1+ Math.max(treeHeight(root.left),treeHeight(root.right)));
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(10);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(25);
		root.left.left.left =new TreeNode(30);
		root.left.right.left = new TreeNode(35);
		root.left.right.left.left = new TreeNode(40);
		root.left.right.left.left.right = new TreeNode(45);
			root.left.right.left.left.right.left = new TreeNode(50);
		TreeHeight i  = new TreeHeight();
		System.out.println(i.treeHeight(root));
	}
}
