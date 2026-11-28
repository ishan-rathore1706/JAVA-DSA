package array;

import java.util.Arrays;

public class Rotate {
    
     public static void main(String[] args) {
        
     int nums[]={1,2,3,4,5,6,7};
     
        int []b=Arrays.copyOf(nums,nums.length);
      
      
  int n=nums.length;
    int k=3;int m=1;
  for (int j2 = 1; j2 <=k; j2++) {
    
 int i=1,j=2;
     
      while(i<n)
    {
        nums[n-i]=nums[n-j];
        nums[n-j]=b[n-i];
        i++;
        j++;
        
    }
      nums[0]=b[n-m];
      m++;
}
  
    System.out.println("Rotated array");
    for(int ele: nums)
    { 
        System.out.print(ele+" ");
    }
}}

