
public class ArrayQueueApp {

	public static void main(String[] args) {
		ArrayQueue theQueue = new ArrayQueue(5);
		
		theQueue.Enqueue(10);
		theQueue.Enqueue(20);
		theQueue.Enqueue(30);
		
		theQueue.Dequeue();
		theQueue.Dequeue();
		theQueue.Dequeue();
		
		theQueue.Dequeue();

		theQueue.Enqueue(50);
		theQueue.Enqueue(10);
		
		theQueue.Enqueue(40);
		
		theQueue.Dequeue();
		theQueue.Dequeue();
		
		theQueue.display();
	}

}
