package leetcodes;

import java.util.Stack;

public class parenthesis {
	
	private static int x;
	private static char check;

	//private int x;
	//private char check;

	public static boolean isValid(String s)
	{	
	/*{	Stack stack = new Stack();
		for(int i=0;i<s.length();i++)
		{
			char x= s.charAt(i);
			if(x=='(' || x=='{'||  x=='[')
			{
				stack.push(x);
				continue;
			}
		     if(stack.isEmpty()) return false;
		     char check;
		
		
		switch(x)
		{
		case ')':
			check = (char) stack.pop();
			if(check=='{'||check=='[') return false;
			break;
			
		case '}':
			check = (char) stack.pop();
			if(check=='('||check=='[') return false;
			break;
			
		case ']':
			check = (char) stack.pop();
			if(check=='{'||check==')') return false;
			break;
		}
	}

      return(stack.isEmpty());
	}
	public static void main(String[] args) {
		String s="()({[}])";
		if(isValid(s))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		
	}
*/

		Stack stack =new Stack();
		for(int i=0;i<s.length();i++)
		{
			char x=s.charAt(i);
			if(x =='(' || x=='{' || x=='[')
			{
				stack.push(x);
				continue;
			}
			if(stack.isEmpty()) return false;
			char check;
		
		switch(x)
		{
		case ')':
			 check = (char) stack.pop();
			 if(check=='{' || check == '[') return false;
			 break;
			 
		case '}':
			 check = (char) stack.pop();
			 if(check=='(' || check == '[') return false;
			 break;

		case ']':
			 check = (char) stack.pop();
			 if(check=='{' || check == '(') return false;
			 break;

		}
	}
	return (stack.isEmpty());
}
	public static void main(String[] args) {
		String s="()({})";
		if(isValid(s))
		{
			System.out.println("True");
		}else
		{
			System.out.println("False");
		}
	}
}