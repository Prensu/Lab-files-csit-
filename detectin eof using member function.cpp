#include<iostream>
#include<fstream.h>
using namespace std;
int main()
{
    ifstream fin;
    char ch;
    fin.open("sample60.txt");
    while(fin)
    {
        fin.getline(ch);
        cout<<ch;
    }
    return 0;
}