
public class InsertSort {
	
	public static void insertSort(int[] arr)
	{
		if(arr==null||arr.length<2)
			return;
		
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i;j>=1;j--)
			{
				if(arr[j]<arr[j-1])
					swap(arr,j,j-1);
			}
		}
	}
	
	public static void swap(int[]arr,int i,int j)
	{
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		return ;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {4,6,2,8,1,3,7,20,65,13};
		InsertSort.insertSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
