#include<bits/stdc++.h>
using namespace std;

int main()
{   
    int a,b,c;
    cin>>a>>b>>c;
    if(a>b)
    {
        if(b>c || c<a)
            cout<<"a="<<a;
        else if(c>a)
            cout<<"c="<<c;
       
        
    }
    else
    {
        if(b>c)
            cout<<"b="<<b;
        else
            cout<<"c="<<c;
    }
    return 0;

}