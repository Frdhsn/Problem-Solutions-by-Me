/*   Problem link: https://www.hackerrank.com/challenges/overload-operators/problem
**************************************
**   Problem credit: Hackerrank     **
**   Solution by: Farhad,IIT,JU(46) **
**   8.03.18                        **
**   3.21 am                        **
**************************************/
#include<iostream>

using namespace std;

class Complex
{
public:
    int a,b;
    void input(string s)
    {
        int v1=0;
        int i=0;
        while(s[i]!='+')
        {
            v1=v1*10+s[i]-'0';
            i++;
        }
        while(s[i]==' ' || s[i]=='+'||s[i]=='i')
        {
            i++;
        }
        int v2=0;
        while(i<s.length())
        {
            v2=v2*10+s[i]-'0';
            i++;
        }
        a=v1;
        b=v2;
    }
};

Complex operator + (const Complex B,const Complex C){  // can also call by reference with Complex &B
    Complex A;
    A.a = B.a + C.a;
    A.b = B.b + C.b;
    return A;
}
// the following overloads output stream that's why the return type is "ostream"
ostream& operator << (ostream& str,const Complex B){  // can also call by reference with Complex &B
    str<<B.a<<"+i"<<B.b;
    return str;
}
int main()
{
    Complex x,y;
    string s1,s2;
    cin>>s1;
    cin>>s2;
    x.input(s1);
    y.input(s2);
    Complex z=x+y;  //+ should add two complex numbers as (a+ib) + (c+id) = (a+c) + i(b+d)
    cout<<z<<endl;  //<< should print a complex number in the format "a+ib"
}
/*
This is actually a solution of a hackerrank problem.
Problem link: https://www.hackerrank.com/challenges/overload-operators/problem
*/
