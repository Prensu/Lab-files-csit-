#include<iostream>
using namespace std;
void divide(int x, int y, int z)
{
	cout<<"\n we are inside the function \n";
	if((x-y)!=0)
	{
		int R = z/(x-y);
		cout<<"result ="<<R<<"\n";
	}
	else 
	{
		 throw(x-y);
		 
	}
}
 int main()
 {
    try 
    {
    	cout<<"We are inside the try block \n";
    	divide(10,20,30); //invoke divide 
    	divide(10,10,20); //invoke divide 
	}
	 catch(int i)
	 {
	 	cout<<"caught the exception ";
	 }
	return 0;
 }
