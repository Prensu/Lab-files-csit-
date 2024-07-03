#include<iostream>
using namespace std;
class code
  {
  	 int id;
  	 public:
  	 	 code(){};
  	 	 code(int a ){
  	 	 	 id =a;
				 	}
		code(code &x)
		{
			id=x.id;
		}
	void display()
	{
		cout<<id;
				  }		 	 
  };
  
int main()
{
   	 code A(100); //object A is created and initialized 
   	 code B(A); //copy constructor called 
   	 code C=A; //copy constructor called again 
   	  code D; //D is created , not initialized 
   	  D=A;  //copy constructor not called 
   	  cout<<" \n The id of A is : "; A.display();
   	  cout<<" \n The id of B is : " ;B.display();
   	  cout<<" \n The id of c is  :"; C.display();
   	  cout<<" \n The id of D is : "; D.display();
   	   return 0;
   }
