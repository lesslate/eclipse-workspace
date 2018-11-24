
public class Sum {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		int oddsum=0;
		int evensum=0;
		
		for(int i:arr) 
		{
			System.out.print(i+" ");
			sum+=arr[i-1];
		}
		System.out.println(sum);
		
		for(int j=0; j<arr.length;  j++)
		{
			if(arr[j]%2!=0) 
			{
				System.out.print(arr[j]+" ");
				oddsum+=arr[j];
			}
		}
		System.out.println(oddsum);
		for(int j=0; j<arr.length;  j++)
		{
			if(arr[j]%2==0) 
			{
				System.out.print(arr[j]+" ");
				evensum+=arr[j];
			}
		}
		System.out.println(evensum);
		
		
	}

}
