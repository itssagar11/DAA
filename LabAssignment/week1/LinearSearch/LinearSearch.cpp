

#include<bits/stdc++.h>
#include<iostream>
#define faster               ios :: sync_with_stdio(0); cin.tie(0); cout.tie(0);
#define ll                   long long int
using namespace std;

void Solve(){
           ll n,d;
           cin>>n>>d;
           int arr[n];
           for(int i=0;i<n;i++){
            cin>>arr[i];
           }
          sort(arr,arr+n);
          ll ans=0;
          for(int i=0;i<n-1;i+=2){
          	if(arr[i+1]-arr[i]<=d) ans++;
          }
            cout<<ans<<endl;

}
int main()
{
    faster;

   int TC;

    cin >> TC;

    while(TC--){
         Solve();
    }

    return 0;
}