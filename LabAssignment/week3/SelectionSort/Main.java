import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	public static void selectionSort(int arr[]) {
		int comp=0,shift=0,flag=0;
		for(int i=0;i<arr.length;i++) {
			flag=0;
			int min= i;
			int j=i+1;
			for(;j<arr.length;j++) {
				comp++;
				if(arr[min]>arr[j]) {
					flag=1;
					min=j;
				}
					
			}
			
				swap(arr,min,i);
				shift++;
			
			
			
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("comparisions = "+comp);
		System.out.println("shifts = "+shift);
		
		
	}
	
	

	private static void swap(int[] arr, int min, int i) {
		// TODO Auto-generated method stub
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
		
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
			selectionSort(arr);
			
		}
	}

}
