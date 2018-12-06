package Comparators;

public class Sort
{
	// since this is public STATIC, no need to create an instance of Sort
	// but use Sort.bubbleSort(z) to use
	
	public static <T extends Comparable<T>> void bubbleSort(T[] a)
	{
		for(int i = 0; i < a.length - 1; i++)
		{
			for(int j = 0; j < a.length - 1 - i; j++)
			{
				if(a[j+1].compareTo(a[j]) < 0)
				{
					T tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
	}
}

