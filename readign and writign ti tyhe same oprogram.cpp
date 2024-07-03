#include<fstream>
#include<iostream>
using namespace std;
 int main()
 {
 	//connecting our file with hout stream
 	ofstream hout("student.txt");
 	//creating a name string variable and filling it with string entered by user
 	string name;
 	cout<<"Enter your name :";
 	cin>>name;
 	
 	//writing a string to the file
 	hout<<name<<" this is my scientific name ";
 	 //disconnecting out file
 	 hout.close();
 	//connecting our file with hin stream 
 	ifstream hin("student.txt");
 	//creating a content string variable and filling it with string present there in the text
 	string content;
 	hin>>content;
 	cout<<"the content of this file is :"<<content;
 	 //disconnecting our file
 	 hin.close();
 	 return 0;
 	 
 }
