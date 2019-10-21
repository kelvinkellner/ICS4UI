import java.util.*;

class Node<T>
{
	private T data = null;
	private Node<T> parent = null;
	private List<Node<T>> children = new ArrayList<>();
	
	public Node(T data)
	{
		this.data = data;
	}
	
	public void setParent(Node<T> parent)
	{
		this.parent = parent;
	}
	
	public Node<T> getParent()
	{
		return parent;
	}
	
	public Node<T> addChild(Node<T> child)
	{
		child.setParent(this);
		this.children.add(child);
		return child;
	}
	
	public void addChildren(List<Node<T>> children)
	{
		children.forEach(each -> each.parent = this);
		this.children.addAll(children);
	}
	
	public T getData()
	{
		return data;
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
	
	public boolean hasChildren()
	{
		if(children.isEmpty())
			return false;
		else
			return true;
	}
	
	
}

public class NodePractice {
	
}
