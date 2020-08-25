#include<iostream>
using namespace std;
int main()
{	int flipcart,  shipf;
 	int snapdeal,  ships;
 	int amazon,  shipa;
 	float discf,diss,disa;
 	cin>>flipcart>> discf>> shipf>>snapdeal>>diss>> ships>> amazon>> disa>>shipa;
 	int x,y,z;
 
 	x=(flipcart*((100-discf)/100))+shipf;
 	y=(snapdeal*((100-diss)/100))+ships;
 	z=(amazon*((100-disa)/100))+shipa;
 
 	cout<<"In Flipkart Rs."<<x<<"\n";
 	cout<<"In Snapdeal Rs."<<y<<"\n";
 	cout<<"In Amazon Rs."<<z<<"\n";
 
 	if (x<=y && x<=z){
      cout<<"He will prefer Flipkart";
    }
 	
 	else if (y<=x && y<=z){
      cout<<"He will prefer Snapdeal";
    }
 	else if (z<=x && z<=y){
      cout<<"He will prefer Amazon";
    }
 
  //Type your code here.
}