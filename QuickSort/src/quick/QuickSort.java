package quick;

public class QuickSort {
	
	
	public static void quickSort(int arr[], int left, int right) {

		if (left < right) {
			int Newpivot = partition(arr, left, right);

			quickSort(arr, left, Newpivot - 1);
			quickSort(arr, Newpivot + 1, right);
		}

	}

	
	public static int partition(int[] arr, int left, int right) 
	{
	    int pivot=arr[right];
	    
	     
	        while (left < right) 
	        	
	        {
	            while (arr[left] < pivot&&(left<right))
	            	left++;
	           
	            while (arr[right]>pivot&&(left<right))
	            	right--;

	            if(left<right) 
	            {
	            int tmp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = tmp;
	            }
	            
	            
	        }
	        return left;

	}
}

