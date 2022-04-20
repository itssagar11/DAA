import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void common(int[]arr1,int arr2[]) {
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
			}else if(arr1[i]<arr2[j])
				i++;
			else
				j++;
				
		}
	}
	
	
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int m=s.nextInt();
			int arr[]=new int[m];
			for(int i=0;i<m;i++) {
				arr[i]=s.nextInt();
			}
			int n=s.nextInt();
			int arr2[]=new int[n];
			for(int i=0;i<n;i++) {
				arr2[i]=s.nextInt();
			}
			Arrays.sort(arr);
			Arrays.sort(arr2);
			
			common(arr,arr2);
			
			
		
	}

}
