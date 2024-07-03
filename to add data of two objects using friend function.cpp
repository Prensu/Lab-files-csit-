#include<iostream>
using namespace std;
class ABC; //forward declaration 

class XYZ
{
	public:
	 int data;
	 
	 	 void setvalue(int value)
	 	 {
	 	 	 data=value;
		  }
	friend void add(XYZ,ABC); 
};

class ABC
{
	 int data;
	 public:
	 	void setvalue(int value)
	 	{
	 		data=value;
	 		
		 }
		 	friend void add(XYZ,ABC); 
};		 
	
		
		void add(XYZ obj1 , ABC obj2)
		{
			 cout <<"sum of data values of xyz and abc objects by using the friend function  is "<<obj1.data+obj2.data<<endl;
		}
 int main()
 {
 	XYZ x;
 	ABC a;
 	x.setvalue(56);
 	a.setvalue(44);
 	add(x,a);
 	return 0;
 }
