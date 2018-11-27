
class Tree
{
	private Node root;

	public Tree()
	{root = null;}

	public void insert(int id)
	{
		Node newNode = new Node();
		newNode.iData = id;
		
		if(root==null)
			root = newNode;
		else
		{
			Node current = root;
			Node parent;
			while(true)
			{
				parent = current;
				if(id<current.iData)
				{
					current = current.leftChild;
					if(current==null)
					{
						parent.leftChild = newNode;
						return;
					}
				}
			
			else
			{
				current = current.rightChild;
				if(current == null) {
					parent.rightChild= newNode;
				return;
			}
				}
			}
		}
	}

	public void traverse()
	{
		System.out.print("\nPreorder traversal: ");	
		preOrder(root);
		System.out.print("\ninOrder traversal: ");	
		inOrder(root);
		System.out.print("\nPostOrder traversal: ");	
		postOrder(root);
	    System.out.println();
	}
	

private void preOrder(Node localRoot)
{
	if(localRoot != null)
	{
		System.out.print(localRoot.iData+" ");
		preOrder(localRoot.leftChild);
		preOrder(localRoot.rightChild);
	}
}

private void inOrder(Node localRoot)
{
	if(localRoot != null)
	{
		
		inOrder(localRoot.leftChild);
		System.out.print(localRoot.iData + " ");
		inOrder(localRoot.rightChild);
		
	}
}
private void postOrder(Node localRoot)
{
	if(localRoot != null)
	{
		
		postOrder(localRoot.leftChild);
		
		postOrder(localRoot.rightChild);
		System.out.print(localRoot.iData + " ");
		
	}
}

}
