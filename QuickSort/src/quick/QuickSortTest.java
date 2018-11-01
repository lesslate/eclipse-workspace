package quick;

public class QuickSortTest {

	public static void main(String[] args) {
		int[] arr = { 25, 6, 33, 20, 10, 3, 15 };
		QuickSort quick = new QuickSort();
		
		quick.quickSort(arr,0,6);
		System.out.println("정렬 결과");

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}


