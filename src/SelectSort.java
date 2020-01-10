
public class SelectSort {
	public static void selectSort(int[] arr)
	{
		if(arr==null||arr.length<2)
			return;
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				
				minIndex=(arr[minIndex]>arr[j])?j:minIndex;
			}
			swap(arr,i,minIndex);
		}
	}
	
	
	public static void swap(int[] arr,int i,int j)
	{
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		return ;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,5,4,6,8,4,1};
		SelectSort.selectSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
