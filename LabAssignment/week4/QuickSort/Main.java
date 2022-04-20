import java.util.Random;
import java.util.Scanner;

public class Main {
	static int swap;
	static int cmp;
	static void random(int arr[],int low,int high)
    {
     
        Random rand= new Random();
        int pivot = rand.nextInt(high-low)+low;
         
        int temp1=arr[pivot]; 
        arr[pivot]=arr[high];
        arr[high]=temp1;
    }
     
	private static int partition(int arr[],int low,int high){
		random(arr,low,high);
		int pivot= high;
		int i=low;
		int j=high-1;
		while(j>=i) {
			while(i<high && arr[i]<=arr[pivot]) {cmp++;i++;}
			while(j>=0 && arr[j]>arr[pivot]) {cmp++;j--;}
			if(i<j) {
				swap(arr,i,j);
				swap++;
			}
			
		}
		swap++;
		swap(arr,j+1,pivot);
		return j+1	;
		
	}
	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void quickSort(int[]arr,int s,int e) {
		
		if(s<e) {
			int pivot=partition(arr,s,e);
			quickSort(arr,s,pivot-1);
			quickSort(arr,pivot+1,e);
			
		}
		
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
			quickSort(arr,0,n-1);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println("comparision = "+cmp);
			System.out.println("swap = "+swap);
			
		}
	}

}
