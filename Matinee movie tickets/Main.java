#include<iostream>
using namespace std;
int main()
{	int age;
 	float time;
 	cin>>age>>time;

	if (time == float(13.30)){
      if(age<=13){
      cout<<"$2.00";
      }
      else{
      cout<<"$5.00";
      }
    }
      
  	else{
    if(age<=13){
      cout<<"$4.00";
      }
      else{
      cout<<"$8.00";
      }
    }
    
}