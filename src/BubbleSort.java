
public class BubbleSort {
	
	public static void bubbleSort(int[] arr)
	{
		if(arr==null||arr.length<2)
			return ;
		
		for(int end=arr.length-1;end>=0;end--)
		{
			for(int i=0;i<end;i++)
			{
				if(arr[i]>arr[i+1])
					swap(arr,i,i+1);
			}
		}
	}
	
	public static void swap(int[] arr,int i,int j)
	{
		int temp=0;
		temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		return;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,5,6,7,9,10,5,3};
		BubbleSort.bubbleSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
