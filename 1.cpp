#include <iostream>
using namespace std; 

// Defining enum Year 
enum year { Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec }; 
enum week { Mon,Tue,Wed,Thr,Fri,Sat,Sun };
int main() 
{ 
	int i; 
	int j;
	int k;

	{for (i = Jan; i <= Dec; i++) 
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

