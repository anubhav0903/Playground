#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int principal,rate,time,intrest,amount;
  cin>>principal>>rate>>time;
  
  intrest=(principal*rate*time)/100;
  cout<<intrest;
  
  amount = intrest+principal;
  cout<<"\n"<<amount;
  
  float discount,lastprice;
  discount =(float) intrest*2/100;
 //cout<<fixed;
  cout<<"\n"<<discount;
  
  lastprice=amount-discount;
  cout<<"\n"<<lastprice; 
}