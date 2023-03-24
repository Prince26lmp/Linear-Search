package JavaDSA;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int search_element=60;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search_element)
			{
				System.out.println("Element Found At Index "+i);
				flag=true;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Element Not Found");
		}
		
		

	}

}
