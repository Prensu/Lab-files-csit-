#include<iostream>
using namespace std;
int count =0;

void InsertionSort(int A[],int n)
{
    int key;
    int j;
    for(int i=1;i<=n-1;i++)
    {
        key =A[i];
    
        for(j=i-1;A[j]>key && j>=0;j--)
        {
            A[j+1] =A[j];
            count += 7;
        }
        A[j+1] = key;
            count += 7;
    }

}


int main()
{
    int a[] = {55,42,45,6,7,4,78,390,55,88,760,45,50,21,34,46,67,88};
    int n = sizeof(a)/sizeof(int);
    
    cout<<"Before sorting :\n";
    for(int i =0 ;i<n;i++)
    {
        cout<<a[i]<< "\t";
        
    }
     InsertionSort(a,n);
    
    cout<<"\nAfter sorting :\n";
    for(int i =0 ;i<n;i++)
    {
        cout<<a[i]<< "\t";
        
    }
    
    cout<<"\nRequired Number of steps for "<< n << " sized Data: "<<count;
    return 0;
}