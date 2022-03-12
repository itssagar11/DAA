#include<iostream>
using namespace std;
int main(){
	int n,k;
	cin>>n>>k;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	int s=0;
	int l=n-1;
	int comp=0;
	int flag=0;
	while(s<=l ){
		comp++;
		int mid= (s+(l-s))/2;
		if(arr[mid]==k){
			flag=1;
			break;
		}
		if(arr[mid]>k){
			l=mid-1;
		}else{
			s=mid+1;
		}
	}
	if(flag==1){
		cout<<"found after"<<comp<<"comparision"<<endl;
	}else{
		cout<<"Not found"<<endl;
	}
	return 0;
}

// 1 2 3 4 5   k=5
