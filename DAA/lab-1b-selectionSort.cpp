#include<iostream>
using namespace std;
int count = 0;

void SelectionSort(int A[],int n)
{
    for(int i=0;i<n;i++)
    {
        int least =A[i];
        int loc =i;
        
        for(int j=i+1;j<n;j++)
        {
            if(A[j]<least)
            {
                least = A[j];
                loc =j;                
            }
            
            count =count+6;
            
        }
        A[loc] = A[i];
        A[i] =least;
        count = count+8;
    }    
}

int main()
{
    
int a[] = {336,35,66,5,6,33,55,26,87,24,48,220,24,40,56,45,32,12,1,2};


int n= sizeof(a)/sizeof(int);

cout<<"Before sorting: \n";
   for(int i=0 ;i<n ;i++)
        {
    cout<<a[i]<<"\t" ;    
        }
        
    cout<<endl;
    
SelectionSort(a,n);

cout<<"After sorting: \n";
 for(int i=0 ;i<n ;i++)
        {
    cout<<a[i]<<"\t" ;
        }
cout<<endl;        
cout<<"No. of Steps required for "<<n<<" size array is "<<count;        
        
return 0;

}

