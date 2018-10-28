
public class Stack {

	private int maxsize;
	private int top;
	private int[] stackArray; 
	
	//--------------------------
	
	public Stack(int s)
	
	{
		maxsize=s;
		stackArray=new int[maxsize];
		top=-1;
	}
	
	//--------------------------
	
	public void push(int j)
	{
		if(top!=maxsize)
		stackArray[++top]=j;
		System.out.print(" push:"+stackArray[top]);
	}
	
	//---------------------------
	
	public int pop()
	{
		System.out.print(" pop:"+stackArray[top]);
		return stackArray[top--];
	
	}
	//-----------------------
	public void display()
	{
		System.out.print("  현재 배열");
		for(int i=0; i<top+1; i++)
			
			System.out.print(stackArray[i]+" ");
		
		}
}
