//https://practice.geeksforgeeks.org/problems/reverse-a-string/1#

string reverseWord(string str){
     char s=0,e=str.size()-1,m; 
        for(int i=0;i<e;i++,e--)
        {
            m=str[i];
            str[i]=str[e];
            str[e]=m; 
        }
       return str;
}