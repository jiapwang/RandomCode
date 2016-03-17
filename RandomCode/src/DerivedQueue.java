
//This class extends Queue and provides one additional 
//method, "emergency_push," which pushes onto the front 
//of the queue instead of the rear.

public class DerivedQueue <T> extends Queue <T>{
	public void emergency_push (T ele){
		if (head == null) {
			head = new Node <T> (ele);
		}
		else {
			Node <T> temp = new Node <T> (ele); 
			temp.next = head;
			head = temp;
			size++;
		}
	}
}
