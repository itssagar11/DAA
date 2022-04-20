import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int swap;
	static int cmp;
	
	private static void pair(int arr[],int k){
		
			Arrays.sort(arr);
			int i=0;
			int j=arr.length-1;
			while(i<j) {
				int t=(arr[i]+arr[j]);
				//System.out.println("No Such Eldweement Exist"+i+" "+j+" "+t);
				 if(t>k)
					j--;
				else if(t<k)
					i++;
				else {
					System.out.println(arr[i]+" "+arr[j]);
					return;
				}
						
			}
			System.out.println("No Such Element Exist");
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
			pair(arr,k);
			
			
		}
	}

}
