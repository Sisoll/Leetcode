package easy;


/*
 * 
 * Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 * 
 * */
public class E0013_Roman2Int
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		

		romanToInt("III");
	}
    public  static int romanToInt(String s) {
    	
    	int ans=0;
    	boolean posV = false , posL = false , posD = false;
    	
    	char [] rom =s.toCharArray() ;

    	for (int i=0 ; i<rom.length ; i++)
    	{
    		if (rom[i] == 'V')
    		{
    			ans += 5;
    			posV = true;
    		}
    		else if (rom[i] == 'L')
    		{
    			ans += 50;
    			posL = true;
    		}
       		else if (rom[i] == 'D')
    		{
    			ans += 500;
    			posD = true;
    		}   	   		
    	}
    	
    	if ( posV || posL || posD)
    	{
    		for (int i=0 ; i<rom.length ; i++)
    		{
        		if (rom[i] == 'I')
        		{
        			ans += 5;
        		}
    			
    			
    			
    		}
    	}
    	
    	
		return ans;	
    }

	
}
