#include<iostream>
#include<fstream>
using namespace std;
class student
{
	 public:
	 	int rollno;
	 	char name[20];
	 	char address[20];
	 	
};
int  main()
{
	student s;
	ofstream fout;
	fout.open("student.txt");
	cout<<"Enter rollno :";
	cin>>s.rollno;
	cout<<"Enter name :";
	cin>>s.name;
	cout<<"Enter address :";
	cin>>s.address;
    fout.write((char*)&fout,sizeof(fout)); 
	fout.close();
	cout<<"writing complete"<<endl;
	return 0;
}
