#Intially user will give a array.In the array if the element size is even, print the element.
import java.util.*;
class problem2
{
	public static void main(String[] args) 
	{
	
		int []a={42,564,5775,34,123,454,1,5,45,3556,23442};
		System.out.println(Arrays.toString(a));
		
		for (int i=0;i<a.length ;i++ )
		{
			int count=0;
		    int num;
			num = a[i];
			while (num>0)
			{
				num=num/10;
				count++;
			}
			
			if (count%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
