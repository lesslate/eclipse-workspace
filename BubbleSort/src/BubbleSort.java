import java.util.Arrays;

public class BubbleSort 
{
	public static void main(String[] args) 
	
	{
	int[] arr = {3,2,6,1,4};
	System.out.print("정렬 전");
	System.out.println(Arrays.toString(arr));

		
	    int temp = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j= 1 ; j < arr.length-i; j++) 
			{
				if(arr[j]<arr[j-1]) 
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	System.out.print("정렬 후");	
	System.out.println(Arrays.toString(arr));
	}
	
	
	
}
