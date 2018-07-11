/*
  Author : Farhad
*/
#include<bits/stdc++.h>
using namespace std;
#define flash ios_base::sync_with_stdio(false);cin.tie(0);
int MX=-1;
struct trie{
    bool endmark;
    trie *next[4];
    int pr=0;
    trie()
    {
        endmark=false;
        pr=0;
        for(int i=0;i<4;i++)
        {
            next[i]=NULL;
        }
    }
} *root;
void in(string ss)
{
    trie *curr = root;
    char ch;
    int id;
    for(int i=0;i<ss.size();i++)
    {
        if(ss[i]=='A') id=0;
        else if(ss[i]=='C') id=1;
        else if(ss[i]=='G') id=2;
        else if(ss[i]=='T') id=3;
        if(curr->next[id]==NULL)
        {
            curr->next[id] = new trie();
        }
        curr->next[id]->pr++;
        if(curr->next[id]->pr*(i+1)>MX){MX=curr->next[id]->pr*(i+1);}
        curr = curr->next[id];
    }
    curr->endmark=1;
}
int srch(string ss)
{
    int cnt=0,id;
    trie *prev,*curr = root;
    for(int i=0;i<ss.size();i++)
    {
        if(ss[i]=='A') id=0;
        else if(ss[i]=='C') id=1;
        else if(ss[i]=='G') id=2;
        else if(ss[i]=='T') id=3;
        if(curr->next[id]==NULL) {return 0;}
        //prev=curr;
        curr = curr->next[id];
 
    }
    cnt=curr->pr;
    return cnt;
}
void dl(trie *curr)
{
    for(int i=0;i<4;i++)
        if(curr->next[i]) dl(curr->next[i]);
    delete (curr);
}
int main ()
{
    //flash;
    int t,n;
    cin>>t;
    for(int k=1;k<=t;k++)
    {
        MX=-1;
        root = new trie();
        //cout<<root<<endl;
        int flg=0,mn=500;
        cin>>n;
        string ss[n],tmp,aww;
        for(int i=0;i<n;i++)
        {
            cin>>ss[i];
            int l = ss[i].size();
            if(l<mn) {aww=ss[i];mn=l;}
            in(ss[i]);
        }
        //sort(ss,ss+n);
        cout<<"Case "<<k<<": ";
        /*for(int j=0;j<n;j++)
        {
 
 
                for(int i=0;i<ss[j].size();i++)
            {
                tmp = ss[j].substr(0,mn-i);
                //mn--;
                //cout<<"Searching for \n"<<tmp<<"\t";
                //cout<<"Length : "<<tmp.length()<<endl;
                int aw= srch(tmp)*(tmp.length());
                flg=max(aw,flg);
                //cout<<"Ans : "<<aw<<"\t"<<"Max so far : "<<flg<<endl;
            }
        }*/
        cout<<MX<<"\n";
        dl(root);
    }
 
}
