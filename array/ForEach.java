package array;
class ForEach
{
    public static void main(String[] args) {
        {
          int a[]={1,2,3,4,5,6,7,8,9,10};
      
          for(int ele : a)
          {
            ele*=2; //It does not change the original array but rather creates a copy 
          }
           for(int ele : a)   
                      {
            System.out.println(ele);  //it is used to print elelments or traverse data structue
          }
        }
    }
}