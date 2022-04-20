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
     
	private static void maximum(char arr[]){
		int c[]=new int[26];
		for(int i=0;i<26;i++)
			c[i]=0;
		for(int i=0;i<arr.length;i++) {
			int pos= arr[i]-97;
			c[pos]++;
		}
		int max=0;
		char ans='a';
		for(int i=0;i<26;i++) {
			if(c[i]>max) {
				max=c[i];
				ans=(char)(97+c[i]);
			}
		}
		
		if(max==1)
			System.out.println("No dublicate element present");
		else 
			System.out.println(ans+" - "+max);
		
	}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0) {
			int n=s.nextInt();
			
			char arr[]=new char[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.next().charAt(0);
			}
			maximum(arr);
			
			
		}
	}

}
