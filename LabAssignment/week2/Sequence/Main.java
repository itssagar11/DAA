import java.util.Scanner;

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
	
	public static void triplets(int arr[]) {
		for(int i=2;i<arr.length;i++) {
			int j=i-1;
			while(j>=0) {
				int val=(arr[i]-arr[j]);
				int k= binarySearch(arr,val,0,j-1);
				if(k!=-1) {
					System.out.println(i+","+j+","+k);
					return;
				}
				j--;
			}
		}
		System.out.println("No Sequence Found");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0) {
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			triplets(arr);
			
		}
	}

}
