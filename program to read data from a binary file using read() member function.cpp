#include<iostream>
#include<fstream>
using namespace std;
class student
{
	public:
		int roll;
		char name[20];
		char address[20];
		
};
 int main()
{
	student s;
	ifstream fin;
	fin.open("student.txt");
	fin.read((char*)&fin,sizeof(fin));
	cout<<"roll:"<<s.roll<<endl;
	cout<<"name:"<<s.name<<endl;
	cout<<"address:"<<s.address<<endl;
    fin.close();
    cout<<"Reading complete :"<<endl;
    return 0;
}


