#include<iostream>
#include<conio.h>
using namespace std;
class complex
{
	 int real , img ;
	 public :
	//i don't know how to  code and program but my school teaches absolute nothing i am goona be the fastest writer in the world with the average gpa in the academic career we have a youtube channel where we can accure different properties and accompish different tasks we are here to serve the guidance in the greater noida int yeast of the bayern munic baryen yo yo what happens next is quite amazing the red dot sign shows the number of flags in the academuic register 
	void getdata()
	{
		cout<<"Enter real and imaginary numbers "<<endl;
		cin>>real>>img;
	}
	
	void display()
	{
		cout<<"The real and imaginary numbers is "<<"("<<real<<"+"<<img<<"i"<<")"<<endl;
		
	}
	 complex add_complex(complex c )
	 {
	 	complex temp;
	 	temp.real=real+c.real;
	 	temp.img=img+c.img;
	 	return temp; 
		 }	 
};

int main()
{
	complex c1,c2,c3;
	c1.getdata();
	c2.getdata();
	c3=c2.add_complex(c1);
	cout<<"Addition =";
	c3.display();
	getch();
	return 0;
}
