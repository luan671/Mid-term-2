#include <iostream>
#include <D:\PLC\Mid-term 2\bits\stdc++.h>
using namespace std;


void StaticArray()
    {
    for (int i=0; i<100000; i++) 
        { 
            int Var[1000000];
        } 
    }

void HeapArray()
    {
    for (int i=0; i<100000; i++)
        {    
            int *intnode;           
            intnode = new int[1000000]; 
            delete intnode;
        }
    }

int main() 
{ 
    
    time_t start, end; 
    time(&start); 
    ios_base::sync_with_stdio(false); 
  
    StaticArray(); 
  
    time(&end); 

    double time_taken = double(end - start); 
    cout << "Time taken by program is : " << fixed 
         << time_taken << setprecision(5); 
    cout << " sec " << endl; 
    return 0; 
} 
//Static array overflew did not give any results (maybe overflew the memory?)
//Heap array took 7.00000 seconds
//Java can declaer huge arrays because when an array is declared in Java, only a reference of array is created withour creating or given any memory.