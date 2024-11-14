#include<iostream>
using namespace std;
int count = 0;
#define N 15

void BubbleSort(int A[],int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-1;j++)
        {
            if(A[j]>A[j+1])
            {
                int t= A[j];
                A[j]=A[j+1];
                A[j+1]=t;
                
            }
            
            count =count+8;
            
        }
        count = count+4;
    }    
}

int main()
{
    
int a[N] = {};



cout<<"Before sorting: \n";
   for(int i=0 ;i<N ;i++)
        {
    cout<<a[i]<<"\t" ;
    
    
        }
        
    cout<<endl;
    
BubbleSort(a,N);

cout<<"After sorting: \n";
 for(int i=0 ;i<N ;i++)
        {
    cout<<a[i]<<"\t" ;
        }
cout<<endl;
cout<<"size of array is : "<<N;cout<<endl;       
cout<<"No. of Steps required : "<<count;        
        
return 0;

}