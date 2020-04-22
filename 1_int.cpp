#include <iostream>
using namespace std;

int main() 
{ 
	int Jan = 1;
    int Dec = 12;
    int Sun = 7;
    int i; 
	int j;
	int k;
    {
    for (i = Jan; i <= Dec; i++)
		cout << i << " "; 

	cout << " \n";
 
	for (j = 1; j <= Dec; j++)
		cout << j << " "; 

	cout << " \n";

	for (k = Sun; k >= 0; k--)
		cout << k << " "; 

	cout << " \n";
    }
	return 0;
} 

