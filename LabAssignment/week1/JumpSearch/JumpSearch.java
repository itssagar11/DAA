import java.util.*;
public class JumpSearch {
	public static boolean jumpSearch(int[]arr,int k) {
		int m= (int) Math.sqrt(arr.length);
		int prev=0;
		while(arr[m]<k && m<arr.length) {
			prev= m;
			m+= Math.sqrt(arr.length);
			if(m>arr.length) {
				return false;
			}
		}
		while(prev<arr.length) {
			if(arr[prev]==k) {
				return true;
			}
			prev++;
		}
		
		return false;
	}

	public static void main(String args[]) {
		
		int t;
		Scanner s= new Scanner(System.in);
		t=s.nextInt();
		while(t>0) {
			int n;
			n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			int k= s.nextInt();
			
			if(jumpSearch(arr,k))
			System.out.print("Present");
			else
				System.out.println("Not Present");
		}
	
				
	}

}
