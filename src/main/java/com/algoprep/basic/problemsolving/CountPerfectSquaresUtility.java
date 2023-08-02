package com.algoprep.basic.problemsolving;

public class CountPerfectSquaresUtility {

    public static int countPerfectSquareNumber(int num)
    {
        int j,count=0;
   for(int i=1;i<num;i++)
   {
       j=i*i;
       if(j<num)
       {
           count++;
       }
   }
   return count;
    }
}
