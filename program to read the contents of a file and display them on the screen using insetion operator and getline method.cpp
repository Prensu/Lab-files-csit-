#include<iostream>
#include<fstream>
using namespace std;
int main()
{
	ifstream fin;
	char str[100];
	fin.open("sample60.txt");
	while(!fin.eof())
	{
		fin.getline(str,79);
		cout<<str<<endl;
	}
	return 0;
}
