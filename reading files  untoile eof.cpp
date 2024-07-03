
#include<fstream>
#include<iostream>
using namespace std;
int main()
{
   ifstream in ;
   string st;
   in.open("student.txt");
   //giving output to string lines until eof 
   while(in.eof()==0) 
   {
   	 getline(in,st);
   	 
   	 cout<<st<<endl;
   
   }
   return 0;
}
