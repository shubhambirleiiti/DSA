// logic for reverse a string
//https://practice.geeksforgeeks.org/problems/reverse-a-string/1

class Reverse
{
    // Complete the function
    // str: input strin

    public static String reverseWord(String str)
    {   String rev="";
       for(int i =str.length()-1;i>=0;i--)
       {
           rev+=str.charAt(i);
       }
       return rev;
    }
}