#include<iostream>
using namespace std;
float calc_weight(float mass, float g=9.8)
{
	float weight=mass*g;
	return weight;
}

int main()
{
	float mass;
	cout<<"Enter the mass of the object : ";
	cin>>mass;
	float weight= calc_weight(mass);
	cout<<"The weight of the object is :"<<weight<<endl;
}
