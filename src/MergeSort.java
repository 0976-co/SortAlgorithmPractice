
public class MergeSort {
	
	public static void mergeSort(int[] arr)
	{
		if(arr==null||arr.length<2)
			return;
		sortProcess(arr,0,arr.length-1);
	}
	
	public static void sortProcess(int[]arr,int L,int R)
	{
		if(L==R)
		{
			return;
		}
		int mid=L+((R-L)>>1);  //mid=L+(R-L)>>1;  在18行会出现栈越界异常！！注意运算符优先级
		sortProcess(arr,L,mid);
		sortProcess(arr,mid+1,R);
		merge(arr,L,mid,R);
	}
	
	public static void merge(int[] arr,int L,int mid,int R)
	{
		int[] help=new int[R-L+1];
		int p1=L;
		int p2=mid+1;
		int i=0;
		while(p1<=mid && p2<=R)
		{
			help[i++]=(arr[p1]<arr[p2])?arr[p1++]:arr[p2++];
		}
		while(p1<=mid)
		{
			help[i++]=arr[p1++];
		}
		while(p2<=R)
		{
			help[i++]=arr[p2++];
		}
		
		for(int j=0;j<=help.length-1;j++)
		{
			arr[L+j]=help[j];          //arr[j]=help[j];   ×！注意起始坐标为L;
		}
		return;
	}
	
	public static void main(String[] args)
	{
		int[]arr= {1,6,5,8,3,6,4,8,9,7,0,52,42,36,45};
		MergeSort ms=new MergeSort();
		ms.mergeSort(arr);
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
