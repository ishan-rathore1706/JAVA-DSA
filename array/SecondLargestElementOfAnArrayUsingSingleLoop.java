package array;

public class SecondLargestElementOfAnArrayUsingSingleLoop {
    
    
    public static void main(String[] args) {
        
        int a[]={83,45,83,23,83,5,2,8,7};
     int max=Integer.MIN_VALUE;
     int max2=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
                max=a[i];
   
            
            
        }
        
      
    }
}
