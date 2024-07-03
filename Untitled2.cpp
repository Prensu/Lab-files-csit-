#include<iostream>
using namespace std;
class ABC; //Forward declaration 

class XYZ
{
	 int data;
	 public : 

	 void setvalue(int value )
	 {
	 	 data=value;	 
	 }
	friend  void add (ABC,XYZ); 
};

void add(ABC obj1, XYZ obj2)
{
	 cout<<"the sum of two data of classes using friend function is "<<obj1.data+obj2.data<<endl;
		  
}

int main()
{
	 XYZ x;
	 ABC a;
	 x.setvalue(56);
	 a.setvalue(44);
	 add(a,x);
	 return 0;
}

