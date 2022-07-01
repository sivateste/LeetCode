package leetcodes;

import java.util.HashMap;
//import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
	
	public static int romanToInt(String s)
	{
	if(s==null ||s.length()==0) return 0;
	
		 Map<Character,Integer> map =new HashMap<>();
	        map.put('I',1);
	        map.put('V',5);
	        map.put('X',10);
	        map.put('L',50);
	        map.put('C',100);
	        map.put('D',500);
	        map.put('M',1000);
	        
	        int result = map.get(s.charAt(s.length()-1));
	        for(int i=s.length()-2;i>=0;i--)
	            {
	                if(map.get(s.charAt(i)>=map.get(charAt(i+1)) ) )
	                   
	                {
	                    result -=map.get(s.charAt(i)); 
	                }else
	                {
	                     result +=map.get(s.charAt(i));
	                }
	            }
	        return result;
	    }

		private static Object charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

		public static void main(String[] args) {
			String s= "MC";
			int result=romanToInt(s);
			System.out.println(s);
		}
	}


