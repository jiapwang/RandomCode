//This is an implementation of the Queue class
//It has push, pop, front and empty method. 
public class Queue <T> {
	Node <T> head; 
	Node <T> tail;
	int size;
	
	public Queue () {
		head = null;
		tail = null; 
		size = 0;
	}
	
	//this method pushes a Node to the rear of the queue
	//and increments size of queue by 1
	public void push (T ele) { 
		if (head == null) {
			Node <T> temp = new Node <T> (ele);
			head = temp;
			size++;
			tail = head;
		}
		else {
			Node <T> temp;
			temp = head; 
			while (temp.next != null) {
				temp = temp.next; 
			}
			temp.next = new Node <T> (ele);
			size++;
			tail = temp.next;
		}	
	}
	
	//this method pops the front Node from the queue
	//and decrements size of queue by 1
	public void pop () throws Exception{
		if (head == null) 
			throw new Exception("Queue is empty");
		else {
			head = head.next;
			size--;
		}
	}
	
	//this returns the value of the head node
	public T front() throws Exception {
		if (head==null)
			throw new Exception("Queue is empty!");
		return head.nodeValue;
	}
	
	//this method returns true if queue is empty
	//false otherwise
	public boolean empty () {
		return head==null;
	}
}
