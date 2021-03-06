package dataManagement.decisionTrees;

public class Node
{
	boolean leaf;
	double[] coefs;
	double leafClass;
	//para estadisticas:
	private int depth;
	
	//Menor que cero
	Node leftChild;
	
	//Mayor que cero
	Node rightChild;
	
	public Node()
	{
		this.coefs = null;
		this.leaf = false;
	}
	
	public Node(double[] coefs)
	{
		this.coefs = coefs;
		this.leaf = false;
	}
	
	public Node(double[] coefs, boolean leaf)
	{
		this.coefs = coefs;
		this.leaf = leaf;
	}

	public boolean isLeaf()
	{
		return leaf;
	}

	public double[] getCoefs()
	{
		return coefs;
	}

	public Node getLeftChild()
	{
		return leftChild;
	}

	public Node getRightChild()
	{
		return rightChild;
	}
	
	public void setCoefficients(double[] coefs)
	{
		this.coefs = coefs;
	}

	public void setLeaf(boolean leaf)
	{
		this.leaf = leaf;
	}

	public void setLeftChild(Node leftChild)
	{
		this.leftChild = leftChild;
		this.leftChild.depth = this.depth + 1;
	}

	public void setRightChild(Node rightChild)
	{
		this.rightChild = rightChild;
		this.rightChild.depth = this.depth + 1;
	}

	public double getLeafClass()
	{
		return leafClass;
	}

	public void setLeafClass(double leafClass)
	{
		this.leafClass = leafClass;
	}

	public int getDepth()
	{
		return depth;
	}
}
