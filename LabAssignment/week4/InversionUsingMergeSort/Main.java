import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	private static int merge(int arr[],int l,int m,int r) {
		int inversion=0;
		int n1= m-l+1;
        int n2= r-m;
         int t1[]=new int[n1];
         int t2[]=new int[n2];
          for(int it=0;it<n1;it++){
             t1[it]=arr[l+it];
         }
         for(int it=0;it<n2;it++){
             t2[it]=arr[m+1+it];
         }
         int i=0;
         int j=0;
        int  k=l;
         while(i<n1 && j<n2){
        	 comp++;
             if(t1[i]<=t2[j]){
                 arr[k]=t1[i];
                 i++;
             }else{
            	 inversion+= (n1-i);
                 arr[k]=t2[j];
                 j++;
             }
             k++;
         }
         while(i<n1){
             arr[k]=t1[i];
             i++;
             k++;
         }
         while(j<n2){
             arr[k]=t2[j];
             j++;k++;
         }
        
		
		return inversion;
		
		
	}
	static int comp;
	public static int mergeSort(int[]arr,int s,int e) {
		int inv=0;
		if(s<e) {
			int mid= s+(e-s)/2;
			inv+=mergeSort(arr,s,mid);
			inv+=mergeSort(arr,mid+1,e);
			inv+=merge(arr,s,mid,e);
		}
			
		
		return inv;
		
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
			int in=mergeSort(arr,0,n-1);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println("comparision = "+comp);
			System.out.println("inversion = "+in);
			
		}
	}

}
