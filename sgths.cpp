#include<iostream>
using namespace std;
class student 
{
	 int roll_number;
	  public :
	  	void get_roll_number(int);
	  	void put_roll_number(void); //giving not receiving anything 
};
 void student :: get_roll_number(int a)
 {
 	 roll_number=a;
 	 
 }
  void student :: put_roll_number()
  {
  	 cout<<"the roll_number of this boy in his class is : "<<roll_number<<endl;
  }
   class test : public student //first level derivation 
   {
   	 protected : 
   	 float sub1;
   	 public:
   	 	float sub2;
   	 	void get_marks(float , float );
   	 	void put_marks(void);
   };
    void test :: get_marks(float x, float y)
    {
    	sub1=x;
    	 sub2=y;
	}
	 void test :: put_marks()
	 {
	 	 cout<<"marks in sub1="<<sub1<<"\n";
	 	 cout<<"marks in sub2="<<sub2<<"\n";	 
	 }
	  class result : public test //second level derivation 
	  {
	  	 float total ;
	  	 public :
	  	 	void display(void);
	  };
	   void result :: display(void )
	   {
	   	 total =sub1+sub2;
	   	 put_roll_number();
	   	 put_marks();
	   	 cout<<"total="<<total<<"\n";
	   }
	   
int main()
{
	result student1; //student 1 created 
	student1.get_roll_number(112);
	student1.get_marks(98.67,34.54);
	student1.display();
	return 0;
}
