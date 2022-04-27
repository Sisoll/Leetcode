package easy;

//Q 
//https://leetcode.com/problems/two-sum/

import java.util.Arrays;

public class E1_TwoSum
{

	public static void main (String[] arge)
	{
		 int[] num =  {1,2,3,4,8} ;
		 int tar = 7;
		 
		 int [] ans  = twoSum (num , tar) ;
		 
		 System.out.println( Arrays.toString(ans)) ;
		 
	}	
		
	public static int[] twoSum(int[] nums, int target) 
    {    
        int [] target0 = new int [2];
        
        outer:
        for (int i=0;i<nums.length;i++)
        {
            for (int j=i+1 ; j<nums.length ; j++)
            {
                if (nums[i] + nums[j] == target)
                {   
                    target0[0] = i;
                    target0[1] = j;
                    break outer;
                } 
            }
        }
        return target0;
    }
}    
	