
public class CircularQueue {
	
	
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	
	private boolean isEmpty() 
	{
	        return front == rear ? true : false;
	}
//-------------------------------
	private boolean isFull() 
	{
	        return (rear+1) % maxSize == front ? true: false;
	}
	

//------------------------------
	public CircularQueue(int s)
	{
		maxSize= s;
		queArray=new long[maxSize];
		front = 0;
		rear = 0;
		
		
	}
//---------------------------
	public void Enqueue(long j)
	{
			if(isFull()) 
				System.out.print("큐가 가득찼습니다.");
			else {
				rear=(++rear)%maxSize;
				queArray[rear]=j;
			}
		
	}
//------------------------------
	public long Dequeue()
	{
		if(isEmpty()) {
			return -1;
		}
		
		long temp= queArray[front+1];
		
		front = (++front)%maxSize;
		
		System.out.print("출력:"+temp+" ");
		
		return temp;
	}
//----------------------------------
	public void display()
	{
		System.out.print("  현재 큐");
		 for (int i = front + 1; i !=(rear+1)%maxSize; i=(i+1)%maxSize)
	            System.out.print(queArray[i] + " ");
			
	}
}
	

