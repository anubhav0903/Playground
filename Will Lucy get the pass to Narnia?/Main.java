#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int a,b,c;
  cin>>a>>b>>c;
  switch(c){
    case 1:
  cout<<"Enter first number : Enter second number : Menu\n1.Addition\n2.Subtraction\n";
  cout<<"3.Multiplication\n4.Division\n5.Remainder\n";
      cout<<a+b;
      break;
    case 2:
  cout<<"Enter first number : Enter second number : Menu\n1.Addition\n2.Subtraction\n";
  cout<<"3.Multiplication\n4.Division\n5.Remainder\n";
      cout<<a-b;
      break;
    case 3:
 cout<<"Enter first number : Enter second number : Menu\n1.Addition\n2.Subtraction\n";
  cout<<"3.Multiplication\n4.Division\n5.Remainder\n";
      cout<<a*b;
      break;
    case 4:
 cout<<"Enter first number : Enter second number : Menu\n1.Addition\n2.Subtraction\n";
  cout<<"3.Multiplication\n4.Division\n5.Remainder\n";
      cout<<a/b;
    case 5:
 cout<<"Enter first number : Enter second number : Menu\n1.Addition\n2.Subtraction\n";
  cout<<"3.Multiplication\n4.Division\n5.Remainder\n";
      cout<<a%b;
      break;
    default:
cout<<"Enter first number : Enter second number : Menu\n1.Addition\n2.Subtraction\n";
  cout<<"3.Multiplication\n4.Division\n5.Remainder\n";
      cout<<"Invalid operation";
  }
    return 0;
}