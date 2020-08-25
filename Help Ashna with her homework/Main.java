#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int a,b,sum,sub,mul,quo,rem;
  cin>>a;
    cin>>b;
  sum = a+b;
  sub = a-b;
	mul = a*b;
	quo = a/b;
	rem = a%b;
    cout <<"a+b="<<sum<<"\na-b="<<sub<<"\na*b="<<mul<<"\na/b="<<quo<<"\na%b="<<rem;
    return 0;
}