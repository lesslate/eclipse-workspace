
public class heapsort 
{
	
	public static void main(String[] args) {
		int arr[] = { 5, 2, 1, 7, 112, 42, 52, 62 };
		heapSort(arr);
		printArray(arr);
	}
	private static void heapSort(int[] arr) {
		// TODO Auto-generated method stub
		int length = arr.length - 1;
		maxHeapBuild(arr);
		for (int i = length; i >= 1; i--) {
			swap(arr, 0, i);
			length-=1;
			maxHeapify(arr, 0);
		}
	}
	private static void maxHeapBuild(int[] arr) {
		int length = arr.length;
		// ������ ����� �θ� ��忡������ ����
		for (int i = length / 2; i >= 0; i--) {
			maxHeapify(arr, i);
		}
	}
	private static void maxHeapify(int[] arr, int i) {
		int length = arr.length;
		int leftChild = i*2;
		int rightChild = (i*2)+1;
		int k = 0;
		//�ڽ� ��尡 ���� ��쿡�� �����Ѵ�.
		if(leftChild > length || rightChild > length) {
			return;
		}
		//�� ū Child�� k�� �Ҵ��Ѵ�.
		if (arr[leftChild] > arr[rightChild]) {
			k = leftChild;
		} else {
			k = rightChild;
		}
		//�θ� ��尡 �ڽĺ��� ū ��� ��
		if (arr[i] >= arr[k]) {
			return;
		}
		//swap
		swap(arr, i, k);
		maxHeapify(arr, k);
	}
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
