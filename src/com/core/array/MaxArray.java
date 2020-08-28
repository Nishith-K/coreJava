package com.core.array;
//Maximum element

class MaxArray
{


public static void main(String args[])
	{
	int arr[]={70,378,5,6,1,200,100};
//	MaxArray mm=new MaxArray();
	
	int maximum=arr[0];

	for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maximum)
			{
				maximum=arr[i];
			}
		}

		System.out.println("Maximum element is-->"+maximum);
	}
}