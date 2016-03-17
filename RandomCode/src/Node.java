//Implementation of a node class
public class Node <T> {
	public T nodeValue; 
	public Node<T> next; 
	
	Node (T item) {
		this(item,null);
	}
	
	Node (T item, Node<T> next) {
		nodeValue = item;
		this.next = next;
	}
}
