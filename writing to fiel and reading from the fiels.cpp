#include<iostream>
#include<fstream>
using namespace std;
int main()
{
	//opening files using constructor and writing it 
	//string st="Harry bhai ";
	string st2;
	 //ofstream out("student.txt");
	 //out<<st;
	 
	 //opening files using constructor and reading it 
	 ifstream in("student.txt");
	 getline(in,st2);
	 cout<<st2;
	 
	 return 0;
}
