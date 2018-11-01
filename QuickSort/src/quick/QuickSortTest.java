package quick;

public class QuickSortTest {

	public static void main(String[] args) {
		int[] arr = { 100,200,500,25, 6, 33, 20, 10, 3, 15, };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		
		QuickSort.quickSort(arr,0,arr.length-1);
		System.out.println("\n정렬 결과");

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}


