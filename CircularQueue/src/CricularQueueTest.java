
public class CricularQueueTest {

	public static void main(String[] args) {
		CircularQueue theQueue = new CircularQueue(8);
		
		theQueue.Enqueue(10);
		theQueue.Enqueue(20);
		theQueue.Enqueue(30);
		theQueue.Enqueue(40);
		theQueue.Enqueue(50);
		theQueue.Enqueue(60);
		theQueue.Enqueue(70);
		theQueue.Enqueue(80);
		theQueue.Dequeue();
		theQueue.Enqueue(80);
		
		theQueue.display();
	}

}
