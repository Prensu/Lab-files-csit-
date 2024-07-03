#include<iostream>
using namespace std;
class rectangle 
{
	 int a,b;
	 public:
	 	rectangle(int x, int y)
	 	{
	 		a=x;
	 		b=y;
		 }
	 float get_x(){
	 	return a;
	 } 
	  float get_y()
	  {
	  	return b;
	  }
};

class polar
{
	 int radius, thita;
	 public:
	 	polar(rectangle r )
	 	{
	 		float  tempx=r.get_x();
	 		float  tempy=r.get_y();
		 }
	    
	radius=sqrt(tempx*tempx+tempy*tempy);
    theta= a tan(tempy/tempx);
		  
	
};
   void polar :: show()
   {
   	 cout<<"radius ="<<radius<<endl;
   	 cout<<"Theta is "<<theta*(180/3.14);
   }
 int main()
 {
 	 rectangle r(12,10);
 	 polar p(r);
 	 p.show();
 	 return 0;
     
 }
