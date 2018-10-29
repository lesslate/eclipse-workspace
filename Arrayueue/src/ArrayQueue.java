
public class ArrayQueue {
	
	
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	
//------------------------------
	public ArrayQueue(int s)
	{
		maxSize= s;
		queArray=new long[maxSize];
		front = -1;
		rear = -1;
		
		
	}
//---------------------------
	public void Enqueue(long j)
	{
			if(rear==maxSize-1) {
				System.out.print("큐가 가득찼습니다.");
				 return;
			}
		queArray[++rear] = j;
		
		
	}
//------------------------------
	public long Dequeue()
	{
		if(front==rear) {
			System.out.print("큐가 비었습니다.");
			return 0;
		}
		long temp= queArray[++front];
		
		System.out.print("출력:"+temp+" ");
		return temp;
	}
//----------------------------------
	public void display()
	{
		System.out.print("  현재 큐");
		 for (int i = front + 1; i <= rear; i++)
	            System.out.print(queArray[i] + " ");
			
	}
	}


