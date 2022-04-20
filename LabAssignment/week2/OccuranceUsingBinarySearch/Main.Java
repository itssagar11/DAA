
public class Main {
	public static int binarySearch(int arr[],int k,int start,int end) {
	
		if(start<=end) {
		int mid= start+(end-start)/2;
		if(arr[mid]==k)
			return mid;
		if(arr[mid]>k)
			return binarySearch(arr,k,start,mid-1);
		else
			return binarySearch(arr,k,mid+1,end);
		}
		return -1;
	}
	
	public static void occurnce(int arr[],int start,int end,int key) {
		int first= binarySearch(arr,key,start,end);
		int last=first;
		//System.out.println(last);
		if(first==-1) {
			System.out.println("element Not Found");
			return;
		}
		int temp=0;
		while(temp>-1) {
			 temp=binarySearch(arr,key,start,first-1);
			first=temp>(-1)?temp:first;
			
			
		}
		temp=0;
		while(temp>-1) {
			 temp=binarySearch(arr,key,last+1,end);
			 System.out.println(temp);
			if(temp!=-1)
				last=temp;
			
			
		}
		System.out.print("Element present and No of occerence is: "+((last-first)+1));
	}
	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=20;
		arr[3]=20;
		arr[4]=23;
		occurnce(arr,0,4,20);

	}

}
