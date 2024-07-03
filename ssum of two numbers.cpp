#include<iostream>
using namespace std;
 class sum
 {
 	int a,b;
 	public:
 		void add()
 		{
 			int result = a+b;
 			
		 }
		  void display();
		  
 };
 
  void sum :: display()
  {
  
		  	cout<<"the result of this sum is : "<<result<<endl;
		  
  }
 int main()
 {
 	sum s;
 	s.add();
 	s.display();
 	cout<<"the result of this is : "<<result<<endl;
 	return 0;
 	
 }
