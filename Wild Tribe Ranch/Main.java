#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int a,b;
  cin>>a>>b;
  if(a>b){
    cout<<"Yes, you can enter.";
  }
  else if (a==b){
    cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else
  {
    cout<<"Sorry, you can't enter";
  }
    return 0;
}