#include<iostream>
using namespace std;
int main()
{
  int yob;
  int cuy;
  cin>>yob>>cuy;
  int x;
 if(yob>cuy){
   cuy+=100;
   x=cuy-yob;
   cout<<x;
 }
 else{
   x=cuy-yob;
   cout<<x;}
 
  
  //Type your code here.
}