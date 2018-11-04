package merge;



public class MergeSort{ 
	
	//�պ� ����
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
		
		//����Ʈ �պ�
		while(i<=mid && j<=right) 
		{
			if(list[i]<=list[j])
				sorted[k]=list[i++];
			else
				sorted[k]=list[j++];
			k++;
		}
		//���� ������ �迭 ��� ����
		if(i>mid)
		{
			for(l=j; l<=right; l++,k++)
				sorted[k]=list[l];
		}
		//���� ���ʹ迭 ��ü����
		else
		{
			for(l=i; l<=mid; l++,k++)
				sorted[k]=list[l];
		}
		
		//�ӽ� �迭 ����Ʈ�� ���� ����Ʈ�� ����
		for(l=left; l<=right; l++)
			list[l]=sorted[l];
		
		
		System.out.print("�պ�����>>");
		for(int w=0; w<list.length; w++)
		{
			System.out.print(list[w]+" ");
		}
		System.out.println("");	
	}
	
}
