
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
				System.out.print("ť�� ����á���ϴ�.");
				 return;
			}
		queArray[++rear] = j;
		
		
	}
//------------------------------
	public long Dequeue()
	{
		if(front==rear) {
			System.out.print("ť�� ������ϴ�.");
			return 0;
		}
		long temp= queArray[++front];
		
		System.out.print("���:"+temp+" ");
		return temp;
	}
//----------------------------------
	public void display()
	{
		System.out.print("  ���� ť");
		 for (int i = front + 1; i <= rear; i++)
	            System.out.print(queArray[i] + " ");
			
	}
	}


