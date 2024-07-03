#include<iostream>
using namespace std;
class distance 
{
	private:
		int feet;
		 int inch;
		 public:
		  distance(int f, int i)
		 	{
		 		feet=f;
		 		inch=i;
		 		
			 }
distance(float m)
{
	feet=int(m);
	inch=12*(m-feet);
	 
	 }
	 
	 void display()
	 {
	 	cout<<"feet = "<<feet<<endl<<"inch="<<inch;
				  }			 
			 
};
 int main()
 {
 	float f=2.5;
 	distance d(2.5);
 	d.display();
	 return 0;
 }
