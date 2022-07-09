#https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1/?page=1&difficulty[]=-1&category[]=Arrays&sortBy=submissions#

// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
      int s=0,e=n-1;
      while(s<=e)
      {
          int mid=(s+e)/2;
          if(arr[mid]==k)
          {
              return mid;
          }
          else if(arr[mid]>k)
          {
            e= mid-1;
          }
          else
          {
              s=mid+1;
          }
      }
      return -1;
    }
}