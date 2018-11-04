package merge;



public class MergeSort{ 
	
	//합병 정렬
	public static void mergeSort(int[] list,int left,int right) 
	{
		int mid;
		if(left<right) 
		{
			mid = (left+right)/2;
			mergeSort(list,left,mid);
			mergeSort(list,mid+1,right);
			merge(list,left,mid,right);
		}
	}
	
	public static void merge(int[] list , int left , int mid , int right)
	{
		int[] sorted = new int[20];
		int i,j,k,l;
		
		i=left;
		j=mid+1;
		k=left;
		
		//리스트 합병
		while(i<=mid && j<=right) 
		{
			if(list[i]<=list[j])
				sorted[k]=list[i++];
			else
				sorted[k]=list[j++];
			k++;
		}
		//남은 오른쪽 배열 모두 복사
		if(i>mid)
		{
			for(l=j; l<=right; l++,k++)
				sorted[k]=list[l];
		}
		//남은 왼쪽배열 전체복사
		else
		{
			for(l=i; l<=mid; l++,k++)
				sorted[k]=list[l];
		}
		
		//임시 배열 리스트를 원래 리스트로 복사
		for(l=left; l<=right; l++)
			list[l]=sorted[l];
		
		
		System.out.print("합병정렬>>");
		for(int w=0; w<list.length; w++)
		{
			System.out.print(list[w]+" ");
		}
		System.out.println("");	
	}
	
}
