package com.core.array;
//Sorting an Array(Decending)
class SortArray 
{
	public static void main(String[] args) 
	{
		int array[]={65,10,57,98,105,304};
		int i,j;
		int temp;
		int arraylength=array.length;
		for(i=0;i<(arraylength-1);i++)
		{
			for(j=(i+1);j<arraylength;j++)
			{
				if(array[i]<array[j])
				{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				}
			}
		}
	
	for(i=0;i<arraylength;i++)
	{
		System.out.print(array[i]+"\t");
	}
}
}
