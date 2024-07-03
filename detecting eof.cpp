#include<iostream>
#include<fstream>
using namespace std;
int main()
{
    ifstream fin;
    char ch;
    fin.open("sample60.txt");
    while(fin)
    {
        fin.get(ch);
        cout<<ch;
    }
    return 0;
}
