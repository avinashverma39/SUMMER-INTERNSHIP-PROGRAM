package DAY_12;

public class binarySearch 
{
    public static void main(String[] args) 
    {
       int a[] = {10,20,30,40,50};
       int tar = 40;
       int s = 0;
       int e = a.length;
       while(s <= e)
       {
        int m = (s + e)/2; //mid
        if(a[m] == tar) 
            {System.out.println("index : " + m);
              break;}
        else if(a[m] < tar)
            s = m + 1;
            else
            e = m - 1;
       }

    }



    
}
