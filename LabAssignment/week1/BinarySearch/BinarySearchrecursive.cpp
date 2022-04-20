#include<iostream>
using namespace std;
bool binarySearch(int arr[],int k,int s,int e,int*c){
	if(s>e){
	return false;
	}
	(*c)++;
	int mid= (s+(e-s))/2;
	
	if(arr[mid]==k)
	return true;
	else if(arr[mid]>k){
		return binarySearch(arr,k,s,mid-1,c);
	}else
		return binarySearch(arr,k,mid+1,e,c);
	
}
int main(){
	int t
	cin>>t;
	while(t--){
		int n,k;
		cin>>n>>k;
		int arr[n];
		for(int i=0;i<n;i++){
			cin>>arr[i];
		}
		int s=0;
		int l=n-1;
		int c=0;
		bool ans=binarySearch(arr,k,s,l,&c);
		if(ans==true){
			cout<<"found after "<<c<<"comparasion"<<endl;
		}else{
			cout<<"Not found"<<endl;
		}
	}
	
	return 0;
}

