import java.util.Arrays;

public class Selection
{

	public static void main(String[] args) 
	
	{
		int indexMin, temp;
		int[] list={8,4,7,2,6};
		System.out.print("정렬 전");
		System.out.println(Arrays.toString(list));
		
	    for (int i = 0; i < list.length - 1; i++) 
	    {
	        indexMin = i;
	        for (int j = i + 1; j < list.length; j++) 
	        {
	            if (list[j] < list[indexMin]) 
	            {
	                indexMin = j;
	            }
	        }
	        temp = list[indexMin];
	        list[indexMin] = list[i];
	        list[i] = temp;
	    }
		System.out.print("정렬 후");
		System.out.println(Arrays.toString(list));
	}

	

}
