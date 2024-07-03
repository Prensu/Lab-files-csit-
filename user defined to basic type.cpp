#include<iostream>
using namespace std;
class distance 
{
	private:
		int feet;
		 int inches;
		 public:
		 	distance(int f , int i)
		 	{
		 		feet=f;
		 		inches=i;
			 }
			  operator float()
			  {
			  	float a=(feet+inches)/12.0;
			  	return a;
			  }
};

int main()
{
	distance d(8,6);
	float x=(float)d;
	cout<<"x="<<x;
	return 0;
}
