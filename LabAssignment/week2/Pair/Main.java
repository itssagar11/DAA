import java.util.Arrays;
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
	
	public static int pair(int arr[],int k) {
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int val= arr[i]+k;
			int j= binarySearch(arr,val,i+1,arr.length-1);
			if(j!=-1)
				count++;
			
		}
		return count;
		
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
			int k=s.nextInt();
			System.out.println(pair(arr,k));
			
		}
	}

}
