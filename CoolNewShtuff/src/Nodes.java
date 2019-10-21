import java.util.ArrayList;
import java.util.List;

// Class represents a Node with type "Tree"
class Node<T> {
	
	private T data = null; // Initialize an empty "Tree" of data
	
	private List<Node<T>> children = new ArrayList<>(); // Initialize an empty ArrayList to store this node's children in
	
	private Node<T> parent = null; // Initialize this node's parent to null for now
	
	public Node(T data) // Initialize tree with data
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
	
	public T getData()
	{
		return this.data;
	}
	
	public void setData(T data)
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

public class Nodes { }
