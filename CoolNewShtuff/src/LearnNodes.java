// Lesson from: https://www.javagists.com/java-tree-data-structure

import java.util.*;

// Class represents a Node with type "T" - can be String, int, double, char, etc.
class Node<T> {
	
	private T data = null; // Initialize an initial value of null
	
	private List<Node<T>> children = new ArrayList<>(); // Initialize an empty ArrayList to store this node's children in
	
	private Node<T> parent = null; // Initialize this node's parent to null for now
	
	public Node(T data) // Initialize tree with a value
	{
		this.data=data;
	}
	
	public Node<T> addChild(Node<T> child) // Add's one child to the tree
	{
		child.setParent(this);
		this.children.add(child);
		return child;
	}
	
	public void addChilren(List<Node<T>> children) // Add's a list of children nodes to the tree
	{
		children.forEach(each -> each.setParent(this));
		this.children.addAll(children);
	}
	
	public List<Node<T>> getChildren() // Return a list of children nodes
	{
		return children;
	}
	
	public Node<T> getParent()
	{
		return parent;
	}
	
	public void setParent(Node<T> parent)
	{
		this.parent = parent;
	}
	
	public T getData() // Returns the value of this node
	{
		return this.data;
	}
	
	public void setData(T data) // Sets the value of this node
	{
		this.data = data;
	}
	
	// BONUS ADDITIONS
	public boolean hasChildren()
	{
		if(this.children.isEmpty())
			return false;
		else
			return true;
	}
	
	public boolean hasParent()
	{
		if(this.parent==null)
			return false;
		else
			return true;
	}
	
}

// JUST DEMO WORK BELOW
public class LearnNodes {
	
	public static void main(String[] args)
	{
		Node<String> root = new Node<String>("ROOT"); // Create the default root (not always necessary)
		
	}

}
