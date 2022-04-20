import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	public static boolean dublicate(int arr[]) {
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]==arr[i]) return true;
		}
		return false;
			
		
		
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
			System.out.println(dublicate(arr));
			
		}
	}

}
