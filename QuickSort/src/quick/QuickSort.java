package quick;

public class QuickSort {
	
	public void quickSort(int[] arr, int left, int right) 
	{
	    int i, j, pivot, tmp;
	    if (left < right) {
	        i = left;   j = right;
	        pivot = arr[right];
	        
	      //���� ����
	        while (i < j) {
	            while (arr[j] > pivot) j--;
	           
	            while (i < j && arr[i] <= pivot) i++;

	            tmp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = tmp;
	        }
	        
	        //���� ����
	        quickSort(arr, left, i - 1);
	        quickSort(arr, i + 1, right);
	    }
	}

}
