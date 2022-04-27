package easy;

// Q:判斷 整數x是否是反向數 (前面看過去和後面看過的值相同) 
// https://leetcode.com/problems/palindrome-number/
//
// hint:一定是false的狀態: 負數 , 尾數是0
// 大神解：https://www.code-recipe.com/post/palindrome-number


public class E9_Palindrome
{

	public static void main(String[] args)
	{

		System.out.println(isPalindrome(1111122222));
		//System.out.println(Math.pow(2,30) - 100030001 );
	}

    public static boolean  isPalindrome(int x) {
        
        boolean isPalindrome0 = true ; 

        if (x >0 && x%10!=0)     //  log0是趨近於0,在比較時會被當成不存在;且尾數0一定不可能為對稱(只有"0"),故直接排除放到else裡面
        {
            int step = (int)Math.log10(x) +1;  // 算出x有幾位數,少了+1會只有是10的n次方

            int [] xnum = new int [(step)];

            for (int i = 0 ; i<step ; i++) 
            {
                int j = step - 1 - i;
                xnum[i] =  ( x / (int)Math.pow(10,j) );
                x = x - xnum[i] * (int)Math.pow(10,j);
            }
           
            for (int i = 0 ; i < step/2 ; i++)
            {
                if (xnum[i] != xnum[ (step-1-i) ])
                {
                    isPalindrome0 = false;
                    break;
                }
            }  
         
        }
        else if (x == 0)
        {
             isPalindrome0 = true ; 
        }
        else
        {
             isPalindrome0 = false ; 
        }
            
    return isPalindrome0 ;    
    }
}
    


