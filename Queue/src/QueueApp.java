
public class QueueApp {

	public static void main(String[] args) {
		Queue theQueue = new Queue(5);
		
		theQueue.insert(5);
		theQueue.insert(4);
		theQueue.insert(7);
		theQueue.insert(2);
		
		theQueue.remove();
		theQueue.remove();
		theQueue.remove();
		
		theQueue.insert(3);
		theQueue.insert(6);
		theQueue.insert(1);
		theQueue.insert(9);
		
		while(!theQueue.isEmpty())
		{
			long n = theQueue.remove();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
	
