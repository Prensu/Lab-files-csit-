#include<iostream>
#include<fstream>
using namespace std;
 int main()
 {
    ifstream fin;
    char str[80];
    fin.open("G:\\sample60.txt");
    fin.getline(str,79);
    cout<<"reading contents from the file:\n"<<str<<endl;
    return 0;
 }