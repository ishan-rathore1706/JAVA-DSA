package array;

public class Segregate0sAnd1s {
    
    public static void main(String[] args) {
    int a[]={0,1,0,1,0,0,1,1,1,0};
   int z=0;
   for (int i = 0; i < a.length; i++) {
     if(a[i]==0)
    z++;

     
   }
   int p=0;
   for (int i = 0; i < a.length; i++) {
      if(p<z)
        a[i]=0;

      else
        a[i]=1;

      p++;
   }
   for(int ele:a)
   {
    System.out.print(ele+" ");
   }
    }
    }

