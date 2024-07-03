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
		fin>>str;
		cout<<str<<" ";
	}
	return 0;
}
