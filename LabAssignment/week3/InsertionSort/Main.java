import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	public static void insertionSort(int arr[]) {
		int comp=0,shift=0;
		for(int i=1;i<arr.length;i++) {
			int cv=arr[i];
			int j=i-1;
			int flag=0;
			while(j>=0 && arr[j]>cv) {
				flag=1;
					comp++;
					arr[j+1]=arr[j];
					shift++;
					j--;
				
			}
			if(flag==1) {
				arr[j+1]=cv;
				shift++;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("comparisions = "+comp);
		System.out.println("shifts = "+shift);
		
		
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
			insertionSort(arr);
			
		}
	}

}
