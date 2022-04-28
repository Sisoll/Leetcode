package easy;

/*
 * https://leetcode.com/problems/roman-to-integer/
 * Symbol       Value
I             1
V             5 - 
X             10
L             50  - 
C             100
D             500  - 
M             1000
 * 
 * */
public class E0013_Roman2Int
{

	public static void main(String[] args)
	{
		// System.out.println(romanToInt("IX"));
	}
    public  static int romanToInt(String s) {
    	
    	var ans = 0;
    	
    	var posV = 0; 
    	var posL = 0; 
    	var posD = 0;
    	
    	char [] rom =s.toCharArray() ;
    	
    	for (var i=0 ; i<rom.length ; i++)
    	{
    		if (rom[i] == 'V')
    		{
    			ans += 5;
    			posV = i;
    		}
    		else if (rom[i] == 'L')
    		{
    			ans += 50;
    			posL = i;
    		}
       		else if (rom[i] == 'D')
    		{
    			ans += 500;
    			posD = i;
    		}   	   
       		else if (rom[i] == 'M')
       		{
       			ans += 1000;
       		}
    	}
    	
    	for (var i=0 ; i<rom.length ; i++)
    	{
    		while (rom[i] == 'I')
    		{
    			if (posV > i || i+1 <rom.length && rom[i+1] == 'X')
    			{
    				ans -= 1;
        			System.out.println("here"); 
    			}
    			else 
    			{
    				ans +=1 ;
    			}
    			break;
    		}

    		while (rom[i] == 'X' )
    		{
    			if (posL > i || i+1 < rom.length && rom[i+1] =='C' )
    			{
    				ans -= 10;
    			}
    			else 
    			{
    				ans +=10 ;
    			}
    			break;
    		}
    		
    		while (rom[i] == 'C' )
    		{
    			if (posD > i || i+1 < rom.length && rom[i+1] == 'M')
    			{
    				ans -= 100;
    			}
    			else 
    			{
    				ans +=100 ;
    			}
    			break;
    		}    	
    	}
    	
		return ans;	
    }

	
}
