#include <iostream>
#include <conio.h>
#include <iomanip>
using namespace std;
int observed[20], i, Expected, N = 0;
float Calculation[20], final = 0.0;

void calculation(int n) // calculation of N(total frequency), Calculation(((Oi-Ei)^2/Ei)),final(?)
{
	for (i = 0; i < n; i++)
	{
		N = N + observed[i];
	}
	Expected = N / n;
	for (i = 0; i < n; i++)
	{
		Calculation[i] = (float)((observed[i] - Expected) * (observed[i] - Expected)) / Expected;
		final = final + Calculation[i];
	}
}

void display(int n) // display in tabulated format
{
	cout << setw(5) << "S.No";
	cout << setw(5) << "Oi";
	cout << setw(5) << "Ei";
	cout << setw(22) << "((Oi-Ei)*(Oi-Ei))/Ei" << endl;
	for (i = 0; i < n; i++)
	{
		cout << setw(5) << i + 1;
		cout << setw(5) << observed[i];
		cout << setw(5) << Expected;
		cout << setw(10) << setprecision(2) << Calculation[i] << endl;
	}
	cout << "--------------------------------------" << endl;
	cout << setw(10) << N;
	cout << setw(15) << final;
	cout << endl;
}

int main()
{
	int n;
	float critical;
	printf("Its pReNsu!CHi square test\n");
	cout << "Enter how many numbers: " << endl;
	cin >> n;

	for (i = 0; i < n; i++)
	{
		if (i == 0)
		{
			cout << "Enter observed frequency of " << i + 1 << "st number: ";
			cin >> observed[i];
			continue;
		}
		if (i == 1)
		{
			cout << "Enter observed frequency of " << i + 1 << "nd number: ";
			cin >> observed[i];
			continue;
		}
		if (i == 2)
		{
			cout << "Enter observed frequency of " << i + 1 << "rd number: ";
			cin >> observed[i];
			continue;
		}
		cout << "Enter observed frequency of " << i + 1 << "th number: ";
		cin >> observed[i];
	}

	calculation(n);
	display(n);

	cout << "Enter the critical value: ";
	cin >> critical;
	if (final < critical)
	{
		cout << "Since " << final << " < " << critical << "  ,Null hypothesis is accepted. The numbers are uniformly distributed." << endl;
	}
	else
	{
		cout << "Since " << final << " > " << critical << " ,Null hypothesis is rejected. The numbers are not uniformly distributed." << endl;
	}
	return (0);
}
