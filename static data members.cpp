#include<iostream>
using namespace std;
class item
{
	static int count;
	int number;
	public:
		void getdata(int a) 
		{
			number=a;
			count++;
		}
	void getcount(void)
	{
		cout<<"   count  = ";
		cout<<count <<"\n";
		}	
};

int item :: count;

 int main()
 {
 	 item a,b,c; //count is initialized to zero 
 	 a.getcount();
 	 b.getcount();
 	 c.getcount();
 	 
 	 a.getdata(100); //getting data into object A
 	 b.getdata(200); //getting data into object B
 	 c.getdata(300); //getting data into object C
 	 
 	 cout<<"After reading data "<<"\n";
 	 
 	 a.getcount();
 	  b.getcount();
 	   c.getcount();
 	    a.getcount();
 	 return 0;
 }
