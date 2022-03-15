          
      //“Saraswati Namasthubhyam Varade Kamarupini Vidhyarambam Karishyami Siddhir Bavathume Sadha”
            // @sagar Bisht

#include<bits/stdc++.h>
#include<iostream>
#define faster               ios :: sync_with_stdio(0); cin.tie(0); cout.tie(0);
#define ll                   long long int
using namespace std;

void Solve(){
           ll n,k;
           cin>>n;
           int arr[n];
           for(int i=0;i<n;i++){
            cin>>arr[i];
           }
           cin>>k;
           ll steps=0;
           for(int i=0;i<n;i++){
            steps++;
            if(arr[i]==k){
              cout<<"Present "<<steps<<endl;
              return;
            }
           }
           cout<<"Not Present "<<steps<<endl;
            

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