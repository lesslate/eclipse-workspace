package merge;

public class MergeSortTest {

	public static void main(String[] args) {
		int[] list = {20,10,5,30,7,44,32,13};
		MergeSort.mergeSort(list, 0, list.length-1);
		
		for (int i=0; i<list.length; i++)
		{
			System.out.print(list[i]+" ");
		}



	}

}
